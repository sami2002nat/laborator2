package org.example;

public class Results {

    String titluCarte;
    Integer numarPagina;

    public Results(String titluCarte, Integer numarPagina) {
        this.titluCarte = titluCarte;
        this.numarPagina = numarPagina;
    }

    public String getTitluCarte() {
        return titluCarte;
    }

    public void setTitluCarte(String titluCarte) {
        this.titluCarte = titluCarte;
    }

    public Integer getNumarPagina() {
        return numarPagina;
    }

    public void setNumarPagina(Integer numarPagina) {
        this.numarPagina = numarPagina;
    }
}
