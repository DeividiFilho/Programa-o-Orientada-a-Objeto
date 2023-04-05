// Exercício 1 – Considere a modelagem de um simples sistema para gerenciar jogos da
//Copa do Mundo de Futebol 2022. Implemente este sistema em Java.
//(Conceitos envolvidos neste exercício: criação de classes, encapsulamento,
//sobrecarga de método, associação entre classes, List e instanciação de objetos)
public class Main {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Cassio", "Goleiro", 12);
        Jogador jogador2 = new Jogador("Fagner", "Lateral Direito", 23);
        Jogador jogador3 = new Jogador("Gil", "Zagueiro", 4);
        Jogador jogador4 = new Jogador("Bruno Mendez", "Zagueiro", 25);
        Jogador jogador5 = new Jogador("Fabio Santos", "Lateral Esquerdo", 6);
        Jogador jogador6 = new Jogador("Roni", "Volante", 29);
        Jogador jogador7 = new Jogador("Fausto Vera", "Meia", 5);
        Jogador jogador8 = new Jogador("Renauto Augusto", "Meia", 8);
        Jogador jogador9 = new Jogador("Giuliano", "Meia", 20);
        Jogador jogador10 = new Jogador("Roger Guedes", "Atacante", 10);
        Jogador jogador11 = new Jogador("Yuri Alberto", "Atacante", 9);

        Time time1 = new Time("Corinthians", 1);
        // Sim, essa é a escalação do CORINTHIANS. Provável time que vai iniciar a libertadores dia 06/04/2022
        time1.addjogadores(jogador1);
        time1.addjogadores(jogador2);
        time1.addjogadores(jogador3);
        time1.addjogadores(jogador4);
        time1.addjogadores(jogador5);
        time1.addjogadores(jogador6);
        time1.addjogadores(jogador7);
        time1.addjogadores(jogador8);
        time1.addjogadores(jogador9);
        time1.addjogadores(jogador10);
        time1.addjogadores(jogador11);

        Jogador jogador12 = new Jogador("Wevertor", "Goleiro", 1);
        Jogador jogador13 = new Jogador("Marcos Rocha", "Lateral Direito", 2);
        Jogador jogador14 = new Jogador("Gustavo Gomez", "Zagueiro", 15);
        Jogador jogador15 = new Jogador("Murilo", "Zagueiro", 26);
        Jogador jogador16 = new Jogador("Piquerez", "Lateral Esquerdo", 22);
        Jogador jogador17 = new Jogador("Zé Rafael", "Volante", 8);
        Jogador jogador18 = new Jogador("Gabriel Menino", "Meia", 25);
        Jogador jogador19 = new Jogador("Rafael Veiga", "Meia", 23);
        Jogador jogador20 = new Jogador("Dudu", "Meia", 7);
        Jogador jogador21 = new Jogador("Rony", "Atacante", 10);
        Jogador jogador22 = new Jogador("Endrick", "Atacante", 9);
        // Time do Palmeiras dia 04/04/2023

        Time time2 = new Time("Palmeiras", 3);

        time2.addjogadores(jogador12);
        time2.addjogadores(jogador13);
        time2.addjogadores(jogador14);
        time2.addjogadores(jogador15);
        time2.addjogadores(jogador16);
        time2.addjogadores(jogador17);
        time2.addjogadores(jogador18);
        time2.addjogadores(jogador19);
        time2.addjogadores(jogador20);
        time2.addjogadores(jogador21);
        time2.addjogadores(jogador22);

        Estadio estadio = new Estadio("Neo Quimica arena", "São Paulo");
        Partida partida = new Partida("04/04/2023", "21:00", time1, time2, 2, 2, estadio);

        time1.mostrarDados();
        time2.mostrarDados();

        partida.mostrarDadosPartida();

        partida.atualizarResultado();

        System.out.println("FIM de Jogo");

        partida.mostrarResultadoPartida();
    }
}