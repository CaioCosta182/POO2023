package ex03heranca;
    public class CamaroteSuperior extends Vip{
        
        private double adicionalSuperior;

    public CamaroteSuperior(double valor, double adicional, double adicionalSuperior) {
        super(valor, adicional);
        this.adicionalSuperior = adicionalSuperior;
    }
        
        public double calculaSuperior(){
            return valor + adicional + adicionalSuperior;
        }

    public double getAdicionalSuperior() {
        return adicionalSuperior;
    }

    public double getAdicional() {
        return adicional;
    }

    public double getValor() {
        return valor;
    }
}
