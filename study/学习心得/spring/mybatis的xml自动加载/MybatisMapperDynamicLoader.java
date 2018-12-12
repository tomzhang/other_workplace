package com.finace.miscroservice.user.controller;

import com.finace.miscroservice.user.dao.impl.UserDaoImpl;
import com.finace.miscroservice.user.po.UserPO;
import org.apache.ibatis.builder.xml.XMLMapperBuilder;
import org.apache.ibatis.executor.ErrorContext;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.*;

@RestController
public class MybatisMapperDynamicLoader implements InitializingBean, ApplicationContextAware {

    @Autowired
    UserDaoImpl userDao;

    @GetMapping("test")
    public UserPO get() {
        return userDao.getUserByUserPhone("13291859481");
    }

    private final HashMap<String, String> mappers = new HashMap<String, String>();
    private volatile ConfigurableApplicationContext context = null;
    private volatile Scanner scanner = null;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = (ConfigurableApplicationContext) applicationContext;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        try {
            scanner = new Scanner();
            new Timer(true).schedule(new TimerTask() {
                @Override
                public void run() {
                    try {
                        if (scanner.isChanged()) {
                            System.out.println("load mapper.xml");
                            scanner.reloadXML();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }, 10 * 1000, 5 * 1000);
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    class Scanner {
        private static final String XML_RESOURCE_PATTERN = ResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX + "**/*Mapper.xml";
        private final ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();

        public Scanner() throws IOException {
            Resource[] resources = findResource();
            if (resources != null) {
                for (Resource resource : resources) {
                    String key = resource.getURI().toString();
                    String value = getMd(resource);
                    mappers.put(key, value);
                }
            }
        }

        public void reloadXML() throws Exception {
            SqlSessionFactory factory = context.getBean(SqlSessionFactory.class);
            Configuration configuration = factory.getConfiguration();
            removeConfig(configuration);
            for (Resource resource : findResource()) {
                try {
                    System.out.println(resource.toString());
                    XMLMapperBuilder xmlMapperBuilder = new XMLMapperBuilder(resource.getInputStream(), configuration, resource.toString(), configuration.getSqlFragments());
                    xmlMapperBuilder.parse();
                } finally {
                    ErrorContext.instance().reset();
                }
            }
        }

        private void removeConfig(Configuration configuration) throws Exception {
            Class<?> classConfig = configuration.getClass();
            clearMap(classConfig, configuration, "mappedStatements");
            clearMap(classConfig, configuration, "caches");
            clearMap(classConfig, configuration, "resultMaps");
            clearMap(classConfig, configuration, "parameterMaps");
            clearMap(classConfig, configuration, "keyGenerators");
            clearMap(classConfig, configuration, "sqlFragments");
            clearSet(classConfig, configuration, "loadedResources");
        }

        private void clearMap(Class<?> classConfig, Configuration configuration, String fieldName) throws Exception {
            Field field = classConfig.getDeclaredField(fieldName);
            field.setAccessible(true);
            ((Map) field.get(configuration)).clear();
        }


        private void clearSet(Class<?> classConfig, Configuration configuration, String fieldName) throws Exception {
            Field field = classConfig.getDeclaredField(fieldName);
            field.setAccessible(true);
            ((Set) field.get(configuration)).clear();
        }

        public boolean isChanged() throws IOException {
            boolean isChanged = false;
            for (Resource resource : findResource()) {
                String key = resource.getURI().toString();
                String value = getMd(resource);
                if (!value.equals(mappers.get(key))) {
                    isChanged = true;
                    mappers.put(key, value);
                }
            }
            return isChanged;
        }

        private Resource[] findResource() throws IOException {
            return resourcePatternResolver.getResources(XML_RESOURCE_PATTERN);
        }

        private String getMd(Resource resource) throws IOException {
            return new StringBuilder().append(resource.contentLength()).append("-").append(resource.lastModified()).toString();
        }
    }

    public static void main(String[] args) throws IOException {
        String absolutePath = new File("E:\\fiance_miscroservice\\miscroservice_user\\out\\production\\resources\\userMapper\\AccountCashMapper.xml").getCanonicalPath();
        System.out.println(absolutePath);
    }
}