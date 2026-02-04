package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Series;
import br.com.alura.screenmatch.modelos.Title;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Movie myMovie1 = new Movie("Forrest Gump", 1994);
        myMovie1.averageRating();
        Movie myMovie2 = new Movie("Titanic", 1994);
        myMovie2.averageRating();
        var filmeDoSamuel = new Movie("A empregada", 2026);
        filmeDoSamuel.averageRating();
        Series lost = new Series("Lost" , 2000);

        ArrayList<Title> lista = new ArrayList<>();
        lista.add(filmeDoSamuel);
        lista.add(myMovie1);
        lista.add(myMovie2);
        lista.add(lost);

        // "iter", é o atalho para o for each.
        for (Title item : lista) {
            System.out.println(item.getName());
            Movie movie = (Movie) item;
            System.out.println("Classificacao: " + movie.averageRating());
        }
    }
}
