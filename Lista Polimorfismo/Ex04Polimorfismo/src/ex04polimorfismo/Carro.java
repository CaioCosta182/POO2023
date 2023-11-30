package ex04polimorfismo;

import java.util.Scanner;

    public class Carro extends Veiculos {
        
       private  double km;

    public Carro() {
       
    }

    public Carro(String modelo, double preco, double km) {
        super(modelo, preco);
        this.km = km;
    }
    
    public double getPreco(){
    return super.getPreco();
    }

    public void setKm(double km) {
        this.km = km;
    }

    public double getKm() {
        return km;
    }

    public Carro insertDados(){
        
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o modelo do carro:");
        //super.setModelo(teclado.next());
        String m = teclado.next();
        System.out.println("Informe o preço do carro:");
        //super.setPreco(teclado.nextDouble());
        double p = teclado.nextDouble();
        System.out.println("Informe a quilometragem do carro:");
        double k  = teclado.nextDouble();
        
        Carro c = new Carro(m, p, k);
        
        return c;
    }
       public void imprimirRelatorio() {
        System.out.println("Modelo: " +getModelo());
        System.out.println("preço: " + getPreco());
        System.out.println("preço: " + getKm());
        
    }
    
        
}
