public class Combo  {
    private Bebida bebida;
    private Burguer burguer;
    private Sobremesa sobremesa;
    private String descricao;

    public Combo() {

    }

     @Override
    public String toString() {
        return this.descricao;
    }

    public Combo(Bebida bebida2, Burguer burguer2, Sobremesa sobremesa2) {
       this.bebida = bebida2;
       this.burguer = burguer2;
       this.sobremesa = sobremesa2;
    }

    public void criarCombo(int tipo) {
        switch (tipo) {
            case 1:
                 this.comboMaster();
                 break;
            case 2:
                 this.superCombo();
                 break;
            default:
            
                break;
        }
    }


    private void comboMaster(){
        Bebida bebida = new Bebida(1000, "Bebida grande", 5.50);
        Burguer burguer = new Burguer(500, "Lanche médio", 15);
        Sobremesa sobremesa = new Sobremesa("Grande", "Sobremesa grande", 3);
        
        this.descricao = bebida.toString() + burguer.toString()+ sobremesa.toString();
    }

    private void superCombo() {
        Bebida bebida = new Bebida(500, "Bebida média", 3.50);
        Burguer burguer = new Burguer(200, "Lanche médio", 2);
        Sobremesa sobremesa = new Sobremesa("Pequena", "Sobremesa pequena", 1);
    
        this.descricao = bebida.toString() + burguer.toString()+ sobremesa.toString();
    }
}
