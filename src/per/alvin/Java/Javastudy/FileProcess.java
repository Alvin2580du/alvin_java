package per.alvin.Java.Javastudy;

import java.io.*;
import java.nio.charset.Charset;

public class FileProcess {

    public static void main(String[] args) {
        File f = new File(".");
        Employee empOne = new Employee("RUNOOB");
        empOne.setSalary(1000);
        empOne.printEmp();
        System.out.println("==============================");
        try {

            InputStream in = new FileInputStream("src/java_learn/test.txt");
            InputStreamReader reader = new InputStreamReader(in, Charset.forName("utf-16"));

            char [] buf = new char[100];
            int length = reader.read(buf);
            System.out.println("the length is "+length);

            for (int i =0;i<length;i++){
                System.out.println("char [" + i + "] is " +buf[i]);
            }
            //getCanonicalPath
            System.out.println("the content is " + String.valueOf(buf, 0 ,length));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

class Employee{
    // 这个实例变量对子类可见
    String name;
    // 私有变量，仅在该类可见
    private double salary;
    //在构造器中对name赋值
    Employee (String empName){
        name = empName;
    }
    //设定salary的值
    void setSalary(double empSal){
        salary = empSal;
    }
    // 打印信息
    void printEmp(){
        System.out.println("名字 : " + name );
        System.out.println("薪水 : " + salary);
    }
}

class Demo_3
{
    public static void main(String[]args)
    {
        int sums=jiecheng(5);//函数调用
        System.out.println("5的阶乘为:"+sums);//打印结果
    }
    private static int jiecheng(int a)//自定义的求阶乘的函数
    {
        int sum=1;
        for(int i=1;i<=a;i++)//for循环 控制循环次数
        {
            sum*=i;
        }
        return sum;
    }
}