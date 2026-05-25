package exercs_estrutura_sequencial.exerc9;

import java.util.Scanner;
import java.lang.Math;

public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n, quadrado, cubo, raizQuad, raizCub;

        System.out.print("Informe o número: ");
        n = scanner.nextDouble();

        quadrado = n * n;
        cubo = n * n * n;
        raizQuad = Math.sqrt(n);
        raizCub = Math.cbrt(n);

        System.out.print("\nNúmero " + n + " ao quadrado: " + quadrado);
        System.out.print("\nNúmero " + n + " ao cubo: " + cubo);
        System.out.print("\nRaiz quadrada do número " + n + ": " + String.format("%.2f", raizQuad));
        System.out.print("\nRaiz cúbica do número " + n + ": " + String.format("%.2f", raizCub));
    }
}
