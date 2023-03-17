//4 Faça um programa em Java que leia 2 arrays A e B, de cinco posições
//   cada, para armazenar números inteiros. Crie um terceiro array C composto
//   pela soma dos números contidos em A e B.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] vetA = new int[5];
        int[] vetB = new int[5];
        int[] vetC = new int[5];

        Scanner scan = new Scanner(System.in);

        for(int i=0; i<5; i++){
            System.out.println("Digite o valor " + (i+1) + "° para o vetor A: ");
            vetA[i] = scan.nextInt();

            System.out.println("Digite o valor " + (i+1) + "° para o vetor B: ");
            vetB[i] = scan.nextInt();
            vetC[i] = vetA[i] + vetB[i];
        }
        System.out.println("O vetor C: ");

        for(int v:vetC)
            System.out.println(v);
    }

}