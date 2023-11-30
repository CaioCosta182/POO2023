package ex01polimorfismo;
public class Cavalo extends Cachorro {

    public Cavalo(String nome, int idade, String som, String correr) {
        super(nome, idade, som, correr);
    }
    
     @Override
    public void emitirSom() {
        System.out.println("Cavalo relinchando.");
    }
    
}
