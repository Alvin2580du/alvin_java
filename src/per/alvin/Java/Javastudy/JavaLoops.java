package per.alvin.Java.Javastudy;

public class JavaLoops {
    public static void main(String args[]) {
        Whileloops w = new Whileloops();
        Dowhile d = new Dowhile();
        Forloops f = new Forloops();
        w.whileloops();
        System.out.println("============================");
        d.dowhile();
        System.out.println("============================");
        f.forloops();
        System.out.println("============================");

        Breakstate b = new Breakstate();
        b.breakstate();
        System.out.println("============================");
        Continuestate c = new Continuestate();
        c.continuestate();

    }
}

class Whileloops{
    public static void whileloops(){
        int x = 10;
        while (x<20){
            System.out.println("x : " + x);
            x++;
        }
    }
}

class Dowhile {
    public static void dowhile() {
        int x = 10;

        do{
            System.out.print("x : " + x );
            x++;
            System.out.print("\n");
        }while( x < 20 );
    }
}

class Forloops{
    public static void forloops(){
        for(int x = 10; x < 20; x = x+1) {
            System.out.print("x : " + x );
            System.out.print("\n");
        }
    }
}


class Breakstate {
    public static void breakstate() {
        int [] numbers = {10, 20, 30, 40, 50};

        for(int x : numbers ) {
            // x 等于 30 时跳出循环
            if( x == 30 ) {
                break;
            }
            System.out.print( x );
            System.out.print("\n");
        }
    }
}

class Continuestate {
    public static void continuestate() {
        int [] numbers = {10, 20, 30, 40, 50};

        for(int x : numbers ) {
            if( x == 30 ) {
                continue;
            }
            System.out.print( x );
            System.out.print("\n");
        }
    }
}
