public class Burguer extends Produto{
    private int Gramas;

    public Burguer(int gramas, String descricao, double preco) {
        this.Gramas = gramas;
        this.Descricao = descricao;
        this.Preco = preco;
    }

    @Override
    public String toString() {
        return "Burguer: " +
                "gramas=" + Gramas +
                ", descricao='" + Descricao + '\'' +
                ", preco=" + Preco +
                ' ';
    }
}
