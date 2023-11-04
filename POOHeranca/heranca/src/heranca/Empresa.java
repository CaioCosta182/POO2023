package heranca;
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Funcionario f1 = new Funcionario("João", "010101");
        Gerente g1  = new Gerente("Maria", "020202", 12345 );
        Diretor d1 = new Diretor("Paula","030303",43210);
        
        f1.setSalario(1500);
        g1.setSalario(5000);
        d1.setSalario(10000);
       
        System.out.println("Eu sou o funcionário (a):" +f1.getNome());
        System.out.println("Sou um funcionário (a) e meu bonus é: "+ f1.calculaBonificação() );
       
        System.out.println("Eu sou o gerente (a): " +g1.getNome());
        System.out.println("Sou um gerente e meu bonus é: "+ g1.calculaBonificação() );             
       
        System.out.println("Eu so o diretor (a): "+ d1.getNome());
        System.out.println("Sou um diretor e meu bonus é: "+ d1.calculaBonificação() );
        
       
        
        boolean resul = g1.validaSenha(12345);
            if(resul){
                System.out.println("Acesso permitido");
            }else{
                System.out.println("Acesso negado");
        }
            
    }
    
}
