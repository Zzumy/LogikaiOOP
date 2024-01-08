package logikaioop;

import java.util.Objects;

public class Allitas {

    private String szoveg;
    
    public Allitas(String szoveg) {
        this.szoveg=szoveg;
    }

    public String getSzoveg() {
        return szoveg;
    }

    public void setSzoveg(String szoveg) {
        this.szoveg = szoveg;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.szoveg);
        return hash;
    }

    @Override
    public String toString() {
        return getSzoveg();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Allitas other = (Allitas) obj;
        return Objects.equals(this.szoveg, other.szoveg);
    }

   
    
    
    
    
}
