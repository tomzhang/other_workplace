package test;

import java.text.ParseException;
import java.util.Date;

import com.onway.common.lang.DateUtils;
import com.onway.common.lang.Money;

public class MoneyTest {
  public static void main(String[] args) throws ParseException {
    Money money=new Money(100);
    String money1=money.toSimpleString();
    System.out.println("-------"+money1);
    String cTime="2016-12-29 16:26:30";
    //�ж�ԤԼʱ��͵���ʱ��Աȣ�ԤԼʱ�������ڵ�ǰ���ڣ����򱨴�
    long diffDays=DateUtils.getDiffDays(DateUtils.parseDate(cTime, "yyyy-MM-dd"), new Date());
    if(diffDays<0){
        System.out.println("ԤԼʱ����Ч");
    }
}
}
