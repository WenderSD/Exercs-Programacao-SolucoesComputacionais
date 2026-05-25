package exercs_estrutura_condicional.exerc3;

import java.util.Scanner;

public class notas_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        float n1 = scanner.nextFloat();

        System.out.println("Digite a segunda nota: ");
        float n2 = scanner.nextFloat();

        System.out.println("Digite a terceira nota: ");
        float n3 = scanner.nextFloat();

        float media = (n1 + n2 + n3)/3;

        if(media >= 7 && media <= 10){
            System.out.println("Aprovado");
        } else if(media >= 3 && media < 7){
            System.out.println("Exame");
        } else if(media >= 0 && media < 3){
            System.out.println("Reprovado");
        } else{
            System.out.println("Nota inválida");
        }
    }
}
