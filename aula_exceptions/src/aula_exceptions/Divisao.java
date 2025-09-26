package aula_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {

	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int dividendo = 0;
		int divisor = 0;
		boolean loop = true;
		
		do{
			
		try {
			
		System.out.println("Digite o Dividendo: ");
		dividendo = ler.nextInt();
				
		System.out.println("Digite o Divisor: ");
		divisor = ler.nextInt();
				
		divide(dividendo, divisor);
		loop = false;//se executar corretamente sai do loop infinito
		
		}catch(InputMismatchException e) {
			System.err.println("Digite valores inteiros." + e);
			ler.nextLine();//aqui executa novamente, volta para o começo 
		}catch(ArithmeticException e) {//o "e" captura o erro		
			System.err.println("Não existe divisão por zero!" + e);
			ler.nextLine();//aqui executa novamente, volta para o começo
		} finally {
			System.out.println("Obrigado pela preferência!");
		}//finally é opcional, executa se der certo ou errado
		
		}while(loop);//aqui está no loop infinito, se executar errado
	}
	

	public static void divide(int dividendo, int divisor) {
		System.out.println("Divisão = " + (dividendo / divisor));
	}

}
