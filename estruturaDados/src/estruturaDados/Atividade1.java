package estruturaDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Queue<String> fila = new LinkedList<String>();
		int menu;
		
		do {
		System.out.println("------------------------------------");
		System.out.println("1 - Adicionar Cliente na Fila");
		System.out.println("2 - Listar todos os Clientes");
		System.out.println("3 - Retirar Cliente da Fila");
		System.out.println("0 - Sair");
		System.out.println("");
		System.out.println("Digite a opção desejada: ");
		menu = leia.nextInt();
		leia.skip("\\R");
		
		switch(menu) {
		case 1:
			System.out.println("Digite seu nome: ");
			String nome = leia.nextLine();
			fila.add(nome);
			System.out.println("Cliente Adicionado!");
			System.out.println("");
			break;
		
		case 2:
			System.out.println("\nLista de Clientes na Fila: " + fila);
			System.out.println("");
			break;
		
		case 3:
			if (fila.isEmpty()) {
				System.out.println("Fila sem clientes para chamar.");
				System.out.println("");
			}else {
				String chamado = fila.poll(); // remove e retorna o primeiro
	            System.out.println("Cliente chamado(a): " + chamado);
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
