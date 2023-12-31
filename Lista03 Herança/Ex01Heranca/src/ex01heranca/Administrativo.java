package ex01heranca;

public class Administrativo extends Assistente {
    private String turno;
    private double adicionalNoturno;
    
    public Administrativo(String nome,double salario, int matricula, String turno, double adicionalNoturno){
        super(nome, salario, matricula);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }
    @Override
    public double ganhoAnual(){
        double salarioAnual = super.ganhoAnual();
        if(turno.equalsIgnoreCase("noite")){
            salarioAnual += adicionalNoturno;
        }
        return salarioAnual;
    }
}
