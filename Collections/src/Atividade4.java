import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Set<Integer> setNumeros = new HashSet<Integer>();
		
		setNumeros.add(2);
		setNumeros.add(5);
		setNumeros.add(1);
		setNumeros.add(3);
		setNumeros.add(4);
		setNumeros.add(9);
		setNumeros.add(7);
		setNumeros.add(8);
		setNumeros.add(10);
		setNumeros.add(6);
		
		System.out.println("Digite o número que desejar encontrar: ");
		int num = leia.nextInt();
		
		if (setNumeros.contains(num)) {
		    System.out.printf("O número %d foi encontrado!", num);
		} else {
			System.out.printf("O número %d não foi encontrado!", num);
		}
		

	}

}
