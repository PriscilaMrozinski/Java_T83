package estruturaDados;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Deque<String> pilha = new ArrayDeque<String>();
		int menu;
		
		do {
		System.out.println("------------------------------------");
		System.out.println("1 - Adicionar Livro na pilha");
		System.out.println("2 - Listar todos os Livros");
		System.out.println("3 - Retirar Livro da pilha");
		System.out.println("0 - Sair");
		System.out.println("Digite a opção desejada: ");
		menu = leia.nextInt();
		leia.skip("\\R");
		
		switch(menu) {
		case 1:
			System.out.println("Digite o nome do livro: ");
			String nome = leia.nextLine();
			pilha.add(nome);
			System.out.println("Livro Adicionado!");
			System.out.println("");
			break;
		
		case 2://lembra de usar for, para conseguir pular linha
			System.out.println("Lista de Livros na pilha: ");
		    for (String livro : pilha) {
		        System.out.println(livro);
		    }
		    System.out.println();
		    break;
		
		case 3:
			if (pilha.isEmpty()) {
				System.out.println("A Pilha está vazia!");
				System.out.println("");
			}else {
				//listando os livros:
				System.out.println("Lista de Livros na pilha: ");
			    for (String livro : pilha) {
			        System.out.println(livro);
			    }
			    System.out.println();
				
				//agora removendo livro:
				String chamado = pilha.poll(); // remove
	            System.out.println("Livro retirado: " + chamado);
	            System.out.println("");
			}
			break;
				
		case 0:
			System.out.println("Menu finalizado.");
			System.out.println("");
			break;
			
		default:
			System.out.println("Opção inválida! Digite novamente.");
			System.out.println("");
		}
		
		} while(menu !=0);
		
		leia.close();
	}
}
