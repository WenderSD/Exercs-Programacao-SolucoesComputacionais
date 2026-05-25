package exercs_estrutura_condicional.exerc12;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número");
        double n1 = scanner.nextDouble();

        System.out.println("Digite outro número");
        double n2 = scanner.nextDouble();

        System.out.println("1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir\n5 - Sair");

        System.out.println("\nDigite o número da operação desejada: ");
        int operacao = scanner.nextInt();

        switch (operacao) {
            case 1:
                System.out.println(n1 +  " + " + n2 + " = " + (n1 + n2));
                break;
            case 2:
                System.out.println(n1 +  " - " + n2 + " = " + (n1 - n2));
                break;
            case 3:
                System.out.println(n1 +  " * " + n2 + " = " + (n1 * n2));
                break;
            case 4:
                System.out.println(n1 +  " / " + n2 + " = " + (n1 / n2));
                break;
            case 5:
                System.out.println("Saindo da calculadora...");
                break;
            default:
                System.out.println("Operação inválida");
        }
    }
}
