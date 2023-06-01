import data.*;
import model.Candidato;
import model.Cargo;
import model.Partido;


public class Main {
    public static void main(String[] args) {
        Partido partido1 = new Partido(1, " Partido Liberal", " PL");
        Partido partido2 = new Partido(2, " Partido Conservador", " PC");

        PartidoDAO partidoDAO = new PartidoSQLiteDAO();
        partidoDAO.salvar(partido1);
        partidoDAO.salvar(partido2);

        Cargo cargo1 = new Cargo(10, " Deputado Federal");
        Cargo cargo2 = new Cargo(20, " Presidente");

        CargoDAO cargoDAO = new CargoSQLiteDAO();
        cargoDAO.salvar(cargo1);
        cargoDAO.salvar(cargo2);

        Candidato candidato1 = new Candidato(1010, " Juan Queiroz", cargo1, partido1);
        Candidato candidato2 = new Candidato(2020, " Deividi De Carlo", cargo2, partido2);

        CandidatoDAO candidatoDAO = new CandidatoSQLiteDAO();
        candidatoDAO.salvar(candidato1);
        candidatoDAO.salvar(candidato2);

        System.out.println("\nPartidos:");
        for (Partido p : partidoDAO.buscarTodos())
            p.mostrarDados();


        System.out.println("\nCargos");
        for (Cargo c :cargoDAO.buscarTodos())
            c.mostrarDados();

        System.out.println("\nCandidatos:");
        for (Candidato c : candidatoDAO.buscarTodos())
            c.mostrarDados();
    }
}