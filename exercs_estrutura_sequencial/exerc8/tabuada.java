package exercicios.exercs_estrutura_sequencial.exerc8;

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.print("Informe o número: ");
        n = scanner.nextInt();

        System.out.print("\n" + n + " * 1 = " + n * 1);
        System.out.print("\n" + n + " * 2 = " + n * 2);
        System.out.print("\n" + n + " * 3 = " + n * 3);
        System.out.print("\n" + n + " * 4 = " + n * 4);
        System.out.print("\n" + n + " * 5 = " + n * 5);
        System.out.print("\n" + n + " * 6 = " + n * 6);
        System.out.print("\n" + n + " * 7 = " + n * 7);
        System.out.print("\n" + n + " * 8 = " + n * 8);
        System.out.print("\n" + n + " * 9 = " + n * 9);
        System.out.print("\n" + n + " * 10 = " + n * 10);
    }
}

