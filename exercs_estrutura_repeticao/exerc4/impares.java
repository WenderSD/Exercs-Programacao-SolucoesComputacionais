package exercicios.exercs_estrutura_repeticao.exerc4;

import java.util.Scanner;

public class impares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.print("Informe o número limite: ");
        numero = scanner.nextInt();

        for(int i = 1; i <= numero; i++){
            if(i % 2 != 0)
                System.out.println(i);
        }
    }
}

