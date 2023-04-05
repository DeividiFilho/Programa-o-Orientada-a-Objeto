import java.util.ArrayList;

public class Time {
    private String pais;
    private int qtdDeTitulos;
    private ArrayList<Jogador> jogadores = new ArrayList<>();

    public Time(String pais, int qtdDeTitulos) {
        this.pais = pais;
        this.qtdDeTitulos = qtdDeTitulos;
    }

    public void mostrarDados() {
        System.out.println("\nPaís: " + this.pais);
        System.out.println("Titulos: " + this.qtdDeTitulos);
        System.out.println("\nJogadores:");
        for (Jogador jogador : getJogadores()) {
            System.out.println("Nome: " + jogador.getNome() +
                    "\nPosição: " + jogador.getPosicao() +
                    "\nNúmero Camisa: " + jogador.getNumCamisa());
        }
    }

    public void addjogadores(Jogador jogador) {
        jogadores.add(jogador);
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getQtdDeTitulos() {
        return qtdDeTitulos;
    }

    public void setQtdDeTitulos(int qtdDeTitulos) {
        this.qtdDeTitulos = qtdDeTitulos;
    }

    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(ArrayList<Jogador> jogadores) {
        this.jogadores = jogadores;
    }
}
