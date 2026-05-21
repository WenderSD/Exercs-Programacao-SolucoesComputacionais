package exercicios.exercs_estrutura_sequencial.exerc6;

import java.util.Scanner;
import java.lang.Math;

public class equacao_secgrau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a, b, c, delta, x1, x2;

        System.out.print("Informe o coeficiente A: ");
        a = scanner.nextDouble();

        System.out.print("Informe o coeficiente B: ");
        b = scanner.nextDouble();

         System.out.print("Informe o coeficiente C: ");
        c = scanner.nextDouble();

        delta = (b * b) - (4 * a * c);

        x1 = (-b + Math.sqrt(delta))/(2 * a);
        x2 = (-b - Math.sqrt(delta))/(2 * a);

        System.out.println("\nPrimeira raiz da equação: " + x1);
        System.out.println("Segunda raiz da equação: " + x2);
    }
}
