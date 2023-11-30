package ex01polimorfismo;
public class Animal {

    private String nome;
    private int idade;
    private String som;

    public Animal(String nome, int idade, String som) {
        this.nome = nome;
        this.idade = idade;
        this.som = som;
    }
    
    public void emitirSom() {
        System.out.println("Animal emitindo som");
    }
}
