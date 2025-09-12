import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		//Exercício 4 - Leitura e cálculo da diferença dos produtos
		
		Scanner leia = new Scanner(System.in);
		float n1, n2, n3, n4, resultado;
		
		System.out.printf("Digite o valor de n1: ");
		n1 = leia.nextFloat();
		System.out.printf("Digite o valor de n2: ");
		n2 = leia.nextFloat();
		System.out.printf("Digite o valor de n3: ");
		n3 = leia.nextFloat();
		System.out.printf("Digite o valor de n4: ");
		n4 = leia.nextFloat();
		
		resultado = (n1*n2) - (n3*n4);
		
		System.out.printf("O resultado da diferença dos produtos é: %.2f", resultado);

	}

}
