package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Series;
import br.com.alura.screenmatch.modelos.Title;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Movie myMovie1 = new Movie("Forrest Gump:", 1994);
        myMovie1.rate(6);

        Movie myMovie2 = new Movie("Titanic:", 1994);
        myMovie2.rate(10);

        var filmeDoSamuel = new Movie("A empregada:", 2026);
        filmeDoSamuel.rate(8);

        Series lost = new Series("Lost" , 2000);

        ArrayList<Title> lista = new ArrayList<>();
        lista.add(filmeDoSamuel);
        lista.add(myMovie1);
        lista.add(myMovie2);
        lista.add(lost);

        // "iter", é o atalho para o for each.
        for (Title item : lista) {
            System.out.println(item.getName());
            if (item instanceof Movie movie && movie.getClassification() > 2) {
                System.out.println("Classificacao: " + movie.averageRating());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jaqueline");
        Collections.sort(buscaPorArtista);
        System.out.println("ORDENAÇÃO COM COLLECTIONS: " + buscaPorArtista);
        System.out.println("LISTA EM ORDEM ALFABETICA: " + lista);
        lista.sort(Comparator.comparing(Title::getYearOfRelease));
        System.out.println("LISTA ORDENADA POR ANO DE LANCAMENTO: " + lista);

    }
}
