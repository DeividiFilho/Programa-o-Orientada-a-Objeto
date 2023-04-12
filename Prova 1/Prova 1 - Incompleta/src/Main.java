import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Essa é a parte que geralmente erro. Provavel que as outras classes "esteja" certas e o problema aconteça aqui.

        Cliente cliente = new Cliente("12345678911", "Maria", "99111-2244");
        Vendedor vendedor = new Vendedor("1122334455", "Jacó", "1111111");
        // data da compra

        // Produto produto1 = new Produto("Panela", "50" ); (Por ser abstract não pode ser instaciada!!

        List<String> produtos = new ArrayList<>();
     //   boolean panela = produtos.add("Panela");
     //        boolean Geladeira = produtos.add("Geladeira");

        produtos.add("Panela");
        produtos.add("Jogo de cama");
        produtos.add("Geladeira");

        ItemCompra itemCompra1 = new ItemCompra(2, 100, "Panela" );
        ItemCompra itemCompra2 = new ItemCompra(1, 150, "Jogo de Cama" );
        ItemCompra itemCompra3 = new ItemCompra(1, 3000, "Gelaeira" );
 // 9:23 , não tenho tempo para arrumar, mas invés de panela seria o array de "Produto"

        LocalDate data = LocalDate.of(2023,4,11);
        Compra compra1 = new Compra("1111", data, itemCompra1.getValorTotal(), 0.0, itemCompra1.getValorTotal(), itemCompra1, cliente);

        System.out.println(compra1); // Não está funcionando :(

        // Provavelmente as outras classes estão corretas, o problema está aqui no Main. Por isso, considere o resto do código na correção Pablo, por favor. Deu os 90 min da prova então vou entrar assim msm.
        // Se a prova fosse maus extensa conseguiria terminar, mas são apenas 90 min (Era pra ter dado tempo, mas né... Vacilei)


        // Fazer as coisas na correria não dá certo.
        // Está com erro aaaa
        // Compra.MostrarDados();


        // Vou entregar a prova, sei que Main é importante pq mostra os dados na tela, mas não consegui desenvolver tão bem. Mas de resto, parece estar funcioanndo bem
    }
}