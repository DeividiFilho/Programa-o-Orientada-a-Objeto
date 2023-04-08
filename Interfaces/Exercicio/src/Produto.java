public abstract class Produto implements IPrint {
    private String descricao;
    private Clientes clientes;

    // Por ser abstract não precisa implementat o mostrardados


    public Produto(String descricao, Clientes clientes) {
        this.descricao = descricao;
        this.clientes = clientes;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }
}

