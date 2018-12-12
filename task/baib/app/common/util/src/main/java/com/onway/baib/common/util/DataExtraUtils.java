package com.onway.baib.common.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import com.onway.common.lang.DateUtils;

public class DataExtraUtils extends DateUtils{
    
    
    public static void main(String[] args) {
        System.out.println(isInMonth(new Date()));
    }
    
    
    public static boolean isInMonth(Date date){
        
       String now= format(date, webFormat);
       
       String firstDay=getMouthFirstDay();
       
       String lastDay=getMouthLastDay();
       
       if(now.compareTo(firstDay)<0||now.compareTo(lastDay)>0){
           return false;
       }
        
        return true;
        
    }
    
    public static String getMouthFirstDay(){
      //�涨�������ڸ�ʽ
      SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
      Calendar calendar=Calendar.getInstance();
      Date theDate=calendar.getTime();
      GregorianCalendar gcLast=(GregorianCalendar)Calendar.getInstance();
      gcLast.setTime(theDate);
      //����Ϊ��һ��
      gcLast.set(Calendar.DAY_OF_MONTH, 1);
      String day_first=sf.format(gcLast.getTime());
      return day_first;
      }
    
    
      //2����ȡ�������һ��
      public static String getMouthLastDay(){
      //��ȡCalendar
      Calendar calendar=Calendar.getInstance();
      //��������Ϊ�����������
      calendar.set(Calendar.DATE, calendar.getActualMaximum(calendar.DATE));
      //�������ڸ�ʽ
      SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
      String ss=sf.format(calendar.getTime());
      return ss;
      }

}
