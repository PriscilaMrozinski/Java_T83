import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float num1, num2, soma, subtracao, multiplicacao, divisao;
		int menu;
		
		System.out.println("Insira o 1º número: ");
		num1 = leia.nextFloat();
		
		System.out.println("Insira o 2º número: ");
		num2 = leia.nextFloat();
		
		System.out.println("	Calculadora						");
		System.out.println("------------------------------------");
		System.out.println("	1-Soma							");
		System.out.println("	2-Subtração						");
		System.out.println("	3-Multiplicação					");
		System.out.println("	4-Divisão						");
		System.out.println("------------------------------------");
		System.out.println("Digite: a opção desejada");
		menu = leia.nextInt();
		
		switch (menu) {
		case 1:
			soma = num1 + num2;
			System.out.printf("%.2f + %.2f = %.2f%n" , num1, num2, soma);
		break;
		case 2: 
			subtracao = num1 - num2;
			System.out.printf("%.2f - %.2f = %.2f%n" , num1, num2, subtracao);
		break;
		case 3:
			multiplicacao = num1 * num2;
			System.out.printf("%.2f * %.2f = %.2f%n" , num1, num2, multiplicacao);
		break;
		case 4:
			divisao = num1 / num2;
			System.out.printf("%.2f / %.2f = %.2f%n" , num1, num2, divisao);
		break;
		
		default:
			System.out.println("Opção inválida!");
		}
		leia.close();
	}
}