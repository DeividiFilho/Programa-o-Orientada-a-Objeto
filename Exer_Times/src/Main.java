public class Main {
        public static void main(String[] args) {

            Jogador jogador1 = new Jogador("Neymar", "Meia", 10);

            Jogador jogador2 = new Jogador("Cristiano Ronaldo", "Atacante", 7);

            Time time1 = new Time("Brasil", 5);

            Time time2 = new Time("Portugal", 0);

            Estadio estadio = new Estadio("Morumbi", "São Paulo");

            Partida partida = new Partida("04/04/2023", "20:00", time1, time2, 0, 0, estadio);

            time1.addjogadores(jogador1);
            time2.addjogadores(jogador2);

            time1.mostrarDados();
            time2.mostrarDados();

            partida.mostrarDadosPartida();

            System.out.println("\n ------- GOLLLLL DO BRASILL -------\n ");

            partida.atualizarResultado();

            System.out.println("\n----- FINAL DE JOGO, BRASIL BATE PORTUGAL ----- \n");

            partida.mostrarResultadoPartida();
        }
}
