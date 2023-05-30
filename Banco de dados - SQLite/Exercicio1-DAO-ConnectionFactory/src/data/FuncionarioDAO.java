package data;

import model.Funcionario;

import java.util.List;

public interface FuncionarioDAO extends DAO<Funcionario> {
    void salvar (Funcionario f);
    void atualizar(Funcionario f);
    void apagar  (Funcionario f);
    Funcionario buscar (int id);
    List<Funcionario> buscarTodos();
}