package exercicios.exercs_estrutura_condicional.exerc8;

import java.util.Scanner;

public class nadador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a sua idade: ");
        int idade = scanner.nextInt();

        if (idade <= 7) {
            System.out.println("INFANTIL");
        } else if(idade <= 10){
            System.out.println("JUVENIL");
        } else if(idade <= 15){
            System.out.println("ADOLESCENTE");
        } else if(idade <= 30){
            System.out.println("ADULTO");
        } else {
            System.out.println("SENIOR");
        }
    }
}
