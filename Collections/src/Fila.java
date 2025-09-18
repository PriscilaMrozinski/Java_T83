import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Maria");
		fila.add("Aline");
		fila.add("Letícia");
		fila.add("Cintia");
		fila.add("Rayssa");
		
		System.out.println(fila);
		
		System.out.printf("--- Retirar elemento da fila ---%n");
		fila.remove();//sempre remove o primeiro
		System.out.println(fila);
		
		System.out.printf("--- Adicionar elemento da fila ---%n");
		fila.add("Milena");
		fila.add("Nadia");
		System.out.println(fila);
		
		
		System.out.println("O tamanho da fila é: " + fila.size());
		System.out.println("A primeira pessoa da fila é: " + fila.peek());
		
		for (String pessoa : fila) {
			System.out.println(pessoa);
		}
		
		//var: verifica qual é o tipo de dado, exemplo não precisa escreve String pessoa
		//existe a prioritQueue: que retira primeiro as prioridades
		
		
		leia.close();

	}

}
