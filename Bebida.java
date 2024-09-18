public class Bebida extends Produto {
    private int ML;
    public Bebida(int quantidade, String descricao, double preco) {
        this.ML = quantidade;
        this.Descricao = descricao;
        this.Preco = preco;
    }

    @Override
    public String toString() {
        return "Bebida: " +
                "ml=" + ML +
                ", descricao='" + Descricao+ '\'' +
                ", preco=" + Preco +
                ' ';
    }

}
