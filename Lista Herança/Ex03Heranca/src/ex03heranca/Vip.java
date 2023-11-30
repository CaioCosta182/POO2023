package ex03heranca;
public class Vip extends Ingresso{
    
    double adicional;

    public Vip( double valor, double adicional) {
        super(valor);
        this.adicional = adicional;
    }
    double adicionaVip(){
    return valor + adicional;
    }
}
