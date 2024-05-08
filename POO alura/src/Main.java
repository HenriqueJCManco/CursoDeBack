import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelo.*;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Star Wars");
        meuFilme.setAnoDeLancamento(1982);
        meuFilme.setDuracaoEmMinutos(150);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(2);
        meuFilme.exibeFichaTecnica();

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.setTemporadas(10);
        lost.avalia(9);
        lost.avalia(5);
        lost.exibeFichaTecnica();
        lost.setDuracaoEmMinutos(45);
        lost.setMinutosPorEpisodio(50);
        lost.setEpisodiosPorTemporada(10);
        System.out.printf("Soma das avaliações: " +  lost.getSomaDasAvaliacao());
        System.out.printf("\nTotal de avaliações: " + lost.getTotalDeAvaliacoes());
        System.out.printf("\nDuração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();

        outroFilme.setNome("Poderoso Chefao");
        outroFilme.setAnoDeLancamento(1962);
        outroFilme.setDuracaoEmMinutos(180);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.printf("\n");
        System.out.printf(String.valueOf(calculadora.getTempoTotal()));

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setTotalVisualizacoes(300);
        episodio.setSerie("lost");
        filtro.filtra(episodio);
    }
}