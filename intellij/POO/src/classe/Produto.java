package classe;

public class Produto {
    String nome;
    Double preco;
    static double desconto = 0.1;

    public Produto(String nome, Double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public static double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto){
        Produto.desconto = desconto;
    }



}
