import java.util.Scanner;

//       Escreva um programa em Java que receba 3 números inteiros
//       representando as medidas dos lados de um triângulo.
//       O programa deverá verificar se os números lidos formam um triângulo.
//       Dado um triângulo com lados a, b e c, esse triângulo somente existirá se:
//       a + b > c
//       a + c > b
//       b + c > a
//       Se os números lidos formarem um triângulo, o programa deverá mostrar
//       qual seu tipo:
//       Equilátero (3 lados iguais)
//       Isósceles (2 lados iguais)
//       Escaleno (3 lados diferentes)

public class Main {
    public static void main(String[] args) {
        int a, b, c;

        Scanner scan;
        scan = new Scanner(System.in);

        System.out.println("Insira o lado A: ");
        a = scan.nextInt();

        System.out.println("Insira o lado B: ");
        b = scan.nextInt();

        System.out.println("Insira o lado C: ");
        c = scan.nextInt();

        if(a<(b+c) && b<(a+c) && c<(a+b)) {
            if (a == b && b == c)
                System.out.println("Triângulo Equilátero ");
            else if ( a == b || a == c || b == c)
                System.out.println("Triângulo Isóceles ");
            else
                System.out.println("Triângulo Escaleno ");
        }
        else
            System.out.println("Não forma um triângulo ");
    }
}