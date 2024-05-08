package audio.projeto.modelos;

public class Audio {
    private int tempoDuracao;
    private String plataforma;
    private String nome;
    private int totalDeReproducoes;
    private int curtidas;
    private int nota;
    private int avaliacao;
    private int quantidadeDeAvaliacao;


    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public void setTotalDeReproducoes(int totalDeReproducoes) {
        this.totalDeReproducoes = totalDeReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getQuantidadeDeAvaliacao() {
        return quantidadeDeAvaliacao;
    }

    public void setQuantidadeDeAvaliacao(int quantidadeDeAvaliacao) {
        this.quantidadeDeAvaliacao = quantidadeDeAvaliacao;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getTempoDuracao() {
        return tempoDuracao;
    }

    public void setTempoDuracao(int tempoDuracao) {
        this.tempoDuracao = tempoDuracao;
    }

    public void avalia(int nota){
        avaliacao = avaliacao + nota;
        quantidadeDeAvaliacao++;
    }

    public double media(){
        return ((double) avaliacao /quantidadeDeAvaliacao);
    }

    public void reproduzir(){
        totalDeReproducoes++;
    }

    public void curtir(){
        curtidas++;
    }

    public void exibir(){
        System.out.printf("\nO áudio que está ouvindo é: " + getNome() + "\n");
        System.out.printf("\nTem um tempo de duração: "  + getTempoDuracao() + " Minutos" + "\n");
        System.out.printf("\nEstá disponível na plataforma: " + getPlataforma() + "\n");
        System.out.printf("\nFoi reproduzido: " + getTotalDeReproducoes() + " vezes \n");
        System.out.printf("\nCurtidas: " + getCurtidas() + "\n");
        System.out.printf("\nA avaliação é: " + media() + "\n");
    }

}
