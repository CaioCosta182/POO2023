package ex03polimorfismo;
public class Horista extends Funcionario {

    private double valorHoras;
    private double horas;

    public Horista(String nome,double valorHoras, double horas) {
        super(nome);
        this.valorHoras = valorHoras;
        this.horas = horas;
    }
    public double getPay(){
    return horas*valorHoras;
    }
    
    public void addHoras(double horas){
        this.horas += horas;
    }
    
    public void inserirDados(){
    
    }
    
    
}
