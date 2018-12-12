package com.onway.baib.core.annotation.model;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ����������ע�⣬�ڷ���ʱ���ܻ�ȡ��Ӧ����Ϣ�����Ը���ע����Ϣ����У��
 * 
 * @author wwf
 * @version $Id: FieldMeta.java, v 0.1 2016��8��1�� ����11:55:47 wwf Exp $
 */
@Retention(RetentionPolicy.RUNTIME)
// ע�����class�ֽ����ļ��д��ڣ�������ʱ����ͨ�������ȡ��  
@Target({ ElementType.FIELD, ElementType.METHOD })
//����ע�������Ŀ��**���÷�Χ�ֶΡ�ö�ٵĳ���/����  
@Documented
//˵����ע�⽫��������javadoc�� 
public @interface FieldMeta {

    /** 
     * �ֶ��Ƿ����Ϊ���ж�
     * @return true:��ʾ����Ϊ�գ�false:��ʾ����Ϊ��
     */
    boolean notnull() default false;

    /** 
     * �ֶ����� 
     * @return 
     */
    String description() default "";

    /**
     * �ֶ����ĳ���
     * 
     * @return
     */
    int maxlength() default 32;

    /**
     * Ĭ��ֵ
     * 
     * @return
     */
    String defaultVal() default "";

    /**
     * �ò�����Ӧģ������ֶ�
     * 
     * @return
     */
    String modelField() default "";

    /**
     * ö���������������ö���ࡿ
     */
    String returnClass() default "";

    /**
     * �Ƿ���ǰ̨�б���չʾ
     * 
     * @return true չʾ ;false ��չʾ
     */
    boolean showOrNot() default false;

    /**
     * �Ƿ���ǰ̨�б���չʾ
     * 
     * @return true չʾ ;false ��չʾ
     */
    boolean formShowOrNot() default true;

    /**
     * ��������ҳ�е�����
     * 
     * @return
     */
    String dataWebType() default "text";
}
