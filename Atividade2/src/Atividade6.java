import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int menu;
		String nome;
		float salario, novosalario;
		
		System.out.println("Digite o nome: ");
		nome = leia.nextLine();
		System.out.println("Digite o salário: ");
		salario = leia.nextFloat();
		
		
		System.out.println("	Cálculo Reajuste Salarial			");
		System.out.println("----------------------------------------");
		System.out.println("	1-Gerente 							");
		System.out.println("	2-Vendedor							");
		System.out.println("	3-Supervisor						");
		System.out.println("	4-Motorista							");
		System.out.println("	5-Estoquista						");
		System.out.println("	6-Técnico de TI						");
		System.out.println("----------------------------------------");
		System.out.println("	Digite a opção desejada: 	        ");

		menu = leia.nextInt();
		
		switch(menu) {
		case 1:
			novosalario = salario + (salario*0.1f);
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Gerente");
			System.out.printf("Salário reajustado: R$ %.2f%n", novosalario);
		break;
		case 2:
			novosalario = salario + (salario*0.07f);
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Vendedor");
			System.out.printf("Salário reajustado: R$ %.2f%n", novosalario);
		break;
		case 3:
			novosalario = salario + (salario*0.09f);
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Supervisor");
			System.out.printf("Salário reajustado: R$ %.2f%n", novosalario);
		break;
		case 4:
			novosalario = salario + (salario*0.06f);
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Motorista");
			System.out.printf("Salário reajustado: R$ %.2f%n", novosalario);
		break;
		case 5:
			novosalario = salario + (salario*0.05f);
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Estoquista");
			System.out.printf("Salário reajustado: R$ %.2f%n", novosalario);
		break;
		case 6:
			novosalario = salario + (salario*0.08f);
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Técnico de TI");
			System.out.printf("Salário reajustado: R$ %.2f%n", novosalario);
		break;
		default:
			System.out.println("Opção inválida!");
			}
			
			leia.close();
	}
}
