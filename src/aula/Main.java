package aula;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Main {

	public static void main(String[] args) throws IOException{
		
		Document doc = Jsoup.connect("https://pt.wikipedia.org/wiki/Fórmula_1").get();
		
		System.out.println(doc); // mostra o codigo HTML inteiro da pagina;
		
		System.out.println(doc.getElementsByTag("p")); // seleciona apenas os paragrafos;
		
		System.out.println(doc.getElementsContainingOwnText("o verde para as equipes inglesas,"));// filtra o paragrafo que contem o trecho da frase descrita;
		
	}

}
