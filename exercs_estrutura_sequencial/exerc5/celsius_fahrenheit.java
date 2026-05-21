package exercicios.exercs_estrutura_sequencial.exerc5;

import java.util.Scanner;

public class celsius_fahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double celsius, fahrenheit;

        System.out.print("Digite a temperatura em celsius: ");
        celsius = scanner.nextDouble();

        fahrenheit = (celsius * 1.8) + 32;

        System.out.println("\nTemperatura em fahrenheit: " + fahrenheit + "°F");
    }
}
