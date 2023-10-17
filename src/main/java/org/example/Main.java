package org.example;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Carte carte1 = new Carte("Pădurea Spânzuraților", "Liviu Rebreanu");
        carte1.adaugaPagina(new Pagina(1, "Într-o dimineață însorită, Neagu trăgea să își strângă cureaua pantalonilor."));
        carte1.adaugaPagina(new Pagina(2, "Până la urmă, zări o umbră pe un deal și veni cu gânduri bune."));
        carte1.adaugaPagina(new Pagina(3, "Dar pe dealul înalt, se întâmplase să doarmă un batalion întreg, astfel încât Neagu fusese luat prizonier."));

        Carte carte2 = new Carte("Moara cu Noroc", "Ioan Slavici");
        carte2.adaugaPagina(new Pagina(1, "Într-un sat liniștit, la marginea unei păduri de pini, se afla Moara cu Noroc."));
        carte2.adaugaPagina(new Pagina(2, "Patronul moare și moara ajunge în mâinile lui Ion."));

        Carte carte3 = new Carte("Marele Gatsby", "F. Scott Fitzgerald");
        carte3.adaugaPagina(new Pagina(1, "Era o seară de vară în anii '20, iar petrecerea de la conacul lui Gatsby era în toi."));
        carte3.adaugaPagina(new Pagina(2, "Jay Gatsby era cunoscut pentru petrecerile sale extravagante și pentru obsesia sa pentru Daisy."));

        biblioteca.adaugaCarte(carte1);
        biblioteca.adaugaCarte(carte2);
        biblioteca.adaugaCarte(carte3);



        biblioteca.sortare();

        biblioteca.cautaCuvant("să");

        biblioteca.afiseazaContinut("Pădurea Spânzuraților", 3);

        biblioteca.afiseazaCarti();
    }
}