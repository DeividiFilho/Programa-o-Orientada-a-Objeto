public class Main {
    public static void main(String[] args) {
        String s = "POOS3";
        String r = new String("POOS3");
        if (r == s) {
            System.out.println("Referencias para o mesmo objeto");
        } else {
            System.out.println("Referencias para objetos diferentes");
        }

        // String s = "POOS3";
        // String r = new String("POOS3"); // 's' e 'r' referências diferentes, mas como o mesmo conteúdo
        // if (r.equals(s)) {
        //  System.out.println("Valores iguais");
        // } else {
        //     System.out.println("Valores diferentes");
        // }


        // O método equals() é case sensitive, ou seja, diferencia caracteres minúsculos de maiúsculos (e vice-versa).
        // Para verificar a igualdade entre duas strings sem considerar a diferença entre minúsculas e maiúsculas
        // pode-se utilizar o método 'equalsIgnoreCase()', como no exemplo a seguir:

        String val1 = new String("POOS3");
        String val2 = new String("poos3");

        if(val1.equalsIgnoreCase(val2))
            System.out.println("Os nomes têm o mesmo significado!");

        // Para comparar a precedência lexicográfica (comparação por ordem alfabética) entre duas strings,
        // é possível utilizar  o método 'compareTo()', da seguinte forma:

        String val11 = new String("abacaxi");
        String val22 = new String("abacaxi");
        String val3 = new String("banana");

        System.out.println("val1.compareTo(val2) = " + val1.compareTo(val2)); //imprime '0'
        System.out.println("val1.compareTo(val3) = " + val1.compareTo(val3)); //imprime '-1'
        System.out.println("val3.compareTo(val1) = " + val3.compareTo(val1)); //imprime '1'
        // O método em questão retorna '0' se o conteúdo das strings for igual, um número negativo se a String que
        // invoca o 'compareTo()' preceder a string que é passada como um argumento e um número positivo se a string
        // que invoca o compareTo() suceder a String que é passada como argumento.
    }
}