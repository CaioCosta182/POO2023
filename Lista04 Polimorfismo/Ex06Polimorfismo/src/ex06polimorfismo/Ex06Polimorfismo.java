package ex06polimorfismo;
public class Ex06Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ContaCorrente c1 = new ContaCorrente(1000.0);
        ClienteEspecial c2 = new ClienteEspecial(10000.0);
        
        c1.consultar();
        c1.depositar();
        c1.consultar();
        c1.sacar();
        c1.consultar();
        
        c2.consultar();
        c2.depositar();
        c2.consultar();
        c2.sacar();
        c2.consultar();
    }
    
}
