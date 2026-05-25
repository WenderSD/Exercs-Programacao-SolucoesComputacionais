package exercs_estrutura_sequencial.exerc3;

import java.util.Scanner;

public class dolar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cotacaoDolar, dolares;

        System.out.print("Digite a cotação atual do dólar: ");
        cotacaoDolar = scanner.nextDouble();

        System.out.print("Digite a quantia em dólares: ");
        dolares = scanner.nextDouble();

        double reais = cotacaoDolar * dolares;

        System.out.println("\nValor em reais: " + reais);
    }
}
