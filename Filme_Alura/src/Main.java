import br.com.alura.screenmatch.modelo.Filme;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Star Wars");
        meuFilme.setAnoDeLancamento(1982);
        meuFilme.setDuracaoEmMinutos(150);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(10);
        meuFilme.exibeFichaTecnica();
    }
}