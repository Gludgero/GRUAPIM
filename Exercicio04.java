
public class Exercicio04{	
	public static void main(String[] args) {
		int array[] = {1,2,3,4,5,6,7};
		int cont = 0;
		for (int i : array) {
			if(i % 2 != 0) {
				cont += i;
			}
		}
		System.out.println(cont);
	}
}