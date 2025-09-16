import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float saque, deposito;
		float saldo = 1000;
		int menu;
		
		System.out.println("------- Operações Bancárias	--------");
		System.out.println("	1-Saldo							");
		System.out.println("	2-Saque							");
		System.out.println("	3-Depósito						");
		System.out.println("Digite a opção desejada:");
		menu = leia.nextInt();
		
		switch (menu){
		case 1:
			System.out.println("--- Operação Saldo ---");
			System.out.printf("Saldo: R$ %.2f", saldo);
		break;
		
		case 2:
			System.out.println("--- Operação Saque ---");
			System.out.printf("Digite o valor do saque: ");
			saque = leia.nextFloat();			
			if (saque>saldo) {
				System.out.println("Saldo Insuficiente!");
			}else {
				System.out.println("Saque realizado com sucesso!");
				saldo -= saque;
				System.out.printf("Novo saldo: R$ %.2f", saldo);
			}
		break;
		
		case 3: 
			System.out.println("--- Operação Depósito ---");
			System.out.printf("Digite o valor do depósito: ");
			deposito = leia.nextFloat();	
			saldo += deposito;
			System.out.printf("Novo saldo: R$ %.2f", saldo);
		break;
		
		default:
		System.out.println("Opção inválida!");
		System.out.println("Digite 1: para Saldo");
		System.out.println("Digite 2: para Saque");
		System.out.println("Digite 3: para Depósito");
		}
		
		leia.close();
	}
}

