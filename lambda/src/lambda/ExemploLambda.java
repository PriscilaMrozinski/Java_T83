package lambda;
 
import java.util.Arrays;
import java.util.List;
 
public class ExemploLambda {
	public static void main(String[] args) {
 
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		//Arrays.asList: cria uma lista já com elementos.
 
		/* Exibir os itens da Lista SEM Expressão Lambda
		System.out.println("Exibir os itens\n");
		for(Integer n : numeros) {
			System.out.println(n);
		}*/
		
		//Forma de fazer COM expressão Lambda:
		System.out.println("Exibir os itens");
		numeros.forEach (numero -> System.out.println(numero));
		//Para usar o método For Each: tem usar expressões Lambdas
		//numero representa o numero atual da leitura da lista
		
		
		//**************************************************************;
		
		/* Exibir os itens da Lista dobrados SEM Expressão Lambda
		System.out.println("\nExibir os itens somados com eles mesmos\n");
		for(Integer n : numeros) {
			System.out.println(n + n);
		}*/
		
		//Forma de fazer COM expressão Lambda:
		System.out.println("Soma Números:");
		numeros.forEach (numero -> System.out.println(numero + numero));
		
		//**************************************************************
		
		
		/* Exibir apenas os elementos pares da Lista SEM Expressão Lambda
		System.out.println("\nExibir os itens pares da lista\n");
		for(Integer n : numeros) {
			if(n%2 == 0)
			System.out.println(n);
		}*/
		
		//Forma de fazer COM expressão Lambda:
		System.out.println("Números Pares:");
		numeros.forEach (numero -> {
			if(numero %2 ==0)
				System.out.println(numero);
		});
		
		
	}
}