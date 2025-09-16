package repeticoes;

import java.util.Scanner;

public class Pesquisa {
	

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int idade, esporte, totalRespostas = 0, futebol =0, voleiM18 = 0, basqueteM18 = 0;
		long somaidades = 0;
		double mediaIdades = 0;		
		
		
		String continua = "S";
		
		while(continua.equalsIgnoreCase("S")) {
			System.out.println("Pesquisa - Esporte Favorito");
			
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();			
			
			
			System.out.println("1 - Futebol");
			System.out.println("2 - Voleibol");
			System.out.println("3 - Basquete");
			System.out.println("Digite o seu esporte favorito: ");
			esporte = leia.nextInt();
			
			// Total de pessoas que gostam de futebol:
			if (esporte == 1) {
				futebol ++;
			}
			
			// Total de pessoas que gostam de volei e são maiores de 18 anos
			if (esporte == 2 && idade >= 18) {
				voleiM18 ++;
			}
			
			// Total de pessoas que gostam de basquete e são menores de 18 anos
			if (esporte == 3 && idade<18) {
				basqueteM18 ++;
			}
			
			// inicio contagem para calculo da Média das idades
			somaidades += idade;
			totalRespostas ++;
			
			System.out.println("Deseja continuar: (S/N)?");
			leia.skip("\\R");// ignora a outra linha
			continua = leia.nextLine().toUpperCase();//converte para letra maiuscula	
			
		}
		
		//Calculo Médida idades
		mediaIdades = Math.round(somaidades / totalRespostas);
		
		//Exibir na tela os resultados
		System.out.printf("Total de pessoas que gostam de futebol: %d%n" , futebol);
		System.out.printf("Total de pessoas que gostam de volei maiores de 18 anos: %d%n" , voleiM18);
		System.out.printf("Total de pessoas que gostam de basquete menores de 18 anos: %d%n" , basqueteM18);
		System.out.printf("Média das idades: %.2f%n" , mediaIdades);
		leia.close();
	}
}
