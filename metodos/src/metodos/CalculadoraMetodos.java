package metodos;

import java.util.Scanner;

public class CalculadoraMetodos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in); 
		double numero1, numero2, resultadoDivisao;
		
		System.out.println("Digite o primeiro número: ");
		numero1 = leia.nextDouble();	
		
		System.out.println("Digite o segundo número: ");
		numero2 = leia.nextDouble();	
		
		System.out.printf("%.2f + %.2f = %.2f%n", numero1, numero2, somar(numero1, numero2));
		//o numero1 e numero2 aqui é referente ao metodo main, é a variavel não é parametro
		//ou seja, pode ter outro nome do parametro do metodo.
		System.out.printf("%.2f - %.2f = %.2f%n", numero1, numero2, subtrair(numero1, numero2));
		System.out.printf("%.2f * %.2f = %.2f%n", numero1, numero2, multiplicar(numero1, numero2));
		
		resultadoDivisao = dividir(numero1, numero2);
		if(resultadoDivisao==-1) {
			System.out.println("Não existe divisão por zero!");
		}else {
			System.out.printf("%.2f / %.2f = %.2f%n", numero1, numero2, resultadoDivisao);
		}
		
		sobre();
		
		leia.close();
	}
	
	//CRIAR MÉTODO:
	//colocar dentro da chave classe, mas fora do metodo main
	//static para nao ficar instanciando, ou seja, ja usa automaticamente na classe main desse projeto
	//sem o static vc obrigatoriamente tem criar um objeto (ex.: Scanner leia = new Scanner(System.in); 
	
	public static double somar(double numero1, double numero2) {
		return numero1 + numero2;
	}
	
	public static double subtrair(double numero1, double numero2) {
		return numero1 - numero2;
	}
	
	public static double multiplicar(double numero1, double numero2) {
		return numero1 * numero2;
	}
	
	public static double dividir(double numero1, double numero2) {
		if(numero2==0) {
			return -1;
		}
		return numero1/numero2;
		
	}
	
	public static void sobre() {
		System.out.println("\n********************");
		System.out.println("Calculadora desenvolvida por: Priscila Lins");
		System.out.println("*********************");
	}
}
