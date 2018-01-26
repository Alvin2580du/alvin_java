package per.alvin.Java.Javastudy;


public class Stringinjava {

    public static void main(String[] args) {
        String a = "test";
        String b = a;                //b保存了a的引用
        String c;
        float res;
        //这里编译器会为我们自动创建StringBuilder对象，并调用append方法，
        //最终调用StringBuilder的toString方法返回一个新的字符串对象
        a = a + "1" + "2" + "3";    //生成了一个新的String对象赋给a
        c = "ssassd";

        System.out.println(c.length());
        String d;
        d = c.replace("s", "d");
        System.out.println(d);
        System.out.println(c.codePointAt(2));

        System.out.println(b == a);    //引用a指向了新的字符串对象，不相等
        System.out.println(a);
        System.out.println(c);
        System.out.println("==============================");
        constantdemo();
        res = add(2, 3);
        System.out.println(res);
        System.out.println("==============================");

        System.out.println(4);
        System.out.println(64);
        System.out.println(100);
        System.out.println(256);
//        array2sum();

    }

    private static void constantdemo() {
        System.out.println("HelloWorld");
        System.out.println(100);
        System.out.println(12.345D);
        System.out.println('A');
        System.out.println('1');
        System.out.println(true);
        System.out.println(false);
    }

    private static float add(float x, float y) {
        float res;
        res = x + y;
        return res;
    }
}
