package exercs_estrutura_condicional.exerc4;

import java.util.Scanner;

public class triangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro lado do triangulo: ");
        float a = scanner.nextFloat();

        System.out.println("Digite o segundo lado do triangulo: ");
        float b = scanner.nextFloat();

        System.out.println("Digite o terceiro lado do triangulo: ");
        float c = scanner.nextFloat();

        if(a < b + c && b < a + c && c < a + b){
            System.out.println("Podem formar um triangulo");
        } else {
            System.out.println("Não podem formar um triangulo");
        }
    }
}
