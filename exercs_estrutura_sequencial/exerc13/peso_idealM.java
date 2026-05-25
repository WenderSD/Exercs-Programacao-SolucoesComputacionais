package exercs_estrutura_sequencial.exerc13;

import java.util.Scanner;

public class peso_idealM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a sua altura: ");
        double altura = scanner.nextDouble();

        double pesoIdeal = (62.1 * altura) - 44.7;

        System.out.println("Peso ideal para sua altura: " + String.format("%.2f", pesoIdeal));
    }
}
