package ex01polimorfismo;
public class Preguica extends Animal {
    
    private String subirArvore;

    public Preguica(String nome, int idade, String som, String subirArvore) {
        super(nome, idade, som);
        this.subirArvore = subirArvore;
    }
    
     @Override
    public void emitirSom() {
        System.out.println("Nem sei se emite alguma coisa.");
    }
    
}
