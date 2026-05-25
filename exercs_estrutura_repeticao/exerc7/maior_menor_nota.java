package exercs_estrutura_repeticao.exerc7;

import java.util.Scanner;

public class maior_menor_nota {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe as notas de 5 alunos:");

        System.out.print("Nota do 1º aluno: ");
        double nota = scanner.nextDouble();

        double maior = nota;
        double menor = nota;

        for(int i = 2; i <= 5; i++){
            System.out.print("Nota do " + i + "º aluno: ");
            nota = scanner.nextDouble();

            if(nota > maior)
                maior = nota;

            if(nota < menor)
                menor = nota;
        }
        
        System.out.println("Maior nota:" + maior);
        System.out.println("Menor nota: " + menor);
    }
}


