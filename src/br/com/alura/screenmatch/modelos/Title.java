package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import com.google.gson.annotations.SerializedName;

public class Title implements Comparable<Title>{
    private String name;
    @SerializedName("Year")
    private int yearOfRelease;
    private boolean withinThePlan;
    private double sum_Of_Assessments;
    private int totalReviews;
    private int durationInMinutes;

    // DOIS CONSTRUTORES
    public Title(String name, int yearOfRelease) {
        this.name = name;
        this.yearOfRelease = yearOfRelease;
    }

    public Title(TituloOMDB meuTituloOmdb) {
        if (meuTituloOmdb.year().length() > 4) {
            throw new ErroDeConversaoDeAnoException("nao consegui converter o ano " +
                    "pois tem mais de 4 caracteres");
        }
        this.name = meuTituloOmdb.title();
        this.yearOfRelease = Integer.valueOf(meuTituloOmdb.year());
        this.durationInMinutes = Integer.valueOf(meuTituloOmdb.runtime().substring(0,2));
    }

    public String getName() {
        return name;
    }

    public int getTotalReviews(){
        return totalReviews;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void setWithinThePlan(boolean withinThePlan) {
        this.withinThePlan = withinThePlan;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public int getDurationInMinutes(){
        return durationInMinutes;
    }


    // MÉTODO PARA EXIBIR A FICHA TÉCNICA
    public void displaysTechnicalSheet(){
        System.out.println("br.com.alura.screenmatch.modelos.Movie Name: " + name);
        System.out.println("Year of Release: " + yearOfRelease);
    }
    // MÉTODO PARA REGISTRAR UMA AVALIAÇÃO
    public void rate(double note){
        sum_Of_Assessments += note;
        totalReviews++;

    }
    // MÉTODO PARA CALCULAR A MÉDIA DAS AVALIAÇÕES
    public double averageRating(){
        return sum_Of_Assessments / totalReviews;
    }

    @Override
    public int compareTo(Title outroTitulo) {
        return this.getName().compareTo(outroTitulo.getName());
    }

    @Override
    public String toString() {
        return "Nome do Filme: " + name +
                ", Ano de lançamento: " + yearOfRelease + ", Duração: " + durationInMinutes;
    }
}
