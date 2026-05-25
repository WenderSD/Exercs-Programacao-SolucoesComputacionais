package exercs_estrutura_condicional.exerc5;

import java.util.Scanner;

public class peso_ideal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pesoIdeal;

        System.out.print("Informe o seu sexo (F/M): ");
        String sexo = scanner.next();

        System.out.print("Informe a sua altura: ");
        double altura = scanner.nextDouble();

        if(sexo.equals("M")){
            pesoIdeal = (72.7 * altura) - 58;
        } else{
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println(sexo);
        }

        System.out.println("Peso ideal para sua altura e sexo: " + pesoIdeal);
    }
}
