import java.util.ArrayList;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		System.out.println("Digite o número que deseja encontrar: ");
		int num = leia.nextInt();
		
		int posicao = numeros.indexOf(num);
		
		if (posicao != -1) {
			System.out.printf("O número %d está localizado na posição: %d", num, posicao);
		} else {
			System.out.printf("O número %d não foi encontrado!", num);
		}
		
		leia.close();
	}
}
