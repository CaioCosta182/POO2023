package classeabstrata;
    public class Horista extends Empregado {

        double precoHora;
        double horasTrabalhadas;

    public Horista(double precoHora, double horasTrabalhadas) {
        this.precoHora = precoHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Horista(String n, String sn, String doc, double precoHora, double horasTrabalhadas) {
        super(n, sn, doc);
        this.precoHora = precoHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }
        
        
    @Override
    public double vencimento() {
       
            return (this.precoHora * this.horasTrabalhadas);
       
    }
    
        
}
