import java.util.*;

import static java.util.Collection.*;

// colocar o limite do cartão
// descrição do produto [ Nome, valor]
// digitar 0 para sair ou 1 para continuar ,  se sair imprimir os produtos
public class CartaoDeCredito {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limite = leitura.nextDouble();
        Cartao cartao1 = new Cartao(limite);

        int sair = 1;
        while(sair != 0){
            System.out.println("Digite a descrição da compra: ");
            String produto = leitura.next();

            System.out.println("Digite o valor da compra");
            double valor = leitura.nextDouble();

            Produtos produto1 = new Produtos(produto, valor);
            boolean compraRealziada = cartao1.lancaCompra(produto1);

            if(compraRealziada){
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair = leitura.nextInt();
            } else{
                System.out.println("Não é possível fazer essa compra!");
                break;
            }

        }
        System.out.println("******************");
        System.out.println("COMPRAS REALIZADAS: \n");
        Collections.sort(cartao1.getCompras());

        for (Produtos c : cartao1.getCompras()){
            System.out.println(c.getProduto() + " - " + c.getValor());
        }

        System.out.println("\n******************");
        System.out.println("\n Saldo do Cartão: " + cartao1.getSaldo());

    }
}