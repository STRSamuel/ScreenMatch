package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculation.RecommendationFilter;
import br.com.alura.screenmatch.calculation.TimeCalculator;
import br.com.alura.screenmatch.modelos.Episode;
import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Series;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Preenchendo os atributos
        Movie myMovie1 = new Movie("Forrest Gump", 1994);
        myMovie1.setDurationInMinutes(100);
        System.out.println("Film duration: " + myMovie1.getDurationInMinutes());

       // Chamando métodos da classe Filme
        myMovie1.displaysTechnicalSheet();

        // Avaliações
        myMovie1.rate(10);
        myMovie1.rate(6);
        myMovie1.rate(3);

        //Exibindo a média das avaliações
        System.out.println("Total of Reviews: " + myMovie1.getTotalReviews());
        System.out.println(myMovie1.averageRating());

        Series lost = new Series("Lost" , 2000);
        lost.displaysTechnicalSheet();
        lost.setSeasons(10);
        lost.setEpisodesPerSeason(10);
        lost.setMinutesPerEpisode(50);
        System.out.println("Series duration: " + lost.getDurationInMinutes());

        Movie myMovie2 = new Movie("Titanic", 1994);
        myMovie2.setDurationInMinutes(100);

        // SOMANDO O TEMPO DOS DOIS FILMES
        TimeCalculator calculator = new TimeCalculator();
        calculator.includes(myMovie1);
        calculator.includes(myMovie2);
        calculator.includes(lost);
        System.out.println("Total: " + calculator.getTempoTotal());

        RecommendationFilter filter = new RecommendationFilter();
        filter.filter(myMovie1);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSerie(lost);
        episode.setTotalOfViews(500);
        filter.filter(episode);

        // VAR
        var filmeDoSamuel = new Movie("A empregada", 2026);
        filmeDoSamuel.setDurationInMinutes(350);
        filmeDoSamuel.rate(9);

        // NOVO ARRAY LIST
        ArrayList<Movie> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoSamuel);
        listaDeFilmes.add(myMovie1);
        listaDeFilmes.add(myMovie2);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Filmes: " + listaDeFilmes.get(0).getName());
        System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());
        System.out.println(listaDeFilmes);



    }
}