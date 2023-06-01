import data.PartidaDAO;
import data.PartidaSQLiteDAO;
import data.TimeDAO;
import data.TimeSQLiteDAO;
import model.Partida;
import model.Time;

public class Main {
    public static void main(String[] args) {
        System.out.println("FIFA Club World Cup!");
        Time t1 = new Time(1,"Corinthians - Brasil");
        Time t2 = new Time(2, "Chelsea - Inglaterra");

        TimeDAO timeDAO = new TimeSQLiteDAO();
        timeDAO.salvar(t1);
        timeDAO.salvar(t2);

        for (Time time: timeDAO.buscarTodos())
            time.mostrarDados();


        Partida partida = new Partida(1,"16/12/2012",
                t1,t2,0,0);

        PartidaDAO partidaDAO = new PartidaSQLiteDAO();
        partidaDAO.salvar(partida);

        System.out.println("\nHalf Time !");
        partida.atualizarResultado(1,0);
        partidaDAO.atualizar(partida);

        System.out.println("End." +
                "\nGuerreiro score" +
                "\nCorinthians is the CHAMPIONS !");
        for(Partida p : partidaDAO.buscarTodos())
            p.mostrarResultado();

    }
}