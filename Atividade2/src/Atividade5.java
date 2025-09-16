import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int menu, quantidade;
		float preco;
		
		System.out.println("	Faça seu pedido:			");
		System.out.println("--------------------------------");
		System.out.println("	1-Cachorro Quente			");
		System.out.println("	2-X-Salada					");
		System.out.println("	3-X-Bauru					");
		System.out.println("	4-Bauru						");
		System.out.println("	5-Refrigerante				");
		System.out.println("	6- Suco de Lajranja			");
		System.out.println("--------------------------------");
		System.out.println("	Digite a opção desejada: 	");

		menu = leia.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("Cachorro Quente, preço: R$ 10,00");
			System.out.println("Escolha a quantidade: ");
			quantidade = leia.nextInt();
			preco = quantidade * 10;
			System.out.printf("Cachorro Quente, Total: R$ %.2f", preco);
			break;
		
		case 2:
			System.out.println("X-Salada, preço: R$ 15,00");
			System.out.println("Escolha a quantidade: ");
			quantidade = leia.nextInt();
			preco = quantidade * 15;
			System.out.printf("X-Salada, Total: R$ %.2f", preco);
			break;
			
		case 3: 
			System.out.println("X-Bacon, preço: R$ 18,00");
			System.out.println("Escolha a quantidade: ");
			quantidade = leia.nextInt();
			preco = quantidade * 18;
			System.out.printf("X-Bacon, Total: R$ %.2f", preco);
			break;
			
		case 4:
			System.out.println("Bauru, preço: R$ 12,00");
			System.out.println("Escolha a quantidade: ");
			quantidade = leia.nextInt();
			preco = quantidade * 12;
			System.out.printf("Bauru, Total: R$ %.2f", preco);
			break;
			
		case 5:
			System.out.println("Refrigerante, preço: R$ 8,00");
			System.out.println("Escolha a quantidade: ");
			quantidade = leia.nextInt();
			preco = quantidade * 8;
			System.out.printf("Refrigerante, Total: R$ %.2f", preco);
			break;
		case 6:
			System.out.println("Suco de Laranja, preço: R$ 13,00");
			System.out.println("Escolha a quantidade: ");
			quantidade = leia.nextInt();
			preco = quantidade * 13;
			System.out.printf("Suco de Laranja, Total: R$ %.2f", preco);
			break;
			
		default:
			System.out.println("Opção inválida!");
		}
		
		leia.close();
	}
}
