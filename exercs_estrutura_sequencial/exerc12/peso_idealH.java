package exercicios.exercs_estrutura_sequencial.exerc12;

import java.util.Scanner;

public class peso_idealH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a sua altura: ");
        double altura = scanner.nextDouble();

        double pesoIdeal = (72.7 * altura) - 58;

        System.out.println("Peso ideal para sua altura: " + pesoIdeal);
    }
}
