import java.util.List;

public class Pizza extends Produto {
    private boolean bordaRecheada;
    private List<String> ingredientes;

    public Pizza(String descricao, double preco, boolean bordaRecheada) {
        super(descricao, preco);
        this.bordaRecheada = bordaRecheada;
        this.ingredientes = ingredientes;
    }

    public boolean isBordaRecheada() {
        return bordaRecheada;
    }

    public void setBordaRecheada(boolean bordaRecheada) {
        this.bordaRecheada = bordaRecheada;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void adicionarIngrediente(String ingrediente) {
        this.ingredientes.add(ingrediente);
    }
    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Borda recheada: " + bordaRecheada);
        System.out.println("Ingredientes:");
       // for (String ingrediente : ingredientes) {
       //     System.out.println("- " + ingrediente);
        //}
    }
  //  public void mostrarIngredientes() {
    //    System.out.println("Ingredientes da pizza:");
      //  for (String ingrediente : ingredientes) {
        //    System.out.println("- " + ingrediente);
       // }
    //}
}

/* Gera uma classe pizza onde pega o nome/sabor e se tem borda recheada (Os ingredientes, tive uma idéia de como
fazer, mas por conta do horário... deveria ter começado mais cedo :( )
E pizza herdou produto
 */
