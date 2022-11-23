/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bognolo_bon_esercizio;

public class Pista {
    protected int numero;
    protected String condizioni;
    protected double lunghezza;
    protected int nCorsie;
    public Pista(){}
    public Pista(int numero, String condizioni, double lunghezza, int nCorsie)
    {
        this.condizioni=condizioni;
        this.lunghezza=lunghezza;
        this.nCorsie=nCorsie;
        this.numero=numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCondizioni() {
        return condizioni;
    }

    public void setCondizioni(String condizioni) {
        this.condizioni = condizioni;
    }

    public double getLunghezza() {
        return lunghezza;
    }

    public void setLunghezza(double lunghezza) {
        this.lunghezza = lunghezza;
    }

    public int getnCorsie() {
        return nCorsie;
    }

    public void setnCorsie(int nCorsie) {
        this.nCorsie = nCorsie;
    }
}
