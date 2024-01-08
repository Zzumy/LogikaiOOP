package logikaioop;

import java.util.Objects;

public final class Lada {

    private String allitas, anyag;
    private boolean kincs;

    public Lada(String allitas) {
        this(allitas, "nincs");
    }

    public Lada(String allitas, String anyag) {
        this(allitas, anyag, false);
    }

    public Lada(String allitas, String anyag, boolean kincs) {
        setAllitas(allitas);
        setAnyag(anyag);
        setKincs(kincs);
    }

    public String getAllitas() {
        return allitas;
    }

    public void setAllitas(String allitas) {
        this.allitas = allitas;
    }

    public String getAnyag() {
        return anyag;
    }

    public boolean isKincs() {
        return kincs;
    }

    public void setAnyag(String anyag) {
        this.anyag = anyag;
    }

    public void setKincs(boolean kincs) {
        this.kincs = kincs;
    }

    @Override
    public String toString() {
        return "Lada{" + "allitas=" + allitas + ", anyag=" + anyag + ", kincs=" + kincs + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.allitas);
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
        final Lada other = (Lada) obj;
        return Objects.equals(this.allitas, other.allitas);
    }
}
