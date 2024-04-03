package classeTeste;

import classe.Produto;

public class ProdutoTeste {

    public static void main(String[] args) {

        double desconto = Produto.getDesconto();

        var p1 = new Produto("Guitarra", 3.000);
        p1.setDesconto(1.0);
        desconto = Produto.getDesconto();

        System.out.printf("Preco inicial  = %.2f", p1.getPreco());
        System.out.printf("\nPreco com desconto  = %.2f", (p1.getPreco() - (p1.getPreco() * desconto)));
    }
}
