import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		Set<Integer> Numeros = new HashSet<Integer>();
		
		while (Numeros.size()<10) {
			System.out.printf("Digite o número: ");
			int num = leia.nextInt();
			
			if (Numeros.contains(num)) {
			    System.out.println("Número repetido! Digite outro número.");
			} else {
			    Numeros.add(num);
			}//o Contains: retorna true se o Objeto existe na Collection Set.
		}
		
		System.out.println("---Números Digitados---");
		Iterator<Integer> itNumeros = Numeros.iterator();//Iterator percorre os elementos do Collection
		while(itNumeros.hasNext()) {//verifica se ainda tem elemento para ser lido
			System.out.println(itNumeros.next());
		}
		
		leia.close();
		}
}
