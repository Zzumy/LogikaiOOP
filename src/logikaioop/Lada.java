package logikaioop;

import java.util.Objects;

public final class Lada {

    private String allitas, anyag;
    private boolean kincs;

    public Lada(String allitas) {
        setAllitas(allitas);
        setAnyag(anyag);
        setKincs(kincs);
    }

    public Lada(String allitas, String anyag) {
        setAllitas(allitas);
        setAnyag(anyag);
        setKincs(kincs);
    }

    public Lada(String allitas, String anyag, boolean kincs) {
        setAllitas(allitas);
        setAnyag(anyag);
        setKincs(kincs);
    }

    public String getAllitas() {
        return allitas;
    }

    public String getAnyag() {
        return anyag;
    }

    public boolean isKincs() {
        return kincs;
    }

    public void setAllitas(String allitas) {
        this.allitas = allitas;
    }

    public void setAnyag(String anyag) {
        this.anyag = anyag;
    }

    public void setKincs(boolean kincs) {
        this.kincs = kincs;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.allitas);
        return hash;
    }

    @Override
    public String toString() {
        return "Lada{" + "allitas=" + allitas + ", anyag=" + anyag + ", kincs=" + kincs + '}';
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
        if (this.kincs != other.kincs) {
            return false;
        }
        if (!Objects.equals(this.allitas, other.allitas)) {
            return false;
        }
        return Objects.equals(this.anyag, other.anyag);
    }

}
