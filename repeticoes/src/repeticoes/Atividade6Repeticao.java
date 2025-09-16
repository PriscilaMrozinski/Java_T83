package repeticoes;

import java.util.Scanner;

public class Atividade6Repeticao {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int num = 0, cont=0;
		float soma=0, media=0;
		
		do {
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			if (num%3==00 && num!=0) {
				cont ++;
				soma += num;
			}		
		}while (num!=0);//Pri, meu docinho, lembre aqui diz: repita enquanto for != de zero
		
		if (cont>0) {
			media = soma/cont;
			System.out.printf("A média de todos os números múltiplos de 3 é: %.2f%n" , media);
		}else if (soma == 0){
			System.out.printf("Nenhum múltiplo de 3 foi digitado!");
		}
		
		leia.close();
	}

}