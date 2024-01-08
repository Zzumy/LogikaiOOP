package logikaioop;

public class LogikaiOOP {

    public static void main(String[] args) {
        Allitas[] allitasok = new Allitas[3];
        allitasok[0] = new Allitas("Az 1. állítás!");
        allitasok[1] = new Allitas("A 2. állítás!");
        allitasok[2] = new Allitas("A 3. állítás!");

        System.out.println("Leírás");
        for (Allitas allitas : allitasok) {
            System.out.println(allitas);
        }
        System.out.println("Melyik:");
        System.out.println("A válasz jó | rossz");
    }

}
