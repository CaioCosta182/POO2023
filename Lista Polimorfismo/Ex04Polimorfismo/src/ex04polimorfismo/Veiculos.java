package ex04polimorfismo;
    public class Veiculos {
    
        private String modelo;
        private double preco;

    public Veiculos() {
        modelo = null;
        preco = 0;
    }

        
    public Veiculos(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }
    
    public double getPreco(){
        return 0;
    }
    public String getModelo(){
        
            return null;
        
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
    public void printDados(){
    }
    
        
        
}
