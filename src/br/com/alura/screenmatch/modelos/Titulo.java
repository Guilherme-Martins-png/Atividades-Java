package br.com.alura.screenmatch.modelos;

public class Titulo {

    private String nome;
    private int anoDeLancamento;
    private double duracaoEmMinutos;
    private boolean inlusoNoPlano;
    private int somaDasAvaliacoes;
    private int totalDeAvaliacoes;

    public int getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public int getTotalDeAvaliacoes (){
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(double duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setInlusoNoPlano(boolean inlusoNoPlano) {
        this.inlusoNoPlano = inlusoNoPlano;
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome do br.com.alura.screenmatch.modelos.Filme: " + nome );
        System.out.println("Lançamento : " + anoDeLancamento );
        System.out.println("Duração " +  duracaoEmMinutos);
    }

    public void avaliar (double nota) {
        somaDasAvaliacoes += nota ;
        totalDeAvaliacoes++;

    }
    public double pegaMedia (){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

}
