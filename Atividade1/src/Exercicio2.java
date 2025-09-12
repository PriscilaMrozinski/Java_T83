import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		//Exercício2 - Média das Notas
		Scanner leia = new Scanner(System.in); 
		float nota1, nota2, nota3, nota4;
		
		System.out.printf("Digite a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.printf("Digite a segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.printf("Digite a terceira nota: ");
		nota3 = leia.nextFloat();
		System.out.printf("Digite a quarta nota: ");
		nota4 = leia.nextFloat();
		
		System.out.printf("A média das notas é: %.2f%n" , (nota1 + nota2 + nota3 + nota4)/4);
		

	}

}
