package vetores;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int matriz[][] = new int[3][3];
        int somaPrincipal = 0;
        int somaSecundaria = 0;
		
		System.out.println("---Matriz com entrada de usuários---");
		for(int linha=0; linha<matriz.length; linha++) {
			for(int coluna=0; coluna<matriz[linha].length; coluna++) {
				System.out.println("Digite um número: ");
				matriz[linha][coluna] = leia.nextInt();
			}

		}
		
		System.out.println("---Impressão da Matriz 3x3---");
		for(int linha=0; linha<matriz.length; linha++) {
			for(int coluna=0; coluna<matriz[linha].length; coluna++) {
				System.out.printf("Matriz[%d][%d] = %d%n", linha, coluna, matriz[linha][coluna]);
			}
		}
	
		System.out.println("---Elementos da Diagonal Principal---");
		for(int linha=0; linha<matriz.length; linha++) {
			for(int coluna=0; coluna<matriz[linha].length; coluna++) {
				if (linha == coluna)
				System.out.printf("Matriz[%d][%d] = %d%n", linha, coluna, matriz[linha][coluna]);
				somaPrincipal += matriz[linha][coluna];//aqui estou somando
			}
		}
		
		System.out.printf("Soma Matriz Principal: %d%n", somaPrincipal);
		
		System.out.println("---Elementos da Diagonal Secundária---");
		for(int linha=0; linha<matriz.length; linha++) {
			for(int coluna=0; coluna<matriz[linha].length; coluna++) {
				if (linha + coluna == 2) {
					System.out.printf("Matriz[%d][%d] = %d%n", linha, coluna, matriz[linha][coluna]);
					somaSecundaria += matriz[linha][coluna];
				}
			}
		}
		System.out.printf("Soma Matriz Secundária: %d%n", somaSecundaria);
			
		leia.close();
	}
}
