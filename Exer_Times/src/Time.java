import java.util.ArrayList;

public class Time {

        private String pais;

        private Integer qttTitulos;

        private ArrayList<Jogador> jogadores = new ArrayList<>();

        public Time(String pais, Integer qttTitulos) {
            this.pais = pais;
            this.qttTitulos = qttTitulos;
        }

        public void mostrarDados(){
            System.out.println("----------------------");
            System.out.println("País: "+this.pais);
            System.out.println("Titulos: "+this.qttTitulos);
            System.out.println("\nJogadores:");
            for(Jogador jogador : getJogadores()){
                System.out.println("Nome: "+jogador.getNome() +
                        "\nPosição: "+jogador.getPosicao() +
                        "\nCamisa: " +jogador.getCamisa() +
                        "\n----------------------");
            }
        }

        public void addjogadores(Jogador jogador){jogadores.add(jogador);}

        public String getPais() {
            return pais;
        }

        public void setPais(String pais) {
            this.pais = pais;
        }

        public Integer getQttTitulos() {
            return qttTitulos;
        }

        public void setQttTitulos(Integer qttTitulos) {
            this.qttTitulos = qttTitulos;
        }

        public ArrayList<Jogador> getJogadores() {
            return jogadores;
        }

        public void setJogadores(ArrayList<Jogador> jogadores) {
            this.jogadores = jogadores;
        }
}
