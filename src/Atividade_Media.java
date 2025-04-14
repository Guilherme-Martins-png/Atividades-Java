import java.util.Scanner;

public class Atividade_Media {
    public static void main(String[] args) {

        //Crie um programa que realize a média de duas notas decimais e exiba o resultado
        //chamando o scanner
        Scanner leitura = new Scanner(System.in);

        //Começo da aplicação
        System.out.println("Bem vindo á calculadora de media!");
        System.out.println("**************************************");


        //Entrada do usuario
        System.out.println("Escreva um numero decimal");
        float nota1 = leitura.nextFloat();
        System.out.println("Escreva outro numero decimal");
        float nota2 = leitura.nextFloat();

        //somando
        float soma = nota1 + nota2;

        //dividindo
        float media =  soma / 2;

        //resultado
        System.out.println("**************************************");
        System.out.println("Media desses numero é :" + media);
        System.out.println("**************************************");

    }
}
