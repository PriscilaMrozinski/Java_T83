package vetores;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		float matriz[][] = new float[10][4];
		float media[] = new float[10];
		float soma = 0.0f;
		
		//Entrada das notas
		for(int linha=0; linha<matriz.length; linha++) {
			for(int coluna=0; coluna<matriz[linha].length; coluna++) {
				System.out.printf("Matriz[%d][%d] = ", linha, coluna);
				matriz[linha][coluna] = leia.nextFloat();
			}
		}
		
		//Exibir as notas
		for(int linha=0; linha<matriz.length; linha++) {
			for(int coluna=0; coluna<matriz[linha].length; coluna++) {
				//System.out.printf("Matriz[%d][%d] = %.2f%n ", linha, coluna, matriz[linha][coluna]);
				
				soma += matriz[linha][coluna];
			}
			
			media[linha] = soma/ 4;
			soma=0.0f;
			
		}
		
		for (int indice=0; indice<media.length; indice++) {
			System.out.printf("Média do %dº aluno = %.2f%n", indice +1, media[indice]);
		}
		
		
		
		leia.close();
	}

}
