package ex01polimorfismo;
public class Cachorro extends Animal{
    
    private String correr;

    public Cachorro(String nome, int idade, String som, String correr) {
        super(nome, idade, som);
        this.correr = correr;
    }
    
     @Override
    public void emitirSom() {
        System.out.println("Cachorro latindo");
    }
}
