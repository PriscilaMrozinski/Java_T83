package repeticoes;

import java.util.Scanner;

public class DoWhileMenu {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int opcao = 0;
		
		do {
			System.out.println("Digite a opção desejada: ");
			opcao = leia.nextInt();
		}while(opcao==0);//continua até digitar outra coisa que nao seja zero
		
		
		leia.close();

	}

}
