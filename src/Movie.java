public class Movie {
    // ATRIBUTOS DO FILME
    String name;
    int yearOfRelease;
    boolean withinThePlan;
    double sum_Of_Assessments;
    int totalReviews;
    int durationInMinutes;

    // PRIMEIRO COMPORTAMENTO
    void displaysTechnicalSheet(){
        System.out.println("Movie Name: " + name);
        System.out.println("Year of Release: " + yearOfRelease);
    }

    void rate(double note){
        sum_Of_Assessments += note;
        totalReviews++;

    }

    double averageRating(){
        return sum_Of_Assessments / totalReviews;
    }
}
