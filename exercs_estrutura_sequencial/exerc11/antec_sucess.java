package exercicios.exercs_estrutura_sequencial.exerc11;

import java.util.Scanner;

public class antec_sucess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número: ");
        int n = scanner.nextInt();

        int antec = n - 1;
        int sucess = n + 1;

        int dobro = n * 2;
        double metade = n/2.0;

        System.out.println("Antecessor: " + antec);
        System.out.println("Sucessor: " + sucess);
        System.out.println("Dobro: " + dobro);
        System.out.println("Metade: " + metade);
    }
}
