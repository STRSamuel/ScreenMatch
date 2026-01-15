package br.com.alura.screenmatch.calculation;

import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Series;
import br.com.alura.screenmatch.modelos.Title;

public class TimeCalculator {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void includes (Movie m){
//        tempoTotal += m.getDurationInMinutes();
//    }
//
//    public void includes (Series s){
//        tempoTotal += s.getDurationInMinutes();
//    }

    public void includes (Title title){
        this.tempoTotal += title.getDurationInMinutes();
    }

}
