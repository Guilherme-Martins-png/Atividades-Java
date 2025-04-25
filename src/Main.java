import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {
       Filme meuFilme = new Filme();

       meuFilme.setNome("Donnie Darko");
       meuFilme.setAnoDeLancamento(2004);
       meuFilme.setDuracaoEmMinutos(256);
       meuFilme.exibeFichaTecnica();
       meuFilme.avaliar(5);
       meuFilme.avaliar(5);
       meuFilme.avaliar(5);
       System.out.println("A media de avalicao desse filme é " + meuFilme.pegaMedia());

       Serie lost = new Serie();
         lost.setNome("Lost");
         lost.setAnoDeLancamento(2000);
         lost.exibeFichaTecnica();

    }


}