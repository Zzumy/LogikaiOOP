package logikaioop;

import java.util.Objects;

public final class Allitas {
    private String allitas;

    public Allitas(String allitas) {
        setAllitas(allitas);
    }

    public String getAllitas() {
        return allitas;
    }

    public void setAllitas(String allitas) {
        this.allitas = allitas;
    }

    @Override
    public String toString() {
        return "Allitas{" + "allitas=" + allitas + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.allitas);
        return hash;
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
        return Objects.equals(this.allitas, other.allitas);
    }
    
    
}
