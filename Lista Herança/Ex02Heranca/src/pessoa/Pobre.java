package pessoa;
public class Pobre extends Pessoa{
    
    public Pobre(String nome, int idade){
        super(nome , idade);
    }
    public String trabalha(){
    return "Está Trabalhando.";
    }
}
