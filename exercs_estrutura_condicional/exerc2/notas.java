package exercs_estrutura_condicional.exerc2;

import java.util.Scanner;

public class notas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        int n1 = scanner.nextInt();

        System.out.println("Digite a segunda nota: ");
        int n2 = scanner.nextInt();

        float media = (n1 + n2)/2;

        if(media >= 7){
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado");
        }
    }
}
