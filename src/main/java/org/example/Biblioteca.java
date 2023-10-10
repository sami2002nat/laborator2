package org.example;

import java.util.ArrayList;
import java.util.Comparator;

public class Biblioteca {

    public ArrayList<Carte> listaCarti = new ArrayList<>();

    public void adaugaCarte(Carte carte) {
        listaCarti.add(carte);
    }

    public ArrayList<Carte> getListaCarti() {
        return listaCarti;
    }

    public void setListaCarti(ArrayList<Carte> listaCarti) {
        this.listaCarti = listaCarti;
    }

    public void afiseazaCarti() {
        for (Carte carte : listaCarti) {
            carte.afiseazaDetaliiCarte();
            System.out.println();
        }
    }

    public void sortare() {
        listaCarti.sort(new Comparator<Carte>() {
            @Override
            public int compare(Carte carte1, Carte carte2) {
                int comparareAutor = carte1.getTitlu().compareTo(carte2.getTitlu());

                if (comparareAutor == 0) {
                    return carte1.getTitlu().compareTo(carte2.getTitlu());
                }
                return comparareAutor;
            }
        });
    }

    public void cautaCuvant(String cuvant) {
        for (Carte carte : listaCarti) {
            carte.cautaCuvant(cuvant);
        }
    }

    public void afiseazaContinut(String titluCarte, int numarPagina) {
        for (Carte carte : listaCarti) {
            if (carte.titlu.equals(titluCarte)) {
                String continutPagina = carte.gasesteText(numarPagina);
                if (continutPagina != null) {
                    System.out.println("Textul paginii " + numarPagina + " din cartea " + titluCarte + " este: " + continutPagina);
                } else {
                    System.out.println("Cartea " + titluCarte + " nu are pagina " + numarPagina);
                }
                return;
            }
        }
        System.out.println("Nu a fost gasita cartea cu titlul '" + titluCarte + "'");
    }

}
