package audio.projeto.modelos;

public class Musica extends Audio{
    private int anoDeLancamento;
    private boolean single;
    private String album;
    private String estilo;
    private String compositor;

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public boolean isSingle() {
        return single;
    }

    public void setSingle(boolean single) {
        this.single = single;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void ehSingle(boolean ehounaoeh){
        if(ehounaoeh){
            album = "Musica Solo";
        }
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
}
