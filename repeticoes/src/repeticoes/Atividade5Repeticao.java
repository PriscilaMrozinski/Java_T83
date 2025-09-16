package repeticoes;

import java.util.Scanner;

public class Atividade5Repeticao {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int num = 0, soma=0;
		
		do {
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			if(num>0) {
				soma += num;
			}
			
		}while (num!=0);//Pri, meu docinho, lembre aqui diz: repita enquanto for != de zero
		
		System.out.printf("A soma dos números positivos é: %d%n" , soma);
		leia.close();
	}

}
