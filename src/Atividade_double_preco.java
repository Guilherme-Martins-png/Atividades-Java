import java.util.Scanner;

public class Atividade_double_preco {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double precoProduto = 19.99;
        int quantidade = 0;

        System.out.println("Quantos livros você gostaria? ");

        int pedidoUsuario = leitura.nextInt();
        quantidade+=pedidoUsuario;

        float total = (float) precoProduto * pedidoUsuario;

        System.out.println("Bom dia senhor, nesta promoção cada livro sai no valor de " + precoProduto +
                ", O senhor pegou " + quantidade + " livros " + "então fica no total de " + total);
    }

}
