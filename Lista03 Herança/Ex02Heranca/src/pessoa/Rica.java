package pessoa;
public class Rica extends Pessoa {
    private double dinheiro;
    
    public Rica(String nome, int idade, double dineiro){
    super(nome, idade);
    this.dinheiro = dinheiro;
    }
    
    public String fazCompras(){
    return "Fazendo compras";
    }
    public double getDinheiro() {
        return dinheiro;
    }
  public String getNome() {
        return super.getNome();
    }
    public int getIdade() {
        return super.getIdade();
    }
    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }
    
}
