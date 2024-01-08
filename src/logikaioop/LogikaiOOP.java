package logikaioop;

public class LogikaiOOP {

    public static void main(String[] args) {
        Lada[] allitasok = new Lada[3];
        allitasok[0] = new Lada("Az 1. állítás!");
        allitasok[1] = new Lada("A 2. állítás!");
        allitasok[2] = new Lada("A 3. állítás!");

        System.out.println("Leírás");
        for (Lada allitas : allitasok) {
            System.out.println(allitas.getAllitas());
        }
        System.out.println("Melyik:");
        System.out.println("A válasz jó | rossz");
    }

}
