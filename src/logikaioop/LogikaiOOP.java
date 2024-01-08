package logikaioop;

public class LogikaiOOP {
    
    static Adatbeker be= new Adatbeker();
    Lada[] allitasok = new Lada[3];
    
    public LogikaiOOP() {
        allitasok[0] = new Lada("Az 1. állítás!");
        allitasok[1] = new Lada("A 2. állítás!");
        allitasok[2] = new Lada("A 3. állítás!");
    }
    
    public static void main(String[] args) {
        new LogikaiOOP().feladat();
    }

    private void feladat() {
        allitasKiir();
        kerdez();
    }

    private void allitasKiir() {
        System.out.println("Leírás");
        for (Lada allitas : allitasok) {
            System.out.println(allitas.getAllitas());
        }
    }

    private void kerdez() {
        System.out.print("Melyik:");
        String szoveg= be.szovegBeker();
        if (eredmenyjelzes(szoveg)) {
            System.out.println("A válasz jó");
        } else {
            System.out.println("A válasz rossz");
        }
    }

    public boolean eredmenyjelzes(String valasz) {
        return valasz.equals("sus");
    }
}
