public class Main {
    public static void main(String[] args) {
        Departamento dep1 = new Departamento("Tecnologia da informação", "TI");
        Funcionario fun1 = new Funcionario("12344567", "Maria", 5000, dep1);
        Funcionario fun2 = new Funcionario("76544321", "Deivinho", 2500, dep1);

        dep1.adicionarFuncionarios(fun1,fun2);

        System.out.println("Total de folha de pagamentos: "+ dep1.calcularFolhaPagamento());

        Departamento dep2 = new Departamento("Markenting", "Mk");
        Funcionario fun3 = new Funcionario("43454355", "Junior", 3000, dep2);
        dep2.adicionarFuncionarios(fun3);

        System.out.println("Total de folha de pagamentos: "+ dep2.calcularFolhaPagamento());
    }
}
