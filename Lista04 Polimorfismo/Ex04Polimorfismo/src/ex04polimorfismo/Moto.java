package ex04polimorfismo;

public class Moto extends Veiculos {

    int ano;

    public Moto() {
    }

    public Moto(String modelo, double preco, int ano) {
        super(modelo, preco);
        this.ano = ano;
    }
    
    public double getPreco(){
    return getPreco();
    }
    
    public void setAno(int ano){
    this.ano = ano;
    }

    public int getAno() {
        return ano;
    }
    
    public void insertDados(){
    }
    public void imprimirRelatorio() {
        System.out.println("Modelo: " + getModelo());
        System.out.println("Preço: " + getPreco());
        System.out.println("Ano: " + getAno());
        
    }

}
