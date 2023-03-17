//3. Faça um programa em Java que leia 5 notas de um aluno. Em seguida, o
//        programa deverá calcular a média destas notas e mostrar quais delas estão
//      acima desta média.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int TAM = 5;
        double[] notas = new double[TAM];
        Scanner scan = new Scanner(System.in);

        double soma = 0;

        for(int i=0; i<TAM; i++){
            System.out.println("Insira a nota " +(i+1)+ ":");
            notas[i] = scan.nextDouble();
            soma += notas[i];
        }
        double media = soma/TAM;
        System.out.println("A média é: " +media);

        System.out.println("Notas maiores que a meédia: ");

        for(int i=0; i<TAM; i++){
            if(notas[i]>media)
                System.out.println("A notas são: "+ notas[i]);
        }
    }
}