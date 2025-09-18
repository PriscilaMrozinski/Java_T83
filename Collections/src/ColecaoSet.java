import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ColecaoSet {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		Set<String> frutas = new HashSet<String>();
		
		frutas.add("Banana");
		frutas.add("Maça");
		frutas.add("Laranja");
		frutas.add("Abacate");
		frutas.add("Banana");
		frutas.add("banana");//considera outro elemento: letra maiuscula e minuscula 
		
		System.out.println(frutas);
		//observa que altera a ordem, nao mantem a mesma ordem de cadastro
		//e nao repete a banana, ou seja não aceita repetições
		
		
		for(String fruta : frutas) {
			System.out.println(fruta.hashCode());
		}//mostra o hash
		//exemplo de uso do hash, banco de dados - relacionamento n:n
		
		frutas.remove("Abacate");
		
		System.out.println(frutas);
		System.out.println("A fruta Amora está presente no set? " + frutas.contains("Amora"));
		System.out.println("O set está vazio? " + frutas.isEmpty());
		
		frutas.add("Kiwi");
		
		System.out.println("Usando a interface ITERATOR:");
		
		Iterator<String> itFrutas = frutas.iterator();// cria um iterador
		while(itFrutas.hasNext()) {
			System.out.println(itFrutas.next());
		}
		//hasNext : verifica se tem próximo elemento. Faz a parada do laço, se tive elemento continua, se nao tiver para o laço
		//Atenção!! O Iterador não permite adicionar elemento, exemplo para adicionar o Kiwi tem que colocar anter do Iterator<String> itFrutas = frutas.iterator();
		

		System.out.println("---Ordenando os objetos---");
		
		//primeiro converte para ArrayList:
		ArrayList<String> frutasList = new ArrayList<String>();
		frutasList.addAll(frutas);//adiciona toda a lista de uma vez
		frutasList.sort(null);//Ordenação dos dados - NULL nenhum parametro, porque ordem crescente é o padrão
		System.out.println("Ordem crescente: " + frutasList);
		frutasList.sort(Comparator.reverseOrder());//Ordenação decrecrente dos dados, método Comparator.reverseOrder, Atenção!! primeiro tem que ordenar a lista para depois reverter.
		System.out.println("Ordem decrescente: " + frutasList);
		
		
		leia.close();


	}

}
