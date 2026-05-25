package exercs_estrutura_sequencial.exerc15;

import java.util.Scanner;

public class eleicoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número de eleitores: ");
        double totalEleitores = scanner.nextDouble();

        System.out.print("Informe o número de eleitores do candidato 1: ");
        int eleitoresUm = scanner.nextInt();

        System.out.print("Informe o número de eleitores do candidato 2: ");
        int eleitoresDois = scanner.nextInt();

        double nulos = totalEleitores - eleitoresUm - eleitoresDois;
        
        double porcEleitoresUm = eleitoresUm/totalEleitores * 100.0;
        double porcEleitoresDois = eleitoresDois/totalEleitores * 100.0;
        double porcNulos = nulos/totalEleitores * 100.0;

        System.out.println("\nPorcentagem de votos para o candidato 1: " + String.format("%.2f", porcEleitoresUm) + " %");
        System.out.println("Porcentagem de votos para o candidato 2: " + String.format("%.2f", porcEleitoresDois) + " %");
        System.out.println("Porcentagem de votos nulos: " + String.format("%.2f", porcNulos) + " %");
    }
}
