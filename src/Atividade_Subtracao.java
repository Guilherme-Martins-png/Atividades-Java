import java.util.Scanner;

public class Atividade_Subtracao {
    public static void main(String[] args) {

        //chamando scanner
        Scanner leitura = new Scanner(System.in);

        //Começo da aplicação
        System.out.println("Bem vindo á classe de subtração!");
        System.out.println("**************************************");

        //Entrada do usuário
        System.out.println("Digite um numero para subtrair");
        int numeroA = leitura.nextInt();
        System.out.println("Digite um segundo numero para subtrair");
        int numeroB = leitura.nextInt();

        //operação de subtração
        int operacaoSubtracao = numeroA - numeroB;
        System.out.println("**************************************");

        //resultado
        System.out.println("Resultado da sua subtração: " + operacaoSubtracao);
    }


}
