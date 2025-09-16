import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String animal1, animal2, animal3;
        String resultado = "";

        System.out.print("Digite o tipo de animal: (vertebrado ou invertebrado)");
        animal1 = leia.nextLine();

        System.out.print("Digite o sub-tipo de animal: (ave, mamifero, inseto ou anelideo)");
        animal2 = leia.nextLine();

        System.out.print("Digite o sub-tipo de animal: (carnivoro, onivoro, herbivoro ou hematofago)");
        animal3 = leia.nextLine();

        if (animal1.equalsIgnoreCase("vertebrado")) {
            switch (animal2.toLowerCase()) { 
                case "ave":
                    if (animal3.equalsIgnoreCase("carnivoro")) {
                        resultado = "Águia";
                    } else if (animal3.equalsIgnoreCase("onivoro")) {
                        resultado = "Pomba";
                    }
                    break;
                   //método toLowerCase(): transforma todos os caracteres de uma string em letras minúsculas. 
                   //método equalsIgnoreCase(): compara duas strings ignorando se estão em letras maiúsculas ou minúsculas.
                case "mamifero":
                    if (animal3.equalsIgnoreCase("onivoro")) {
                        resultado = "Homem";
                    } else if (animal3.equalsIgnoreCase("herbivoro")) {
                        resultado = "Vaca";
                    }
                    break;
            }

        } else if (animal1.equalsIgnoreCase("invertebrado")) {
            switch (animal2.toLowerCase()) {
                case "inseto":
                    if (animal3.equalsIgnoreCase("hematofago")) {
                        resultado = "Pulga";
                    } else if (animal3.equalsIgnoreCase("herbivoro")) {
                        resultado = "Lagarta";
                    }
                    break;

                case "anelideo":
                    if (animal3.equalsIgnoreCase("hematofago")) {
                        resultado = "Sanguessuga";
                    } else if (animal3.equalsIgnoreCase("onivoro")) {
                        resultado = "Minhoca";
                    }
                    break;
            }
        }

        if (!resultado.equals("")) {
            System.out.println("Animal escolhido: " + resultado);
        } else {
            System.out.println("Opções inválidas. Verifique sua entrada.");
        }

        leia.close();
    }
}
