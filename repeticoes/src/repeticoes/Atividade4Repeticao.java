package repeticoes;

import java.util.Scanner;

public class Atividade4Repeticao {
	

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int idade, genero, desenvolvedor=0, totalRespostas=0, mulherfront=0, homem=0, binario=0;
		long somaidades = 0;
		double mediaIdades = 0;		
		
		
		String continua = "S";
		
		while(continua.equalsIgnoreCase("S")) {
			System.out.println("Pesquisa - Desenvolvedores");
			
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();			
			
			
			System.out.println("1 - Mulher Cis");
			System.out.println("2 - Homem Cis");
			System.out.println("3 - Não Binário");
			System.out.println("4 - Mulher Trans");
			System.out.println("5 - Homem Trans");
			System.out.println("6 - Outros");
			System.out.println("Digite sua Identidade de Gênero: (número inteiro correspondente a opção)");
			genero = leia.nextInt();
			
			System.out.println("1 - Backend");
			System.out.println("2 - Frontend");
			System.out.println("3 - Mobile");
			System.out.println("4 - FullStack");
			System.out.println("Digite sua opção de carreira como Pessoa Desenvolvedora: (número inteiro correspondente a opção)");
			desenvolvedor = leia.nextInt();
			
			
			// Total de pessoas Backend:
			if (desenvolvedor == 1) {
				desenvolvedor ++;
			}
			
			// Total de Mulheres Cis e Trans e front
			if (genero == 1 || genero == 4 && desenvolvedor == 2) {
				mulherfront ++;
			}
			
			// Total de Homens Cis e Trans e Mobile e idade > 40
			if (genero == 2 || genero == 5 && desenvolvedor == 3 && idade>40) {
				homem ++;
			}
			
			// Total não binario e fuulstack e idade < 30
			if (genero == 3 && desenvolvedor == 4 && idade<30) {
				binario ++;
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
		System.out.printf("Total de pessoas desenvolvedoras Backend: %d%n" , desenvolvedor);
		System.out.printf("Total de Mulheres Cis e trans desenvolvedoras Frontend: %d%n" , mulherfront);
		System.out.printf("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: %d%n" , homem);
		System.out.printf("Total de Não Binários desenvolvedores FullStack menores de 30 anos: %d%n" , binario);
		System.out.printf("Total de pessoas que responderam à pesquisa: %d%n" , totalRespostas);
		System.out.printf("Média das idades das pessoas que responderam à pesquisa: %.2f%n" , mediaIdades);
		leia.close();
	}
}
