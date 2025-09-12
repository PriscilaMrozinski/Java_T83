
public class Atribuicao {

	public static void main(String[] args) {
		int numero = 4;
		System.out.printf("Soma: %d%n" , numero +=2);
		System.out.printf("Subtração: %d%n" , numero -=2);
		System.out.printf("Multiplicação: %d%n" , numero *=2);
		System.out.printf("Divisão: %d%n" , numero /=2);
		System.out.printf("Resto: %d%n" , numero %=2);
		// Atenção! O resultado é baseado na variável modificada pelo cálculo anterior.

	}

}

