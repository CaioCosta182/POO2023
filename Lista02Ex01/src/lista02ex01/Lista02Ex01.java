/*
 Escreva em Java uma classe Contador, que encapsule um valor usado
para contagem de itens ou eventos. A classe deve oferecer métodos
que devem:
a) Zerar;
b) Incrementar;
c) Retornar o valor do contador.
 */
package lista02ex01;

import java.util.Scanner;

public class Lista02Ex01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Contador cont = new Contador();

        int op =0;
        //char chave = 's';
        int valor = 0;
        
        while (op != 4) {
        
            System.out.println("Digite 1 para incrementar o valor no contador, 2 para consultar o valor atual, "
                + "0 para zerar o valor atual ou 4 para finalizar o programa: ");
                 op = teclado.nextInt();
            
            
            if (op == 1) {
                cont.incrementar();
                System.out.println("Foi adicionado mais 1 a contagem.");
            } else if (op == 2) {
                valor += cont.retornar();
                System.out.println("O valor atual da contagem é: " + valor);
            } else if (op == 0) {
                valor = cont.zerar();
            }
            
        }
        System.out.println("O valor atual da contagem é: " + valor);
    }

}
