import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// Instanciar um objeto da Classe Scanner (Entrada de Dados)
		Scanner leia = new Scanner(System.in); 
		
		// Definir as variáveis
		double numero1, numero2;
		
		// Entrada de dados
		System.out.println("Digite o primeiro número: ");
		numero1 = leia.nextDouble();	//para ler o valor e armazenar na variavel
		
		System.out.println("Digite o segundo número: ");
		numero2 = leia.nextDouble();	//para ler o valor e armazenar na variavel
		
		// Efetuar e exibir os cálculos
		System.out.printf("Soma: %.2f + %.2f = %.2f %n", numero1, numero2, numero1 + numero2);
		System.out.printf("Subtração: %.2f - %.2f = %.2f %n", numero1, numero2, numero1 - numero2);
		System.out.printf("Multiplicação: %.2f * %.2f = %.2f %n", numero1, numero2, numero1 * numero2);
		System.out.printf("Divisão: %.2f / %.2f = %.2f %n", numero1, numero2, numero1 / numero2);
		
		//Operações matemáticas com a Classe Math - é uma biblioteca
		System.out.printf("Potência: %.2f ^ %.2f = %.2f %n", numero1, numero2, Math.pow(numero1, numero2));
		System.out.printf("Raiz Quadrada de %.2f = %.2f %n", numero1, numero1 / Math.sqrt(numero1));
	}
}
