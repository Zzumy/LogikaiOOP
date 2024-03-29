package logikaioop;

public class LogikaiOOP {
    
    static Adatbeker be= new Adatbeker();
    Lada[] allitasok = new Lada[3];
    
    public LogikaiOOP() {//éln
        allitasok[0] = new Lada("én rejtem a kincset!", "arany");
        allitasok[1] = new Lada("nem én rejtem a kincset!", "ezüst", true);
        allitasok[2] = new Lada("az arany hazudik!", "bronz", false);
    }
    
    public static void main(String[] args) {
        new LogikaiOOP().feladat();
    }

    private void feladat() {
        allitasKiir();
        kerdez();
    }

    private void allitasKiir() {
        System.out.println("minden láda 1-1 állítást tartalmaz, csak az egyik igaz.");
        for (Lada allitas : allitasok) {
            System.out.println("\t"+allitas.getAnyag() +" láda: "+ allitas.getAllitas());
        }
    }

    private void kerdez() {
        System.out.println("Melyikben van a kincs?");
        if (eredmenyjelzes(be.szovegBeker())) {
            System.out.println("A válasz jó");
        } else {
            System.out.println("A válasz rossz");
        }
    }

    public boolean eredmenyjelzes(String valasz) {
        int ix=0;
        while(ix<allitasok.length && !(allitasok[ix].equals(valasz) && allitasok[ix].isKincs())){
            ix++;
        }
        return ix<allitasok.length;
    }
}
