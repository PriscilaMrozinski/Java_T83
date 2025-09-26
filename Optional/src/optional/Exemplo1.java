package optional;

import java.util.Optional;

public class Exemplo1 {

    public static void main(String[] args) {
        String[] palavras = new String[10];//aqui é um Array de 10 posições

        for (var palavra : palavras) {
            System.out.println(palavra);
        }

        Optional<String> checaNulo = Optional.ofNullable(palavras[5]);//Aqui ele quer buscar a posição 5

        if (checaNulo.isPresent()) {
            String palavra = palavras[5].toLowerCase();
            System.out.println(palavra);
        } else {
            System.out.println("O valor é nulo.");
        }
    }
}