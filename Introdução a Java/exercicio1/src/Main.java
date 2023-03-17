// Faça um programa em Java que calcule o montante acumulado em um
//  M = C * (1 + taxa) ^ tempo
//        investimento. O usuário deverá fornecer como entradas: capital aplicado,
//        taxa de juros anual (formato decimal) e o tempo da aplicação (em anos).
// Fórmula dos juros compostos:
// M = C * (1 + taxa) ^ tempo

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

        System.out.println("Digite o saldo inicial: ");
        double capital = scan.nextDouble();

        System.out.println("Digite a taxa de juros: ");
        double taxa = scan.nextDouble();

        System.out.println("Digite o tempo: ");
        int tempo = scan.nextInt();

        double montante =  capital * Math.pow(1+taxa,tempo);

        System.out.printf("Montante: %.2f ", montante);


    }
}