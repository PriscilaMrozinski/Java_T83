package repeticoes;

import java.util.Scanner;

public class Atividade2Repeticao {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int num1, contpar = 0, contimpar = 0;
		
		for (int contador = 1; contador <=10; contador++) {
			System.out.printf("Digite o %dº número: ", contador);
			num1 = leia.nextInt();
			
			if (num1 % 2 == 0) {
				contpar++;
			}else {
				contimpar++;
			}
		}
		System.out.printf("Total de números pares: %d%n", contpar);
		System.out.printf("Total de números ímpares: %d%n", contimpar);
		leia.close();
	}
}
