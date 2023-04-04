public class Main {
    public static void main(String[] args) {

        // O método length() retorna um inteiro representando o tamanho da String. Veja o exemplo a seguir:
        String str = "Programação Orientada a Objetos";
        int stringLenght = str.length();
        System.out.println(stringLenght); // imprime '31'

        // Para obter um caracter de um determinado índice da sequência de caracteres, deve-se utilizar o método 'chatAt()'.
        // O método recebe um valor inteiro como parâmetro e retorna o char posicionado no índice representado por esse inteiro,
        // sendo que a sequência de caracteres começa com o índice '0', como em um vetor. Veja o exemplo:

        String str1 = "Programação Orientada a Objetos";
        System.out.println(str.charAt(2)); // imprime 'o', terceiro caractere, índice 2.
        // O comando a seguir resulta em erro, pois a sequência tem 31 caracteres (índices 0 a 30)
        //System.out.println(str.charAt(31));

        // O método 'indexOf()', por sua vez, recebe uma String como parâmetro (substring) e localiza a primeira ocorrência
        // do conteúdo dessa substring na String cujo método foi invocado. Se o método localizar, é retornado o índice do
        // primeiro caractere da substring na String, caso contrário retorna -1. Veja o exemplo:

        String str2 = "Programação Orientada a Objetos";
        System.out.println(str.indexOf("ação")); //imprime '7'

        // O método substring() permite criar uma nova String a partir da extração de uma substring de uma String base.
        // Há duas assinaturas mais utilizadas para este método. A primeira recebe um inteiro representando a posição
        // inicial na String base, retornando uma nova String da posição indicada até o final da String base.
        // A segunda assinatura recebe dois inteiros, um representando a posição inicial e outro a posição final
        // (não inclusiva) dentro String base, retornando, assim, uma nova String. Veja o exemplo:

        String str3 = "Programação Orientada a Objetos";
        System.out.println(str.substring(7)); //imprime "ação Orientada a Objetos"
        System.out.println(str.substring(7,11)); //imprime "ação". O índice 11 não entra a substring.

        // Um método com finalidade bastante semelhante é o getChars(), que retorna um vetor contendo um subconjunto
        // de caracteres dentro de uma String base. A diferença principal entre os métodos é que o getChar() retorna
        // um vetor de chars, não uma String. Esse método possui os seguintes parâmetros de entrada:
        //
        //srcBegin – Índice do primeiro caractere da string a ser copiada;
        //srcEnd - Índice depois do último caractere a ser copiado;
        //dst – O destino do array;
        //dstBegin – Deslocamento no array de destino.
        //
        //Veja o exemplo:

        String str4 = "Programação Orientada a Objetos";
        char[] var1 = new char[11];
        str.getChars(12, 21, var1, 2); //cria um array com os elementos
        // ['','','O','r','i','e','n','t','a','d','a']. //Note o deslocamento no início.

        //Imprime o array
        System.out.print("[");
        for (int i = 0; i < var1.length; i++) {
            System.out.print(var1[i]);
            if(i < var1.length-1)
                System.out.print(",");
            else
                System.out.print("]");
        }

        // De fato, Strings não apenas podem ser vistas conceitualmente como vetores de caracteres como também podem
        // ser convertidas para a representação de vetor. Isso é feito por meio do método toCharArray(),
        // como no exemplo a seguir:

        String str5 = "Programação Orientada a Objetos";
        char[] var11 = str.toCharArray();

        //imprime [P,r,o,g,r,a,m,a,ç,ã,o, ,O,r,i,e,n,t,a,d,a, ,a, ,O,b,j,e,t,o,s]
        System.out.print("[");
        for (int i = 0; i < var11.length; i++) {
            System.out.print(var11[i]);
            if(i < var11.length-1)
                System.out.print(",");
            else
                System.out.print("]");
        }

        // Muitas vezes desejamos retirar espaços em branco antes e depois de uma String. Essa é uma ação segura
        // quando trabalhamos, por exemplo, com  strings representando username ou senha. Imagine que, acidentalmente,
        // um cliente se cadastre no sistema com username "joao " (com um espaço no final). Muito provavelmente, esse
        // usuário teria problemas em visualizar o próprio erro e problemas ainda maiores ao tentar acessar a conta
        // criada, pois  "joao".equals("joao ") possui valor booleano falso, certo?
        //
        //Em casos como esse é importante se utilizar o método trim(), que remove espaços em branco antes e depois
        // de uma determinada String. Veja o exemplo:

        String val = "          IFSP - São Carlos ";
        System.out.println(val.trim()); // imprime "IFSP - São Carlos" (sem espaços nos extremos)

        // Em situações semelhantes, pode-se criar por conveniência uma nova String a partir de uma String base na
        // qual todos os caracteres são escritos em minúsculo ou maiúsculo. Isso pode ser feito utilizando,
        // respectivamente, os métodos toLowerCase() e toUpperCase(), como no exemplo a seguir:

        String val2 = "IFSP - São Carlos";
        System.out.println(val2.toLowerCase()); // imprime "ifsp - são carlos"
        System.out.println(val2.toUpperCase()); // imprime "IFSP - SÃO CARLOS"

        // Também é possível gerar uma nova String substituindo todas as ocorrências de uma dada substring em uma
        // String base por outra substring. Isso pode ser feito utilizando o método replace() passando como
        // parâmetros a substring a ser substituída e substring que a substituirá. Veja o exemplo:

        String val3 = "Banana";
        System.out.println(val3.replace("a", "e")); // imprime "Benene"
        System.out.println(val3.replace("na", "fa")); // imprime "Bafafa"

        // Por fim, o método split() retorna um vetor com várias strings a partir da separação de uma String base
        // segundo um dado critério de separação. Veja o exemplo:

        String str6 = "IFSP%20São%20Carlos";
        String split[] = str6.split("%20");
        for(String s:split)
            System.out.println(s);
        //imprime:
        //IFSP
        //São
        //Carlos

        // 3.5. Métodos format, concat e o operador '+'

        // Existem múltiplas formas de se concatenar uma String em Java. A forma mais direta de se formar uma String
        // pela concateção do conteúdo de outras duas é utilizando a sobrecarga do operador '+', como temos visto
        // até aqui na disciplina. Veja o exemplo a seguir:

        String val111 = "IFSP"; //cria uma String e armazena em val1
        String val22 = val111 + " São Carlos" ; //cria uma nova string por meio da concatenação das strings val1 e " São Carlos"
        System.out.println("val2 = " + val22); //imprime uma nova string criada da concatenação das strings "val2 = " e val2

        //  o método concat() cria uma String a partir da concateção de outras duas Strings, como no exemplo a seguir:

        String val10 = "IFSP";
// método que concatena duas strings.
        val10 = val.concat(" - São Carlos");
        System.out.println("val = " + val); // imprime "IFSP - São Carlos"

        // Embora o método concat() e o operador + tenham a mesma função, há algumas diferenças entre as duas opções:
        //
        //O método concat() só pode combinar objetos do tipo String, ou seja, deve ser chamado de um objeto String e
        // seu parâmetro deve também ser um objeto String. Isso o faz mais restritivo que o operador +, uma vez que
        // esse converte implicitamente qualquer valor não String para uma String;
        //O método concat() dispara uma exceção do tipo NullPointerException se qualquer um dos objetos na
        // concatenação for nulo, enquanto o operador + lida com referências nulas como uma String como o valor
        // literal "null";
        //O método concat() é capaz de concatenar somente duas strings por vez, enquanto o operador + pode combinar
        // múltiplas strings de uma única vez.

        // 4. A classe StringBuilder

        // Conforme discutido anteriormente, strings em Java são imutáveis. Por isso, sempre que atribuímos um novo
        // valor a uma variável ou realizamos uma concateção, uma nova string é criada.

        String s1 = new String("S1");
        String s2 = new String("S2");
        String s3 = new String("S3");
        String s4 = new String("S4");

       /* a atribuição a seguir é equivalente há:
        temp1 = s1 + s2
        temp2 = temp1 + s3
        temp3 = temp2 + s4
       */
        String s5 = s1 + s2 + s3 + s4;

        // É importante destacar que StringBuilder é uma classe que não garante sincronia, ou seja, podem acontecer
        // acessos simultâneos em aplicações multithreading. Esse tipo de aplicação é menos comum, mas,
        // nesses casos, você deve optar pela a classe StringBuffer. A classe StringBuffer permite sincronização,
        // mas com desempenho inferior ao StringBuilder.

        // 5. A classe StringJoiner
        // Por fim, é possível destacar mais uma classe útil para se trabalhar com strings: StringJoiner.
        // Essa classe, introduzida no Java 8, permite a construção de uma sequência de strings separadas
        // por um delimitador, podendo, opcionalmente ter também strings de prefixo e sufixo. Considere o exemplo
        // discutido na seção anterior:

        String s11 = "[";
        for (int i = 0; i < 100000; i++) {
            s11 += i + ", ";
        }
        s11 += "]";

        System.out.println("s1 = " + s11);
        // Mesmo utilizando o operador + para a concatenação dentro de um laço de repetição, o desempenho
        // do código é similar ao obtido com a classe StringBuffer.


        // 6. Convertendo valores para String e vice-versa

        // Por fim, é importante discutirmos as diferentes formas de conversão entre Strings e valores numéricos
        // ou lógicos, uma vez que essa tarefa é realizada quase que diariamente durante o desenvolvimento em Java.
        // Há basicamente duas formas de se converter uma string compatível em valores: métodos do tipo
        // 'parse(String input)' e 'valueOf(String input)'.  Esses métodos estáticos estão presentes de forma
        // similar nas classes Integer, Long, Float, Double e Boolean.
        //
        //Ambos os métodos possuem desempenho e funcionamento similares, mas enquanto o método do tipo
        // 'parse(String input)' retorna um primitivo (por exemplo, 'int'), o 'valueOf(String input)'
        // retorna um objeto da sua classe correspondente ('Integer'). Veja o exemplo a seguir:

        String input = "10";
        int primitiveInt = Integer.parseInt(input);
        Integer objectInt = Integer.valueOf(input); // equivalente a 'new Integer(Integer.parseInt(input));'

        // Independentemente da abordagem escolhida é sembre bom lembrar que ambos somente serão capazes de converter
        // strings contendo valores compatíveis com o tipo alvo, ou seja, compostas apenas por números e um sinal
        // opcional de menos como primeiro caracter (ou false/true no caso de um Boolean). Caso contrário,
        // ocorrerá uma NumberFormatException.
        //
        //Vale notar que as funcionalidades de autoboxing e unboxing introduzidas pelo Java 5 (para mais detalhes,
        // leia aqui) fazem com que se possa utilizar esses métodos de forma intercambiável, ou seja, com
        // 'parse(String input)'  e armazenamento em um objeto ou com 'valueOf(String input)' e armazenamento em um
        // primitivo. O código a seguir não resulta em qualquer erro, mas implicitamente implica em uma conversão
        // por parte do Java:

        String input1 = "10";
        Integer objectInt = Integer.parseInt(input); // conversão implícita de primitivo para objeto (autoboxing)
        int primitiveInt = Integer.valueOf(input); // conversão implícita de objeto para primitivo (unboxing)

        // Agora, para se converter um valor em uma String é possível tanto utilizar uma das sobrecargas existente
        // do método 'valueOf()' quanto o método 'toString()'. A diferença entre eles é que o primeiro resultará
        // em uma String "null" caso o valor passado seja nulo, enquanto o segundo levará a uma NullPointerException.
        // Veja o exemplo:

        Integer value = null;
        String nullString = String.valueOf(value); // resulta na String com conteúdo "null"
        String nullStringWillThrow = value.toString(); // resulta em NullPointerException!!!


    }
}