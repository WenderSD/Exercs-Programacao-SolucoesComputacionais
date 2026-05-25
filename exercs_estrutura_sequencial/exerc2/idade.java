package exercs_estrutura_sequencial.exerc2;

import java.util.Scanner;

public class idade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int anoNascimento;
        int anoAtual = 2026;

        System.out.print("Escreva o ano do seu19 nascimento: ");
        anoNascimento = scanner.nextInt();
        
        int idade = anoAtual - anoNascimento;
        int idadeFutura = 2050 - anoNascimento;

        System.out.println("Você tem " + idade + " anos");
        System.out.println("Você terá " + idadeFutura + " anos em 2050");
    }
}
