import br.alura.contabradesco.ContaBanco;

public class Main {
    public static void main(String[] args){
        ContaBanco minhaConta = new ContaBanco();
        minhaConta.setTitular("Henrique");
        minhaConta.setNumeroConta(11234);
        minhaConta.setSaldo(12500);
        minhaConta.exibeFichaTecnica();
    }
}
