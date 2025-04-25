import java.util.Scanner;

public class Conversor_Dolar {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Quantos dolar(es) você quer converter? ");
        double entrada = leitura.nextDouble();
        double valorEmDolares = entrada;
        double reais = 4.94;

        reais *= valorEmDolares;

        System.out.printf("Resultado: %.2f Dolar(es) é o equivalente a %.2f reais", valorEmDolares, reais);
    }
}
