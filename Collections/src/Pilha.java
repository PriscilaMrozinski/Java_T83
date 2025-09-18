import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Pilha {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		Deque<String> pilha = new ArrayDeque<String>();
		pilha.push("Duna");
		pilha.push("Pai Rico Pai Pobre");
		pilha.push("Maus");
		pilha.push("Crime e Castigo");
		pilha.push("Quarto de Despejo");//ultimo elemento adicionado, aparece em primeiro)
		
		System.out.println(pilha);
		
		pilha.pop();//retira elemento
		System.out.println(pilha);
		System.out.println(pilha.poll());//mostra o primeiro elemento

		System.out.println("O livro Guia do Mochileiro da Galáxia está na pilha? " + pilha.contains("Guia do Mochileiro da Galáxia"));
		
		leia.close();
	}
}
