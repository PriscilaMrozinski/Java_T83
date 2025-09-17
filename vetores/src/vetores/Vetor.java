package vetores;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		//Classe: Scanner
		// new Scanner: cria um objeto (esse objeto virá via teclado)
		
		String nomes[] = {"Cintia", "Stella", "Patrícia", "Rafaela", "Letícia", "Jamila", "Priscila"};
		int numeros[] = new int[5];
		
		System.out.println("-----------------------------");
		//Leitura de apenas um índice
		System.out.println("Posição 0 = " + nomes[0]);
		
		System.out.println("-----------------------------");
		
		//Ordenar vetor em ordem crescente
		Arrays.sort(nomes);
		Arrays.sort(nomes, Collections.reverseOrder());
		//reverseOrder (ordem decrescente) só funciona em CLASSES, NÃO FUNCIONA TIPO PRIMATIVO
		//se for tipo primitivo tem que fazer manual, exemplo no caso dos números.
		
		//Leitura de todos os índices nomes, usando FOR:
	
		System.out.println("Listagem - Vetor de Nomes");
		//for(int indice=0; indice<6; indice++) {
			//System.out.printf("nomes[%d] = %s%n ", indice, nomes[indice]);
		//} 
		for(int indice=0; indice< nomes.length; indice++) {
			System.out.printf("nomes[%d] = %s%n ", indice, nomes[indice]);
		} //nomes.lehgth: seria nome_vetor.(length)tamanho_vetor
		
		
		System.out.println("-----------------------------");
		//Solicitar números para o usuário:
		System.out.println("Listagem - Vetor de Números");
		for(int indice=0; indice< numeros.length; indice++) {
			System.out.println("Digite um número: ");
			numeros[indice] = leia.nextInt();
		} 
		
		//Ordenar vetor em ordem crescente
		Arrays.sort(numeros);
		//array é uma classe
		//sort é o método
				
		
		System.out.println("-----------------------------");
		
		System.out.println("Listagem - Vetor de Números");
		for(int indice=0; indice< numeros.length; indice++) {
			System.out.printf("numeros[%d] = %s%n ", indice, numeros[indice]);
		} 
		
		leia.close();
	}

}
