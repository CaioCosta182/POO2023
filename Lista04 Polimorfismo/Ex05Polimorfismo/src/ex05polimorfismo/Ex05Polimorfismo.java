package ex05polimorfismo;
public class Ex05Polimorfismo {
    public static void main(String[] args) {
        
        PessoaFisica p1 = new PessoaFisica("jao","rua A",new String []{"a","b","c"}, 1000, 1234,0.10 );
        PessoaJuridica p2= new PessoaJuridica( "Suelen", "Rua B", new String[] {"E", "F","G"},10000,5678,"Proff", "Proff POO",0.20 );
        
        p1.realizarPagamento();
        p1.relatorio();
        System.out.println("");
        p2.realizarPagamento();
        p2.relatorio();
    }
      
}
