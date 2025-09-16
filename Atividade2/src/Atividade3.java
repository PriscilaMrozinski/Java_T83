import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		boolean doacao;
		
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("É a sua primeira doação sangue: (true/false)");
		doacao = leia.nextBoolean();
		
		if (idade>69 && doacao==true) {
			System.out.printf(nome + " , você não está apto(a) para doar sangue.");
		}else if (idade>69 && doacao==false) {
			System.out.printf(nome + " , você está apto(a) para doar sangue.");
		}else if (idade>=18 && idade <=69) {
			System.out.printf(nome + " , você está apto(a) para doar sangue.");
		}else {
			System.out.printf(nome + " , você não está apto(a) para doar sangue.");
		}
		leia.close();
	}
}
