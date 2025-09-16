import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int num;
		
		System.out.println("Digite um número inteiro: ");
		num = leia.nextInt();
		
		if (num%2==0 && num>0) {
			System.out.printf("O número %d é PAR e POSITIVO.", num);
		}else if (num%2==0 && num<0) {
			System.out.printf("O número %d é PAR e NEGATIVO.", num);
		}else if (num%2!=0 && num>0) {
			System.out.printf("O número %d é ÍMPAR e POSITIVO.", num);
		}else if (num%2!=0 && num<0) {
			System.out.printf("O número %d é ÍMPAR e NEGATIVO.", num);
		}else {
			System.out.printf("O número %d é PAR e NEUTRO", num);
		}
		leia.close();
	}
}

