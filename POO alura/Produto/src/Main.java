import br.com.alura.produto.modelo.Produto;

public class Main {
    public static void main(String[] args){
        Produto meuProduto = new Produto();
        meuProduto.setNome("Programa para registrar produto");
        meuProduto.setDesconto(10);
        meuProduto.setPreco(100);

        meuProduto.exibirFicha();
    }
}
