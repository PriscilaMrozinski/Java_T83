package vetores;
import java.util.ArrayList;
import java.util.Scanner;

public class Atividade1comFor {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};

        System.out.print("Digite um número para pesquisar: ");
        int numero = leia.nextInt();
        int posicao = -1; //-1 para não pegar nenhum índice
    
        //loop para procurar o número do usuário
        for (int indice = 0; indice < vetor.length; indice++) {
            if (vetor[indice] == numero) {
                posicao = indice;
                break; 
            }
        }

        if (posicao != -1) {
            System.out.println("Número encontrado na posição: " + posicao);
        } else {
            System.out.println("Não foi encontrado!");
        }

        leia.close();
    }
}
