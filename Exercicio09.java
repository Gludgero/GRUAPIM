
import java.util.Random;
import java.util.ArrayList;

public class Exercicio09 {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		Random rand = new Random();
		for(int i = 0; i<10;i++) {
			arr.add(rand.nextInt(100));
		}
		System.out.println("Array antes: " + arr);
		arr.sort(null);
		System.out.println("Array depois: " + arr);
	}
	
}