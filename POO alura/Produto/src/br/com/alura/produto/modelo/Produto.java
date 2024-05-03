package br.com.alura.produto.modelo;

public class Produto {
    private String nome;
    private int preco;
    private int desconto;

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int aplicarDesconto(int descontoAplicado){
        return ( preco - ( preco * (descontoAplicado)/ 100) );
    }

    public void exibirFicha(){
        System.out.printf("O produto: " + nome + "\n");
        System.out.printf("Com o desconto de " + desconto + "\n");
        System.out.printf("Ao aplicar o desconto, o valor R$ " + preco + " se torna: R$ " + aplicarDesconto(getDesconto()));
    }
}
