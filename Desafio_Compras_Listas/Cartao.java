import java.util.ArrayList;
import java.util.List;

public class Cartao  {
    private double limite;
    private double saldo;
    private List<Produtos> compras;


    public Cartao(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public List<Produtos> getCompras() {
        return compras;
    }

    public boolean lancaCompra(Produtos produto){
        if(this.saldo >= produto.getValor()){
            this.saldo -= produto.getValor();
            this.compras.add(produto);
            return true;
        }
        return false;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

}
