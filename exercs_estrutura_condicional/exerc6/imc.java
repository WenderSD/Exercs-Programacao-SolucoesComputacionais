package exercs_estrutura_condicional.exerc6;

import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pesoIdeal;

        System.out.print("Informe o seu peso: ");
        double peso = scanner.nextDouble();

        System.out.print("Informe a sua altura: ");
        double altura = scanner.nextDouble();

        double imc = peso/(altura * altura);

        System.out.println("IMC: " + imc);
        if(imc < 20){
            System.out.println("Abaixo do peso");
        } else if( imc < 25){
            System.out.println("Peso normal");
        } else if(imc < 30){
            System.out.println("Sobre peso");
        } else if(imc < 40){
            System.out.println("Obeso");
        } else {
            System.out.println("Obeso Mórbido");
        }
    }
}
