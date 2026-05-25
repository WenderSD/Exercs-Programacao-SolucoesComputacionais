package exercs_estrutura_sequencial.exerc10;

import java.util.Scanner;

public class gorjeta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor gasto no restaurante: ");
        double valor = scanner.nextDouble();

        double gorjeta = valor * 0.1;

        System.out.print("O valor da gorjeta é de: " + String.format("%.2f", gorjeta));
    }
}

