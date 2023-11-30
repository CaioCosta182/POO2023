package ex06polimorfismo;

import java.util.Scanner;

public class ContaCorrente {

    Scanner teclado = new Scanner(System.in);

    private double saldo;
    private double taxa;

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    public void depositar() {
        System.out.println("Informe o valor a ser depositado na conta corrente: ");
        System.out.println("");
        saldo += teclado.nextDouble();
    }

    public void sacar() {
        System.out.println("Informe o valor que deseja sacar da conta corrente: ");
        double valor = teclado.nextDouble();
        taxa= valor * 0.05;
        System.out.println("");
        System.out.println("Será descontado uma taxa de R$:"+taxa+ " Pela transação de saque.");
        saldo = saldo - (valor+ taxa);
    }

    public void consultar() {
        System.out.println("O saldo dipovível na conta corrente é: " + saldo);
    }

}
