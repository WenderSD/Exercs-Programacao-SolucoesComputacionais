package exercicios.exercs_estrutura_repeticao.exerc2;

import java.util.Scanner;

public class salarios {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cont = 0, filhos = 0;
        double somaSalarios = 0;
        double somaFilhos = 0;

        System.out.println("Informe o salário e o número de filhos dos cidadãos (digite um salário negativo para terminar):");

        System.out.println("Digite o salário do cidadão: ");
        double salario = scanner.nextDouble();

        while(salario >= 0){

            System.out.println("Digite o número de filhos do cidadão: ");
            filhos = scanner.nextInt();

            cont++;

            somaSalarios += salario;
            somaFilhos += filhos;

            System.out.println("Digite o salário do cidadão: ");
            salario = scanner.nextDouble();            
        } 
        
        double mediaSalarios = somaSalarios / cont;
        double mediaFilhos = somaFilhos / cont;

        System.out.println("Média de salário dos cidadãos: " + mediaSalarios);
        System.out.println("Média de filhos dos cidadãos: " + mediaFilhos);
    }
}