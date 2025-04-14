import java.util.Scanner;

public class Atividade_Soma {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        //Começo
        System.out.println("Bem vindo á classe de soma!");
        System.out.println("******************************************");

        //Entrada primeiro numerador
        System.out.println("Digite um número para soma: ");
        int numeroA = leitura.nextInt();

        //Entrada do segundo numerador
        System.out.println("Digite outro número para soma: ");
        int numeroB = leitura.nextInt();

        //Soma
        int somatorio = numeroA + numeroB;

        //Imprimir solução
        System.out.println("******************************************");
        System.out.println("A soma dessa conta é: " + somatorio);
        System.out.println("******************************************");
    }

}
/*Crie uma classe Soma em Java para imprimir no console o resultado da operação 10 + 5.
Certifique-se de que o resultado seja exibido sem o uso de aspas,
o valor "15" ao invés da expressão "10+5".
 */