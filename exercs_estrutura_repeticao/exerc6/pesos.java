package exercicios.exercs_estrutura_repeticao.exerc6;

import java.util.Scanner;

public class pesos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantHomens = 0, quantMulheres = 0;

        System.out.println("Informe as 10 temperaturas:");

        for(int i = 0; i < 10; i++){
            System.out.print("Digite o sexo da " + (i+1) + "º pessoa: ");
            String sexo = scanner.next();

            System.out.print("Digite o peso da " + (i+1) + "º pessoa: ");
            double peso = scanner.nextDouble();
            
            if(sexo.equals("M") && peso >= 60 && peso < 80)
                quantHomens++;
            else if(sexo.equals("F") && peso >= 50 && peso < 70)
                quantMulheres++;

            System.out.println();
        }

        System.out.println("Quantidade de homens entre 60 e 80 kg: " + quantHomens);
        System.out.println("Quantidade de mulheres entre 50 e 70: " + quantMulheres);
    }
}

