import java.util.ArrayList;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		ArrayList<String> cores = new ArrayList<String>();
		
		for (int indice=0; indice<5; indice++) {
			System.out.printf("Digite a %dº cor: %n", indice + 1);
			String cor = leia.nextLine();
			cores.add(cor);
		}
		
		System.out.println("--- Listar todas as cores: ---");
		System.out.println(cores);
		
		
		System.out.println("--- Ordenar as cores: ---");
		cores.sort(null);
		System.out.println(cores);
				
		leia.close();
	}
}
