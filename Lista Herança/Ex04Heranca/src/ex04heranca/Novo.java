/*
a. crie uma classe Novo, que herda Imovel e possui um adicional no preço. Crie métodos de
acesso e impressão deste valor adicional.
 */
package ex04heranca;
    public class Novo extends Imovel {
    
       private double adicionalNovo;

    public Novo(String endereco, double preco, double adicionalNovo) {
        super(endereco, preco);
        this.adicionalNovo = adicionalNovo;
    }
    
    public double valorNovo(){
    return getPreco()+ adicionalNovo;
    }
    
    public void setAdicionalNovo(double adicionalNovo) {
        this.adicionalNovo = adicionalNovo;
    }

    public double getAdicionalNovo() {
        return adicionalNovo;
    }
        
        
}
