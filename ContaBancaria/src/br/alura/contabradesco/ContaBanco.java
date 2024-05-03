package br.alura.contabradesco;

public class ContaBanco {
    private int numeroConta;
    private int saldo;
    public String titular;

    public void exibeFichaTecnica(){
        System.out.printf("Número da conta: " + numeroConta + "\n");
        System.out.printf("Dinheiro na conta: R$ " + saldo + "\n");
        System.out.printf("O dono da conta: " + titular + "\n");
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public int getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
