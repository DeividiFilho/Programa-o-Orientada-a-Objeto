public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(2);
        System.out.println("Área do quadrado: " + quadrado.calcularArea());

        Circulo circulo = new Circulo(1.5);
        System.out.println("Área do círculo: "+ circulo.calcularArea());

        Cubo cubo = new Cubo(2);
        System.out.println("Área do cubo: "+ cubo.calcularArea());
        System.out.println("Volume do cubo: "+ cubo.calcularVolume());
    }
}