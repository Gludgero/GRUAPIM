import java.util.Queue;
import java.util.LinkedList;

public class Exercicio21 {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();

		fila.add("Documento1.pdf");
		fila.add("Foto.png");
		fila.add("Imagem.jpeg");
		fila.add("Carlos.txt");
		fila.add("Doc.docx");
		fila.add("Ex.xlsx");
		fila.add("Pdf.pdf");

		int size = fila.size();
		
		for (int i = 0; i < size; i++) {
			System.out.println(fila.poll());
		}

	}
}
