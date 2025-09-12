import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		//Exercício3 - Cálculo Salário Líquido
		Scanner leia = new Scanner (System.in);
		float salario_bruto, adicional_noturno, hora_extra, descontos, salario_liquido;
		
		System.out.printf("Digite o valor do salário: ");
		salario_bruto = leia.nextFloat();
		
		System.out.printf("Digite o valor do adicional noturno: ");
		adicional_noturno = leia.nextFloat();
		
		System.out.printf("Digite o valor das horas extras: ");
		hora_extra = leia.nextFloat();
		
		System.out.printf("Digite o valor dos descontos: ");
		descontos = leia.nextFloat();
		
		salario_liquido = salario_bruto + adicional_noturno + (hora_extra*5) - descontos;
		
		System.out.printf("O valor do salário líquido é: %.2f" , salario_liquido);

	}

}
