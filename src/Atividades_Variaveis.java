public class Atividades_Variaveis {
    public static void main(String[] args) {

        /*Declare uma variável do tipo double e uma variável do tipo int.
        Faça o casting da variável double para int e imprima o resultado.
         */

        //Variavel double
        double myDouble = 15.15;

        //Convertendo Double para Int
        int myInt = 30;


        //Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra).
        // Atribua valores a essas variáveis e concatene-as em uma mensagem.


        //variavel char
        char letra = 'X';
        String palavra = "ABCDEFG";
        String mensagem = "Palavra(String): " + palavra + "  Letra(char): " + letra;

        //Imprime o resultado
        System.out.println("Double " + myDouble + " INT: " + myInt);
        System.out.println("**********************************************************");
        System.out.println(mensagem);
    }
}
