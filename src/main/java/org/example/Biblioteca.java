package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Biblioteca {

    public ArrayList<Carte> listaCarti = new ArrayList<>();

    Map<String, Carte> mapCarte = new HashMap<String, Carte>();

    public void adaugaCarte(Carte carte) {
        listaCarti.add(carte);
        mapCarte.put(carte.titlu, carte);
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

    public List<Results> cautaCuvant(String cuvantCautat) {
        List<Results> searchResults = new ArrayList<>();

        for (Carte carte : listaCarti) {
            carte.getPagini().stream()
                    .filter(pagina -> pagina.getContinut().contains(cuvantCautat))
                    .forEach(pagina -> searchResults.add(new Results(carte.getTitlu(), pagina.getNrPag())));
        }
        return searchResults;
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
