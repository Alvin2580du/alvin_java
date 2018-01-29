package per.alvin.Java.Javastudy;

public class Object_origin {
    public static void main(String[] args){
        String a = "a";
        Phone p = new Phone();
        String b;
        b = p.call(a);
        System.out.println(b);
        System.out.println("Or");
        System.out.println(p.call(a));
    }
}

class Phone{
    public String call(String name){
        return name + "_1";
    }
}