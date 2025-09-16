import java.util.Scanner;

public class Atividade1{

	public static void main(String[] args) {
		//Exercício 1: verficar se A + B é maior, menor, igual a C		
		Scanner leia = new Scanner(System.in);
		int a, b, c, soma;
		
		System.out.println("Digite o número A: ");
		a = leia.nextInt();
		
		System.out.println("Digite o número B: ");
		b = leia.nextInt();
		
		System.out.println("Digite o número C: ");
		c = leia.nextInt();
		
		soma = a + b;
		
		if (soma > c) {
			System.out.printf("A Soma de %d + %d é MAIOR que %d%n", a, b, c);
		}else if (soma < c){
			System.out.printf("A Soma de %d + %d é MENOR que %d%n", a, b, c);
		}else {
			System.out.printf("A Soma de %d + %d é IGUAL que %d%n", a, b, c);
		}
		
		leia.close();
	}

}
