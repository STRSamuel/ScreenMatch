import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.modelos.Title;
import br.com.alura.screenmatch.modelos.TituloOMDB;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        // SCANNER
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu filme: ");
        var busca = leitura.nextLine();

        // CONCATENANDO O "BUSCA" COM A URL
        String endereco = "http://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=a3cac225";
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);

            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();
            //Title meuTitulo = gson.fromJson(json, Title.class);
            TituloOMDB meuTituloOmdb = gson.fromJson(json, TituloOMDB.class);
            System.out.println(meuTituloOmdb);


            Title meuTitulo = new Title(meuTituloOmdb);
            System.out.println("TITULO CONVERTIDO: ");
            System.out.println(meuTitulo);

            FileWriter escrita = new FileWriter("filmes.txt");
            escrita.write(meuTitulo.toString());
            escrita.close();


        // "|" PARA AGRUPAR DUAS EXCEÇÕES
        } catch (NullPointerException | IllegalArgumentException e ) {
            System.out.println("Houve um erro na busca, verifique o endereço: ");
            System.out.println(e.getMessage());
        } catch (ErroDeConversaoDeAnoException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("finalizou");
    }
}
