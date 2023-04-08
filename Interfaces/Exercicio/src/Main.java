public class Main {
    public static void main(String[] args) {
        Clientes cliente = new Clientes("123", "Maria");

        Corrente corrente = new Corrente("Especial",
                cliente,
                "1010",
                1000,
                500);

        corrente.calcularTributo();
        cliente.mostrarDados();
        corrente.mostrarDados();
    }
}