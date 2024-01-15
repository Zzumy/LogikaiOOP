package view;

import java.util.Scanner;

public class View {

    static Scanner sc = new Scanner(System.in, "latin2");
    public View() {
        
    }
    
    private void allitasKiir(Object obj, String[] allitasok) {
        System.out.println("minden láda 1-1 állítást tartalmaz, csak az egyik igaz.");
        
        for (obj allitas : allitasok) {
            System.out.println("\t" + allitas.getAnyag() + " láda: " + allitas.getAllitas());
        }
    }

    private void kerdez() {
        System.out.println("Melyikben van a kincs?");
        if (eredmenyjelzes(sc.nextLine())) {
            System.out.println("A válasz jó");
        } else {
            System.out.println("A válasz rossz");
        }
    }
}
