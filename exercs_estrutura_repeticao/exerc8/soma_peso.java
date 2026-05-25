package exercs_estrutura_repeticao.exerc8;

import java.util.Scanner;

public class soma_peso {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maiorQueNoventa = 0;
        double soma = 0;

        System.out.println("Informe o peso de 7 pessoas:");

        for(int i = 1; i <= 7; i++){
            System.out.print("Peso da " + i + "º pessoa: ");
            double peso = scanner.nextDouble();

            if(peso > 90)
                maiorQueNoventa++;

            soma += peso;
        }

        double media = soma / 7;
        
        System.out.println("Media das notas: " + media);
        System.out.println("Quantidade de pessoas acima de 90 kg: " + maiorQueNoventa);
    }
}


