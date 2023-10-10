package org.example;

import java.util.ArrayList;

public class Carte {

    public String titlu;
    public String autor;

    public ArrayList<Pagina> pagini = new ArrayList<>();

    public Carte(String titlu, String autor) {
        this.titlu = titlu;
        this.autor = autor;
    }

    public void adaugaPagina(Pagina pagina){
        pagini.add(pagina);
    }

    public void afiseazaDetaliiCarte() {
        System.out.println("Titlul cartii: " + titlu);
        for (Pagina pagina : pagini) {
            System.out.println("Pagina " + pagina.nrPag + ": " + pagina.continut);
        }}

    public void cautaCuvant(String cuvant) {
        for (Pagina pagina : pagini) {
            if (pagina.continut(cuvant)) {
                System.out.println("Cuvantul " + cuvant + " a fost gasit in cartea " + titlu + " la pagina " + pagina.nrPag);
            }
        }
    }

    public String gasesteText(int numarPagina) {
        for (Pagina pagina : pagini) {
            if (pagina.nrPag == numarPagina) {
                return pagina.getContinut();
            }
        }
        return null;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public ArrayList<Pagina> getPagini() {
        return pagini;
    }

    public void setPagini(ArrayList<Pagina> pagini) {
        this.pagini = pagini;
    }
}
