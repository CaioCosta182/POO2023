/*
b. crie uma classe Velho, que herda Imovel e possui um desconto no preço. Crie métodos de
acesso e impressão para este desconto.
 */
package ex04heranca;
    public class Velho extends Imovel{
        
        private double desconto;

    public Velho(String endereco, double preco, double desconto) {
        super(endereco, preco);
        this.desconto = desconto;
    }
    
    public double valorVelho(){
    return getPreco() - desconto;
    }

    public double getDesconto() {
        return desconto;
    }
        
        
}
