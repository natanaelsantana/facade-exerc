public class Sobremesa extends Produto {
    private String Tamanho;

    public Sobremesa(String tamanho, String descricao, double preco) {
        this.Tamanho = tamanho;
        this.Descricao = descricao;
        this.Preco = preco;
    }

    @Override
    public String toString() {
        return "Sobremesa :" +
                "tamanho='" + Tamanho + '\'' +
                ", descricao='" + Descricao + '\'' +
                ", preco=" + Preco +
                ' ';
    }
}
