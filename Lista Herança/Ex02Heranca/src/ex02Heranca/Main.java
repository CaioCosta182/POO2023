package ex02Heranca;


public class Main {
    public static void main(String[] args) {
     Cachorro cachorro = new Cachorro("Totó", "Vira-Lata", "Au");
     Gato gato = new Gato("Garfild", "Vagabundo", "miau");
     
        System.out.println("O cachorro: "+ cachorro.getNome() +" da raça: "+cachorro.getRaca()+","+cachorro.caminha());
        System.out.println("O gato: "+ gato.getNome() +" da raça: "+gato.getRaca()+","+ gato.caminha());
    }
    
}
