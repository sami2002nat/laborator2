package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Carte {

    public String titlu;
    public String autor;

    public ArrayList<Pagina> pagini = new ArrayList<>();
    Map<Integer,Pagina> paginiCarte= new HashMap<Integer,Pagina>();
    public Carte(String titlu, String autor) {
        this.titlu = titlu;
        this.autor = autor;
    }

    public void adaugaPagina(Pagina pagina){
        pagini.add(pagina);
        paginiCarte.put(pagina.nrPag,pagina);
    }

    public void afiseazaDetaliiCarte() {
        System.out.println("Titlul cartii: " + titlu);
        for (Pagina pagina : pagini) {
            System.out.println("Pagina " + pagina.nrPag + ": " + pagina.continut);
        }}


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
