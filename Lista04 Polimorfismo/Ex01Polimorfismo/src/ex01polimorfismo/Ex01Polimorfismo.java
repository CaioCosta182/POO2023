package ex01polimorfismo;
public class Ex01Polimorfismo {

    public static void main(String[] args) {
        
        Animal animal = new Animal("Selvagem", 2,"...");
        Cachorro cachorro = new Cachorro("Yoko", 5, "Au", "Correndo");
        Cavalo cavalo = new Cavalo("Pé de pano", 55, "hihi","Correndo");
        Preguica preguica = new Preguica("Peackles", 200, "mute", "Estacionada");
        
        animal.emitirSom();
        cachorro.emitirSom();
        cavalo.emitirSom();
        preguica.emitirSom();
    }
    
}
