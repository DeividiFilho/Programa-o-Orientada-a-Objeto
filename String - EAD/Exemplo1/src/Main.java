public class Main {
    // criação de String com literais de string
    String disciplina = "POOS3";
    // criação de String por meio de método construtor com literais de string como parâmetro
    String nome = new String("José Silva");
    // criação de String por meio de método construtor sem parâmetros (cria uma String vazia)
    String sobrenome = new String();
    //criação de String a partir de outro objeto do tipo String
    String nomeCompleto = new String(nome);

    char[] iniciaisMeses = {'j','f', 'm', 'a', 'm', 'j', 'j', 'a', 's', 'o', 'n', 'd'};
//criação de uma String a partir de um vetor de caracteres (string resultante = jfmamjjasond)
String meses = new String(iniciaisMeses);

//
}
