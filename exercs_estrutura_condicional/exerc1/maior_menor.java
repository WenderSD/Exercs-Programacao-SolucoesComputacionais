package exercicios.exercs_estrutura_condicional.exerc1;

import java.util.Scanner;

public class maior_menor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int n2 = scanner.nextInt();

        if(n1 > n2){
            System.out.println("Maior número: " + n1);
            System.out.println("Menor número: " + n2);
        } else if(n2 > n1){
            System.out.println("Maior número: " + n2);
            System.out.println("Menor número: " + n1);
        } else{
            System.out.println("Os números são iguais");
        }
    }
}