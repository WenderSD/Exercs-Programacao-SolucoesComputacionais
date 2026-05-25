package exercs_estrutura_sequencial.exerc7;

import java.util.Scanner;

public class salario_minimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario, salarioMinimo, quantSalarios;

        System.out.print("Informe o seu salário: ");
        salario = scanner.nextDouble();

        System.out.print("Informe o salário mínimo: ");
        salarioMinimo = scanner.nextDouble();

        quantSalarios = salario/salarioMinimo;

        System.out.print("\nQuantidade de salários mínimos que você recebe: " + String.format("%.2f", quantSalarios));
    }
}
