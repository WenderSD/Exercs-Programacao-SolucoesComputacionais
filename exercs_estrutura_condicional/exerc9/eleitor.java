package exercs_estrutura_condicional.exerc9;

import java.util.Scanner;

public class eleitor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 16) {
            System.out.println("Classificação: Não eleitor");
        } else if (idade < 18) {
            System.out.println("Classificação: Eleitor facultativo");
        } else if (idade < 65) {
            System.out.println("Classificação: Eleitor obrigatório");
        } else {
            System.out.println("Classificação: Eleitor facultativo");
        }
    }
}
