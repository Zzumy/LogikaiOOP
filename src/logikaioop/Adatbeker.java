package logikaioop;

import java.util.Scanner;

public class Adatbeker {
    static Scanner sc;
    
    static{
        sc = new Scanner(System.in);
    }

    public Adatbeker() {
    }

    public static String szovegBeker() {
        return sc.next();
    }
    
    
}
