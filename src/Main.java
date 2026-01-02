public class Main {
    public static void main(String[] args) {
        Movie myMovie1 = new Movie();
        myMovie1.name = "Forrest Gump";
        myMovie1.yearOfRelease = 1994;
        myMovie1.durationInMinutes = 142;

        myMovie1.displaysTechnicalSheet();

        myMovie1.rate(7);
        myMovie1.rate(5);
        myMovie1.rate(4);
        System.out.println(myMovie1.sum_Of_Assessments);
        System.out.println(myMovie1.totalReviews);
        System.out.println(myMovie1.averageRating());
    }
}