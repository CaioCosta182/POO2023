package ex03heranca;

public class Ingresso {

    double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    double imprimeValor() {
        return valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
