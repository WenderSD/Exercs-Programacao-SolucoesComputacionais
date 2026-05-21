package exercicios.exercs_estrutura_repeticao.exerc5;

import java.util.Scanner;

public class temperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temperatura = 0;

        System.out.println("Informe as 10 temperaturas:");

        for(int i = 0; i < 10; i++){
            System.out.print("Digite a " + (i + 1) +"º temperatura: ");
            temperatura += scanner.nextDouble();
        }

        double mediaTemperaturas = temperatura/10;

        System.out.println("Média de temperaturas: " + mediaTemperaturas);
    }
}
