import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("BEM VINDO");
        System.out.println("Vamos calcular seu IMC");

        System.out.println("Insira seu nome: ");
        String nome = scan.nextLine();

        System.out.println("Insira seu peso: ");
        double peso = scan.nextDouble();

        System.out.println("Insira sua altura: ");
        double altura = scan.nextDouble();

        Paciente paciente1 = new Paciente(nome, peso, altura);
        paciente1.CalcularIMC();
    }
}