package bognolo_bon_esercizio;

public class Gara {
    protected int data;
    protected int oraInizio;
    protected Pista pisteDisponibili[];
    protected String atleti[];

    public Gara(){
        
        Pista p1=new Pista(1,"Buono",3,2);
        Pista p2=new Pista(2,"Medio",3.2,3);
        Pista p3=new Pista(3,"Male",6,1);
        pisteDisponibili=new Pista[3];
        
            pisteDisponibili[0]=p1;
            pisteDisponibili[1]=p2;
            pisteDisponibili[2]=p3;
    }

    public Gara(int data, int oraInizio, Pista[] pisteDisponibili, String[] atleti) {
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
    
}
