package condicionais;

import java.util.Scanner;

public class Texto {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num;
		String texto;
		
		System.out.println("Digite um número: ");
		num = leia.nextInt();
		
		System.out.println("Digite uma String: ");
		leia.skip("\\R");
		texto = leia.nextLine();
		
		System.out.println("A String digitara: " + texto);
		
		
		leia.close();
	}

}
