package br.com.alura.screenmatch.modelo;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacao;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void exibeFichaTecnica() {
        System.out.println("---------------------------");
        System.out.println("Nome do titulo: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração: " + duracaoEmMinutos + " minutos");
        System.out.println("Incluído no plano: " + incluidoNoPlano);
        System.out.println("Média das avaliações: " + pegaMedia());
        System.out.println("---------------------------\n");
    }


    public void avalia(double nota) {
        somaDasAvaliacao = somaDasAvaliacao + nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia() {
        return (somaDasAvaliacao / totalDeAvaliacoes);
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public double getSomaDasAvaliacao() {
        return somaDasAvaliacao;
    }

    public void setSomaDasAvaliacao(double somaDasAvaliacao) {
        this.somaDasAvaliacao = somaDasAvaliacao;
    }

    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
}
