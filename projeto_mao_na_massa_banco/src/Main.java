import br.com.alura.projetomaonamassa.banco.ContaCorrente;

public class Main {
    public static void main(String[] args) {
        ContaCorrente minhaConta = new ContaCorrente();
        minhaConta.setNome("Henrique");
        minhaConta.setSaldo(1547);
        minhaConta.conta();
        minhaConta.depositar(156);
        minhaConta.consultarSaldo();
        minhaConta.sacar(25);
        minhaConta.conta();
        }
    }
