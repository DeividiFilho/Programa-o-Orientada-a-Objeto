public class Jogador {
    private String nome;
    private String posicao;
    private int numCamisa;

    public Jogador(String nome, String posicao, int numCamisa) {
        this.nome = nome;
        this.posicao = posicao;
        this.numCamisa = numCamisa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getNumCamisa() {
        return numCamisa;
    }

    public void setNumCamisa(int numCamisa) {
        this.numCamisa = numCamisa;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", posicao='" + posicao + '\'' +
                ", numCamisa=" + numCamisa +
                '}';
    }
}
