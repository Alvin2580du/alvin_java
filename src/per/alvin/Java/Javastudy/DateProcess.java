package per.alvin.Java.Javastudy;

import java.util.Date;

public class DateProcess {
    public static void main(String args[]) {
        Date today = new Date();
        System.out.println(today);
        System.out.println(today.getTime());
        System.out.println(today.toString());
        System.out.println(today.clone());
    }
}
