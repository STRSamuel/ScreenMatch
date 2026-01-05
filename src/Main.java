import br.com.alura.screenmatch.modelos.Movie;

public class Main {
    public static void main(String[] args) {
        // Preenchendo os atributos
        Movie myMovie1 = new Movie();
        myMovie1.setName("Forrest Gump");
        myMovie1.setYearOfRelease(1994);
        myMovie1.setDurationInMinutes(142);

       // Chamando métodos da classe Filme
        myMovie1.displaysTechnicalSheet();

        // Avaliações
        myMovie1.rate(4);
        myMovie1.rate(5);
        myMovie1.rate(4);

        //Exibindo a média das avaliações
        System.out.println("Total of Reviews: " + myMovie1.getTotalReviews());
        //System.out.println(myMovie1.averageRating());
    }
}