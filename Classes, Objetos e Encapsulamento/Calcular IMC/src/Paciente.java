public class Paciente {
    private String nome;
    private double peso;
    private double altura;

    public Paciente(String nome, double peso, double altura) {
        this.setNome(nome);
        this.setPeso(peso);
        this.setAltura(altura);
    }

    public double CalcularIMC(){
        double imc = peso / (altura * altura);
        System.out.printf("IMC: %.2f", imc);
        if (imc<18.5)
            System.out.println("\nAbaixo do peso");
        else if (imc<24.9)
            System.out.println("\nPeso normal");
        else if (imc < 29.9)
            System.out.println("\nAcima do peso");
        else if (imc < 34.9)
            System.out.println("\nObesidade I");
        else if (imc < 39.9)
            System.out.println("\nObesidade II");
        else if (imc >40)
            System.out.println("\nObesidade III");

        return imc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
