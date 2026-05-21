package exercicios.exercs_estrutura_condicional.exerc7;

import java.util.Scanner;

public class salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o salário do funcionário: ");
        double salario = scanner.nextDouble();

        if (salario < 1000) {
            double salarioReajustado = salario * 1.3;
            System.out.println("Salário reajustado: R$ " + salarioReajustado);
        } else {
            System.out.println("O funcionário não tem direito ao aumento.");
        }
    }
}