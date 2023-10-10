package org.example;

public class Pagina {

    public int nrPag;
    public String continut;

    public Pagina(int nrPag, String continut) {
        this.nrPag = nrPag;
        this.continut = continut;
    }

    public boolean continut(String cuvant){
        return continut.contains(cuvant);
    }

    public int getNrPag() {
        return nrPag;
    }

    public void setNrPag(int nrPag) {
        this.nrPag = nrPag;
    }

    public String getContinut() {
        return continut;
    }

    public void setContinut(String continut) {
        this.continut = continut;
    }
}
