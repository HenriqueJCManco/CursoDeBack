package br.com.alura.projetomaonamassa.banco;

public class ContaBancaria {
    private String nome;
    public int saldo;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getNome(String henrique) {
        return nome;
    }

    public int getSaldo(int i) {
        return saldo;
    }

    public int depositar(int valor){
        return saldo = saldo + valor;
    }

    public void sacar(int saque){
        if((saldo - saque) > 0){
            saldo = saldo - saque;
        } else {
            System.out.println("Não é possível realizar um saque\n");
        }
        }

    public void consultarSaldo(){
        System.out.printf("\nO saldo da conta atual é: " + saldo);
    }

    public void conta(){
        System.out.printf("\nO titular da conta é: " +nome);
        System.out.printf("\nA saldo da conta é : " + saldo);
    }

}
