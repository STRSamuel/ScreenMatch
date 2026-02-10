package br.com.alura.screenmatch.modelos;

public class Title implements Comparable<Title>{
    private String name;
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
}
