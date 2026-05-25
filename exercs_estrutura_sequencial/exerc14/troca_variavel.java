package exercs_estrutura_sequencial.exerc14;

import java.util.Scanner;

public class troca_variavel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor de A: ");
        int a = scanner.nextInt();

        System.out.print("Informe o valor de B: ");
        int b = scanner.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.print("\nValor de A: " + a);
        System.out.print("\nValor de B: " + b);
    }
}


/*
a = a + b
b = (a + b) - b -> b = a;
a = a - b;

*/
