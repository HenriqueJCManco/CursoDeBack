package br.com.alura.projetomaonamassa.banco;

public class ContaCorrente extends ContaBancaria {
    private void cobrarTarifaMensal( int tarifa){
        saldo =- tarifa;
    }
}
