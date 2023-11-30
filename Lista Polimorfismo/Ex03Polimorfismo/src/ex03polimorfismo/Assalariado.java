package ex03polimorfismo;
public class Assalariado extends Funcionario{
    
    private double salario;

    public Assalariado( String nome,double salario) {
        super(nome);
        this.salario = salario;
    }
    public double getPay(){
    return 2222;
    }
    public void inserirDados(){
    
    }
    
}
