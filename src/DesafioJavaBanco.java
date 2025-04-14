import java.util.Scanner;

public class DesafioJavaBanco {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nomeCliente = "Guilherme";
        int valorDaConta = 1500;
        String tipoDeConta = "Corrente";
        String opera = """
                Operações:
                1 - Consultar saldo
                2 - Depositar Valor
                3 - Sacar Valor
                4 - Sair
                
                Digite a opção desejada:""";

        boolean continuar = true;

        System.out.println("Bem vindo à sua conta do banco!");
        System.out.println("******************************************************");
        System.out.println("Nome: " + nomeCliente);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("Saldo atual: " + valorDaConta);
        System.out.println("******************************************************");

        while (continuar) {
            System.out.println(opera);
            int entrada = leitura.nextInt();

            switch (entrada) {
                case 1:
                    System.out.println("Seu saldo é de: " + valorDaConta);
                    System.out.println("Gostaria de voltar ao menu? (S/N)");
                    String opcaoMenu = leitura.next();
                    if (opcaoMenu.equalsIgnoreCase("N")) {
                        System.exit(0);
                    }
                    break;

                case 2:
                    System.out.println("Quanto gostaria de depositar em sua conta?");
                    int valorRecebimento = leitura.nextInt();
                    valorDaConta += valorRecebimento;
                    System.out.println("Deposito concluido! Seu saldo atual é de: " + valorDaConta);
                    System.out.println("Gostaria de voltar ao menu? (S/N)");
                    String opcaoMenu2 = leitura.next();
                    if (opcaoMenu2.equalsIgnoreCase("N")) {
                        System.exit(0);
                    }
                    break;

                case 3:
                    System.out.println("Quanto gostaria de sacar?");
                    int saque = leitura.nextInt();
                    if (saque > valorDaConta) {
                        System.out.println("Saldo insuficiente!");
                    } else {
                        valorDaConta -= saque;
                        System.out.println("Saque de " + saque + " realizado. Saldo atual: " + valorDaConta);
                    }
                    System.out.println("Gostaria de voltar ao menu? (S/N)");
                    String opcaoMenu3 = leitura.next();
                    if (opcaoMenu3.equalsIgnoreCase("N")) {
                        System.exit(0);
                    }
                    break;

                case 4:
                    System.out.println("Obrigado! Volte sempre :)");
                    continuar = false; // Encerra o loop
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
        leitura.close(); // Fecha o Scanner
    }
}