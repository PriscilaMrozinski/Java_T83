package helloworld;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		//Calculadora simples
		Scanner leia = new Scanner (System.in);
		
		double numero1, numero2;
		
		System.out.println("Digite primeiro número: ");
		numero1 = leia.nextDouble();
		
		System.out.println("Digite segundo número: ");
		numero2 = leia.nextDouble();
		
		System.out.printf("%.2f + %.2f = %.2f", numero1, numero2, numero1 + numero2);
		
		leia.close();

	}
}
