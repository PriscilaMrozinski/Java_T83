package repeticoes;

import java.util.Scanner;

public class Atividade3Repeticao {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int idade = 0, contmenor21 = 0, contmaior50 = 0;
		
		while (idade >= 0) {
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
			if (idade<21) {
				contmenor21 ++;
			} else if (idade>50) {
				contmaior50 ++;
			}
		}
		
		System.out.printf("Total de pessoas menores de 21 anos: %d%n" , contmenor21);
		System.out.printf("Total de pessoas maiores de 50 anos: %d%n" , contmaior50);
		leia.close();
	}

}
