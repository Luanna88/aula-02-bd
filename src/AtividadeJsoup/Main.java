package AtividadeJsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		String url = "https://cidades.ibge.gov.br/brasil/pb/campina-grande/historico"; 
        String outputFile = "titulos.txt"; 

        try {
            
            Document document = Jsoup.connect("https://cidades.ibge.gov.br/brasil/pb/campina-grande/historico").get();

            Elements titleElements = document.select("titulo");

            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            for (Element titleElement : titleElements) {
                String title = titleElement.text();
                writer.write(title);
                writer.newLine();
            }

            writer.close();

            System.out.println("Títulos extraídos e salvos em " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
