package exercs_estrutura_sequencial.exerc4;

import java.util.Scanner;

public class area_losango {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double diagonalMaior, diagonalMenor, area;

        System.out.print("Digite a diagonal maior do losango: ");
        diagonalMaior = scanner.nextDouble();

        System.out.print("Digite a diagonal menor do losango:");
        diagonalMenor = scanner.nextDouble();

        area = (diagonalMaior * diagonalMenor)/2;

        System.out.println("\nÁrea do losango " + area);
    }
}
