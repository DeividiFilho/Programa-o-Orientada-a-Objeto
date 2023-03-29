public class Main {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica("1234567810",
                "Maria", "Rua A, n10", "3351-1234", "maria@poo.com.br");

        PessoaJuridica pessoaJuridica = new PessoaJuridica("111222333000190",
                "Empresa S/A", "Empresa XPTO", "Rua B, n 20", "3351-9090",
                "empresa@empresa.com.br");

        System.out.println(pessoaFisica.getNome());

        System.out.println(pessoaFisica.getEmail());
    }
}
