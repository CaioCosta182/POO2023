/*
 Escreva em Java uma classe Contador, que encapsule um valor usado
para contagem de itens ou eventos. A classe deve oferecer métodos
que devem:
a) Zerar;
b) Incrementar;
c) Retornar o valor do contador.
 */
package lista02ex01;


public class Contador {
    
    private int cont = 0;
    
              
    public int zerar(){
        cont = 0;
        return cont;
    }
    
    public void incrementar(){
        cont++;
    }
    
    public int retornar(){
        return cont;
    }
    
}
