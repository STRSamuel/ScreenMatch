package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculation.Sortable;

public class Episode implements Sortable {
    private int number;
    private String name;
    private Series serie;

    public int getTotalOfViews() {
        return totalOfViews;
    }

    public void setTotalOfViews(int totalOfViews) {
        this.totalOfViews = totalOfViews;
    }

    private int totalOfViews;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Series getSerie() {
        return serie;
    }

    public void setSerie(Series serie) {
        this.serie = serie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getClassification() {
        if (totalOfViews > 100) {
            return 4;
        } else {
            return 2;

        }
    }
}
