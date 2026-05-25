package exercs_estrutura_repeticao.exerc3;

import java.util.Scanner;

public class dobro_valores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] valores = new int[5];

        System.out.println("Informe 5 valores para receber o seu dobro:");

        for(int i = 0; i < valores.length; i++){
            System.out.print("Digite o " + (i + 1) +"º valor: ");
            valores[i] = scanner.nextInt();
        }

        for (int num : valores) {
            System.out.println(num + " => " + num * 2);
        }
    }
}
