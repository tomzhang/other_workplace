package org.beetl.sql.test;

import javax.sql.DataSource;

import org.beetl.sql.core.ClasspathLoader;
import org.beetl.sql.core.ConnectionSource;
import org.beetl.sql.core.ConnectionSourceHelper;
import org.beetl.sql.core.Interceptor;
import org.beetl.sql.core.Params;
import org.beetl.sql.core.SQLLoader;
import org.beetl.sql.core.SQLManager;
import org.beetl.sql.core.UnderlinedNameConversion;
import org.beetl.sql.core.db.MySqlStyle;
import org.beetl.sql.ext.DebugInterceptor;

import com.zaxxer.hikari.HikariDataSource;

/**
 * 
 * @author xiandafu
 *
 */

public class QuickTest {
	
	public static void main(String[] args) throws Exception{
		
	    String javaVersion = System.getProperty("java.version");
	    System.out.println(javaVersion);
	    
//		DB2SqlStyle style = new DB2SqlStyle();
//		SqlServerStyle style = new SqlServerStyle();
//		SqlServer2012Style style = new SqlServer2012Style();
//		OracleStyle style = new OracleStyle();
		MySqlStyle style = new MySqlStyle();
//		PostgresStyle style = new PostgresStyle();
		ConnectionSource cs  = ConnectionSourceHelper.getSingle(datasource());
		
		SQLLoader loader = new ClasspathLoader("/org/beetl/sql/test");
		DebugInterceptor debug = new DebugInterceptor(QuickTest.class.getName());
		
		
		
		Interceptor[] inters = new Interceptor[]{ debug};
		final SQLManager 	sql = new SQLManager(style,loader,cs,new UnderlinedNameConversion(), inters);
//		sql.genPojoCodeToConsole("user", gen);
		sql.execute("select * from user where id=#id,jdbc='i'#", User.class, new Params().add("id", 1).map());

	}
	
	public static User unique(SQLManager sql,Object key){
		return sql.unique(User.class, key);
	}
	
	public static DataSource datasource() {
		HikariDataSource ds = new HikariDataSource();
		ds.setJdbcUrl(MysqlDBConfig.url);
		ds.setUsername(MysqlDBConfig.userName);
		ds.setPassword(MysqlDBConfig.password);
		ds.setDriverClassName(MysqlDBConfig.driver);
//		ds.setAutoCommit(false);
		return ds;
	}
	
	public static DataSource druidSource() {
		com.alibaba.druid.pool.DruidDataSource ds = new com.alibaba.druid.pool.DruidDataSource();
		ds.setUrl(MysqlDBConfig.url);
		ds.setUsername(MysqlDBConfig.userName);
		ds.setPassword(MysqlDBConfig.password);
		ds.setDriverClassName(MysqlDBConfig.driver);
		return ds;
	}
	
	
	
	
}



