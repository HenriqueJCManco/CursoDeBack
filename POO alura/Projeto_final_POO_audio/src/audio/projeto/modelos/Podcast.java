package audio.projeto.modelos;

public class Podcast extends Audio{
    private int numeroDoEpisodio;
    private String criador;
    private String  patrocinio;

    public int getNumeroDoEpisodio() {
        return numeroDoEpisodio;
    }

    public void setNumeroDoEpisodio(int numeroDoEpisodio) {
        this.numeroDoEpisodio = numeroDoEpisodio;
    }

    public String getCriador() {
        return criador;
    }

    public void setCriador(String criador) {
        this.criador = criador;
    }

    public String getPatrocinio() {
        return patrocinio;
    }

    public void setPatrocinio(String patrocinio) {
        this.patrocinio = patrocinio;
    }

    @Override
    public int getAvaliacao() {
        if(this.getCurtidas() >=100) {
            return 10;
        } else {
            return 8;
        }
    }
}
