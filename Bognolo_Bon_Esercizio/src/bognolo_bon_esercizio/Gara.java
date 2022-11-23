package bognolo_bon_esercizio;

public class Gara {
    protected int data;
    protected int oraInizio;
    protected String pisteDisponibili[];
    protected String atleti[];

    public Gara() {
    }

    public Gara(int data, int oraInizio, String[] pisteDisponibili, String[] atleti) {
        this.data = data;
        this.oraInizio = oraInizio;
        this.pisteDisponibili = pisteDisponibili;
        this.atleti = atleti;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getOraInizio() {
        return oraInizio;
    }

    public void setOraInizio(int oraInizio) {
        this.oraInizio = oraInizio;
    }

    public String[] getPisteDisponibili() {
        return pisteDisponibili;
    }

    public void setPisteDisponibili(String[] pisteDisponibili) {
        this.pisteDisponibili = pisteDisponibili;
    }

    public String[] getAtleti() {
        return atleti;
    }

    public void setAtleti(String[] atleti) {
        this.atleti = atleti;
    }

    @Override
    public String toString() {
        return "la gara di data " + data + "è iniziata " + oraInizio;
    }
    //commento
}
