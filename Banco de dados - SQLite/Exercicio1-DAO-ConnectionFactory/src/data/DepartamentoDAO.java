package data;
import model.Departamento;

import java.util.List;

public interface DepartamentoDAO extends DAO<Departamento> {
    void salvar (Departamento d);
    void atualizar(Departamento d);
    void apagar  (Departamento d);
    Departamento buscar (int id);
    List<Departamento> buscarTodos();

}