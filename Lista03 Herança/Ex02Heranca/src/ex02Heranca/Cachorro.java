package ex02Heranca;

public class Cachorro extends Animal {
   
    public String late;
    
    public Cachorro(String nome,String raca, String late){
    super(nome, raca);
    this.late = late;
    }

    public String getNome() {
        return super.getNome();
    }

    public String getRaca() {
        return super.getRaca();
    }

    public String late() {
        return late;
    }
}
