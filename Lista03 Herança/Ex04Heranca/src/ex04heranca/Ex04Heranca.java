/*
Crie a classe Imovel, que possui um endereço e um preço.
a. crie uma classe Novo, que herda Imovel e possui um adicional no preço. Crie métodos de
acesso e impressão deste valor adicional.
b. crie uma classe Velho, que herda Imovel e possui um desconto no preço. Crie métodos de
acesso e impressão para este desconto.
*/
package ex04heranca;
    public class Ex04Heranca {

        
        public static void main(String[] args) {
        
            Imovel imovel = new Imovel("Rua A", 200000);
            Novo novo = new Novo("Rua B", 300000,50000);
            Velho velho = new Velho("Rua C", 300000,50000);
            
            System.out.println("O imovel da "+ imovel.getEndereco()+ " custa R$: "+ imovel.getPreco() );
            System.out.println("O imovel da " + novo.getEndereco()+ "custa R$: "+ novo.valorNovo());
            System.out.println("O imovel da " + velho.getEndereco()+ "custa R$: "+ velho.valorVelho());
    }
    
}
