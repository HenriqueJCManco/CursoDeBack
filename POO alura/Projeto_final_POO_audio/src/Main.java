import audio.projeto.modelos.Musica;
import audio.projeto.modelos.Podcast;
import audio.projeto.modelos.Preferidas;

public class Main {
    public static void main(String[] args) {
        //inserir musica do Kendrick Lamar
        Musica theynotlikeus = new Musica();
        theynotlikeus.setTempoDuracao(7);
        theynotlikeus.setPlataforma("Todas");
        theynotlikeus.setNome("They not like us");
        theynotlikeus.setCompositor("Kendrick Lamar");
        theynotlikeus.ehSingle(true);
        theynotlikeus.setEstilo("Rap");
        theynotlikeus.setAnoDeLancamento(2024);
        theynotlikeus.avalia(8);
        theynotlikeus.avalia(9);
        theynotlikeus.avalia(10);
        for (int i = 0; i < 1000; i++) {
            theynotlikeus.curtir();
            theynotlikeus.reproduzir();
        }
        System.out.print("---------------------------------------------------\n");
        System.out.printf("\nO autor da é: " + theynotlikeus.getCompositor() + "\n");
        theynotlikeus.exibir();
        System.out.printf("\nO estilo é: " + theynotlikeus.getEstilo() + "\n");
        System.out.printf("\nAlbum: " + theynotlikeus.getAlbum() + "\n");
        System.out.print("---------------------------------------------------" + "\n");

        //podcast do NerdCast
        Podcast cyberpunk = new Podcast();
        cyberpunk.setCriador("Jovem Nerd");
        cyberpunk.setPatrocinio("Alura");
        cyberpunk.setNome("NerdCastRPG - Cyberpunk");
        cyberpunk.setNumeroDoEpisodio(3);
        cyberpunk.setPlataforma("Spotify e JovemNerd");
        cyberpunk.setTempoDuracao(285);
        cyberpunk.avalia(6);
        cyberpunk.avalia(5);
        cyberpunk.avalia(7);
        for (int i = 0; i < 100 ; i++) {
            cyberpunk.curtir();
            cyberpunk.reproduzir();
        }
        System.out.print("---------------------------------------------------" + "\n") ;
        System.out.printf("\nO criador é: " + cyberpunk.getCriador() + "\n");
        cyberpunk.exibir();
        System.out.printf("\nEsse episodio foi patrocinado por: " + cyberpunk.getPatrocinio() + "\n");
        System.out.printf("\nHá " + cyberpunk.getNumeroDoEpisodio() + " episodios para assistir desse conteudo" + "\n" );
        System.out.print("---------------------------------------------------");

        Preferidas minhas = new Preferidas();
        minhas.inclui(cyberpunk);
        minhas.inclui(theynotlikeus);
    }
}
