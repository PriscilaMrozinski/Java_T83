package vetores;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        int vetor[] = new int[10];
        int soma = 0;
        float media = 0;

        for (int indice = 0; indice < 10; indice++) {
            System.out.printf("Digite o %dº número do vetor: ", indice + 1);
            vetor[indice] = leia.nextInt();
            soma += vetor[indice];//aqui estou somando
        }
        
        System.out.println();//pula linha e resultado fica mais bonitinho, lembre de colocar.

        
        System.out.print("Elementos nos índices ímpares: ");
        for (int indice = 0; indice < 10; indice++) {
            if (indice % 2 != 0) {
                System.out.printf(vetor[indice] + " ");
            } //bloco para o ímpar
        }
        
        System.out.println();

        
        System.out.print("Elementos pares: ");
        for (int indice = 0; indice < 10; indice++) {
            if (vetor[indice] % 2 == 0) {
                System.out.print(vetor[indice] + " ");
            }//bloco para o ímpar
        }
        System.out.println(); 


        media = soma / (10);
        System.out.printf("Soma: %d%n", soma);
        System.out.printf("Média: %.2f%n", media);

        leia.close();
	}

}
