package ex02Heranca;
    public class Gato  extends Animal{
        public String mia;
        
        public Gato(String nome, String raca, String mia){
        super(nome, raca);
        this.mia = mia;
        }
         public String getNome() {
        return super.getNome();
    }

    public String getRaca() {
        return super.getRaca();
    }

    public String getMia() {
        return mia;
    }
    
        
}
