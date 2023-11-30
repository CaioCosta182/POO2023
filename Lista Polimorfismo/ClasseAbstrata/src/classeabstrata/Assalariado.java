package classeabstrata;
    public class Assalariado extends Empregado{
        
       private double salario;

    public Assalariado(double salario) {
        this.salario = salario;
    }

    public Assalariado( String n, String sn, String doc, double sal) {
        super(n, sn, doc);
        this.salario = sal;
    }
         

    @Override
    public double vencimento() {
        return this.salario;
    }
        
        
    
        
}
