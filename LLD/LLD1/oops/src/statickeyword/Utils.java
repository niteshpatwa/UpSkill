package statickeyword;

public class Utils {
    static double PI = 3.142;

    void fun(){
        System.out.println("FUN");
    }

    // static method can only access static variables
    static void sfun(){
        System.out.println("SFUN");
    }
}
