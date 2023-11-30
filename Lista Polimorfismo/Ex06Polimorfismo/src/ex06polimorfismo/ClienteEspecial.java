package ex06polimorfismo;

import java.util.Scanner;

    public class ClienteEspecial extends ContaCorrente{

    public ClienteEspecial(double saldo) {
        super(saldo);
    }
        
         Scanner teclado = new Scanner(System.in);

   
    private double taxa;
    
    @Override
    public void depositar() {
        System.out.println("Informe o valor a ser depositado especial: ");
        System.out.println("");
        super.setSaldo(getSaldo()+teclado.nextDouble());
    }

    @Override
    public void sacar() {
        System.out.println("Informe o valor que deseja sacar da conta especial: ");
        System.out.println("");
        double valor = teclado.nextDouble();
        taxa= valor * 0.01;
        System.out.println("Será descontado uma taxa de R$:"+taxa+ " Pela transação de saque.");
        System.out.println("");
        super.setSaldo(getSaldo() - (valor + taxa));
        
        
    }

    @Override
    public void consultar() {
        System.out.println("O saldo dipovível na conta especial é: " + getSaldo());
    }
        
}
