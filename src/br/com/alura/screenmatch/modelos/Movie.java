package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculation.Sortable;

public class Movie extends Title implements Sortable{
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {

        this.director = director;
    }

    @Override
    public int getClassification(){
        //CASTING
        return (int) averageRating() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getName() + " (" + this.getYearOfRelease() + ")";
    }
}
