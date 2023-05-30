import data.*;
import model.Departamento;
import model.Funcionario;

public class Main {
    public static void main(String[] args) {
        Departamento departamento = new Departamento(1,"ENG BioMed e BioFis", "ENG BIOMED");
        Funcionario funcionario = new Funcionario(1,"123456","Júlia Marcelo",departamento);

        Departamento departamento1 = new Departamento(2, "Análise e Desenvolvimento de Sistemas", "ADS");
        Funcionario funcionario1 = new Funcionario(2, "213456", "Deividi Filho", departamento);

        DepartamentoDAO departamentoDAO = new DepartamentoSQLiteDAO();
        departamentoDAO.salvar(departamento);
        departamentoDAO.salvar(departamento1);


        FuncionarioDAO funcionarioDAO = new FuncionarioSQLiteDAO();
        funcionarioDAO.salvar(funcionario);
        funcionarioDAO.salvar(funcionario1);

        for (Funcionario f: funcionarioDAO.buscarTodos())
            f.mostrarDados();
    }
}
