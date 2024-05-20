public class Produtos implements Comparable<Produtos> {
    public String produto;
    private double valor;

    public Produtos(String produto, double valor) {
        this.produto = produto;
        this.valor = valor;
    }

    public String getProduto() {
        return produto;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compra: produto = " + produto + '\'' +
                ", valor = " + valor;
    }

    @Override
    public int compareTo(Produtos outroProduto) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outroProduto.valor));
    }
}
