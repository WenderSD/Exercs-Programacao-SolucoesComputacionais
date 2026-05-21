package exercicios.exercs_estrutura_repeticao.exerc1;

import java.util.Scanner;

public class notas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a matrícula dos alunos e em seguida suas notas (digite -1 para finalizar):");

        System.out.println("Digite a matrícula do aluno: ");
        int matricula = scanner.nextInt();

        while(matricula != -1){
            System.out.print("Digite a primeira nota do aluno: ");
            double nota1 = scanner.nextDouble();

            System.out.print("Digite a segunda nota do aluno: ");
            double nota2 = scanner.nextDouble();

            System.out.print("Digite a terceira nota do aluno: ");
            double nota3 = scanner.nextDouble();

            double media = (nota1 + nota2 + nota3)/3;
            
            if(media >= 70){
                System.out.println("Aluno " + matricula + ": APROVADO");
            } else if(media >= 60){
                System.out.println("Aluno " + matricula + ": EXAME");
            }
            else{
                System.out.println("Aluno " + matricula + ": REPROVADO");
            }

            System.out.println("\nDigite a matrícula do próximo aluno: ");
            matricula = scanner.nextInt();
        }        
    }
}