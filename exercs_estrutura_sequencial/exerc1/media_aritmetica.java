package exercicios.exercs_estrutura_sequencial.exerc1;

import java.util.Scanner;

public class media_aritmetica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int a = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int b = scanner.nextInt();
        
        System.out.println("Digite o terceiro número: ");
        int c = scanner.nextInt();

        float media = (a + b + c) / 3;
        
        System.out.println("Media dos números: " + media);
    }
}
