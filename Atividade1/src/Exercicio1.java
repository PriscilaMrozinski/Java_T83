import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		//Exercício1 - Cálculo Novo Salário
		Scanner leia = new Scanner(System.in); 
		float salario, abono;
		
		System.out.printf("Digite o valor do salário: ");
		salario = leia.nextFloat();
		
		System.out.printf("Digite o valor do abono: ");
		abono = leia.nextFloat();
		
		System.out.printf("O novo salário é de R$: %.2f", salario + abono);
		
	}

}
