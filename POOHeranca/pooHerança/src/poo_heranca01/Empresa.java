package poo_heranca01;

public class Empresa {

    public static void main(String[] args) {
        
        Funcionario f1 = new Funcionario("Maria", "85558855");
        Gerente g1 = new Gerente("João", "56161", 1234);
        Diretor d = new Diretor("José", "625135", 5456456);

        f1.setSalario(1500);
        g1.setSalario(5000);
        d.setSalario(15000);
        
        ControleBonificacao controle =new  ControleBonificacao();
        
        controle.registra(f1);
        System.out.println(f1.calculaBonificacao());
        controle.registra(g1);
        System.out.println(g1.calculaBonificacao());
        controle.registra(d);
        System.out.println(d.calculaBonificacao());
        
        System.out.println("Total de bonus pago: " + controle.getTotalBonificacao());
        
//        System.out.println("Eu sou o(a) " + f1.getNome() + " e meu salário é de: " + f1.salario) ;
//        System.out.println("Bonus de " + f1.getNome() + ": " + f1.calculaBonificacao());
//        
//        System.out.println("Eu sou o(a) " + g1.getNome() + " e meu salário é de: " + g1.salario) ;
//        System.out.println("Bonus de " + g1.getNome() + ": " + g1.calculaBonificacao());
//        
//        System.out.println("Eu sou o(a) " + d.getNome() + " e meu salário é de: " + d.salario) ;
//        System.out.println("Bonus de " + d.getNome() + ": " + d.calculaBonificacao());
//   
//
//        boolean resultado = g1.validarSenha(1234);
//
//        if (resultado == true) {
//            System.out.println("Acesso permitido!");
//        } else {
//            System.out.println("Acesso negado!");
//        }

    }
}
