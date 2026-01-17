package br.com.alura.screenmatch.calculation;

public class RecommendationFilter {
    private String recommendation;

    public void filter(Sortable sortable){
        if (sortable.getClassification() >= 4) {
            System.out.println("It's among the current favorites.");
        } else if (sortable.getClassification() >= 2) {
            System.out.println("Very well rated at the moment");
        } else {
            System.out.println("Add it to your watch list for later.");
        }
    }
}
