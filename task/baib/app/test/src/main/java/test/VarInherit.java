package test;

class Person {
    String name;        
    int age; // ����������Ա����        
    public Person(String name, int age) {   // �вι��췽��
    this.name = name;
    this.age = age; 
    System.out.println("������вι�������");
    }

    public Person() {       // �޲ι��췽��
    this.name = "person name";  
    this.age = 23;  
    System.out.println("������޲ι�������");
    }
    
    void pprint() {     // ��Ա��������ʱ��ʾ���Ǹ����г�Ա�����Ľ��
    System.out.println("class:Person;  " + "Name: " + this.name + ";  age: "+ this.age);
    }
}
class Student extends Person {  // ����Person�ඨ��Student����
      String name;      // ���������������Լ��ĳ�Ա����
      int age;
      int classno;      // �����³�Ա����
      public Student() {    // �޲ι��췽��
      this.name = "student name";    
      this.age = 20;
      System.out.println("������޲ι�������");
      }
      public Student(String name, int age, int classno) {// �вι��췽��
      this.name = name;
      this.age = age;
      this.classno = classno;
      System.out.println("������вι�������");
      }
      void sprint() {   // ��Ա��������ʱ��ʾ���������г�Ա�����Ľ��
      System.out.println("class:Student;  " + "Name: " + this.name + ";"
            + "  age: "+ this.age + "; " + "   "+ "   classno: " + this.classno);
      }
}


public class VarInherit {       // ����������
    public static void main(String[] args) {
           Student obj1 = new Student(); // �����޲ι��췽����������
           System.out.println("-----------"+obj1.name+"---"+obj1.age);
           System.out.println("--------------");
           Student obj2 = new Student("LiXiao", 18, 1); // �����вι��췽����������
           Person obj3 = new Person("guangzhu", 55);
           System.out.println("---/////////////--pprint");
            obj1.pprint();   
            obj2.pprint();  // ���ø���ĳ�Ա����
            System.out.println("/////////////---sprint");
            obj1.sprint();   
            obj2.sprint();  // ��������ĳ�Ա����
            
            obj3.pprint();
            System.out.println("/////////////");

    }
}