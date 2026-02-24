import java.util.HashSet;
public class Exercicio12 {
	public static void main(String[] args) {
		HashSet<String> mails = new HashSet<>();
		
		mails.add("didivitali@gmail.com");
		mails.add("teste.teste@gmail.com");
		mails.add("roberto.teste@teste.com");
		
		System.out.println("Hash set atual: \n" + mails + "\n Tamanho: " + mails.size());
		
		mails.add("didivitali@gmail.com");
		
		System.out.println("Hash set depois de add o email : \n" + mails + "\n Tamanho: " + mails.size());
		
	}
}
