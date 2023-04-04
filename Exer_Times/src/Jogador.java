public class Jogador {

        private String nome;
        private String posicao;
        private Integer Camisa;

        public Jogador(String nome, String posicao, Integer camisa) {
            this.nome = nome;
            this.posicao = posicao;
            Camisa = camisa;
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

        public int getCamisa() {
            return Camisa;
        }

        public void setCamisa(Integer camisa) {
            Camisa = camisa;
        }
}


