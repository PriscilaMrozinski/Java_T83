package repeticoes;

import java.util.Scanner;

public class Atividade1Repeticao {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int num1, num2;
		
		System.out.println("Digite o primeiro número do intervalo: ");
		num1 = leia.nextInt();
		
		System.out.println("Digite o segundo número do intervalo: ");
		num2 = leia.nextInt();
		
		if (num2<num1) {
			System.out.println("Intervalo inválido!");
			System.out.println("O primeiro número deve ser menor que o segundo número.");
		}
		
		for (int contador = num1; contador <= num2; contador++) {
			if (contador % 3 == 0 && contador % 5 == 0) {
				System.out.printf("%d é múltiplo de 3 e 5%n", contador);
			}
		}
		leia.close();
	}
}
