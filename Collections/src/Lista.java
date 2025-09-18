import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(5);//add - método adicionar
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(5);
		
		System.out.println(numeros);
		System.out.println("Exibir o elemento na posição 2: " + numeros.get(2));
		System.out.println("Exibir o indice do elemento 10: " + numeros.indexOf(10));

		numeros.set(numeros.indexOf(10), 4);//altera o valor de 10 para 4
		System.out.println(numeros);
		
		numeros.remove(numeros.indexOf(5));
		System.out.println(numeros);
		//Atenção o metodo remove exclui o indice(index) não o valor do objeto!!
		//Apaga apenas o primeiro elemento, não apaga os dois 5 como exemplo
		
		
		//o ArrayList permite repetir números.
		//Collection não grava informação, apenas executa quando o programa é executado
		
		for(int numero : numeros) {
			System.out.println(numero);
		}//For Each - pega cada elementa da sua coleção e faz alguma coisa com ele
		//o numero itera (passa) na sua lista inteira 
		// for(int linha=0; linha<matriz.length; linha++)
		
		
		System.out.println("Tamanho da lista: " + numeros.size());//diz o tamanho da lista
		System.out.println("A lista está vazia? " + numeros.isEmpty());//verifica se a lista está vazia - retorna true ou false
		System.out.println("O número 8 está na lista? " + numeros.contains(8));//se tiver varios 8 traz o primeiro 
		
		//limpar a lista:
		numeros.clear();
		
		System.out.println("A lista está vazia? " + numeros.isEmpty());	
		
	}
}
