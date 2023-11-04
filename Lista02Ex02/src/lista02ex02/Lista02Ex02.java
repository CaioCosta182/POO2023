/*
Escreva em Java uma classe Ponto2D que represente um ponto no plano
cartesiano. Além dos atributos por você identificados, a classe
deve oferecer os seguintes membros:
a) Construtores sobrecarregados que permitam a inicialização do
ponto:
i) Por default (sem parâmetros) na origem do espaço 2D;
ii) Num local indicado por dois parâmetros do tipo double
(indicando o valor de abcissa e ordenada do ponto que está
sendo criado);
iii) Em um local indicado por outro ponto.
b) Métodos de acesso (getter/setter) dos atributos do ponto;
c) Métodos sobrecarregados de movimentação do ponto com os mesmos
parâmetros indicados para os construtores;
d) Método de comparação semântica do ponto (equals);
e) Método de representação do objeto como String;
f) Método que permita calcular a distância do ponto que recebe a
mensagem, para outro ponto;
g) Método que permita a criação de um novo ponto no mesmo local do
ponto que recebeu a mensagem (clone);
 */
package lista02ex02;

public class Lista02Ex02 {
    public static void main(String[] args) {
       // Exemplo de uso da classe Ponto2D
        Ponto2D ponto1 = new Ponto2D();  // Ponto na origem
        Ponto2D ponto2 = new Ponto2D(5.0, 12.0);  // Ponto em (3.0, 4.0)

        // Exibe os pontos
        System.out.println("Ponto1: " + ponto1);
        System.out.println("Ponto2: " + ponto2);

        // Movimenta o ponto1
        ponto1.mover(-4.5, 6.0);
        System.out.println("Ponto1 após movimento: " + ponto1);

        // Calcula a distância entre ponto1 e ponto2
        double distancia = ponto1.calcularDistancia(ponto2);
        System.out.println("Distância entre ponto1 e ponto2: " + distancia);

        // Cria um novo ponto no mesmo local que ponto2 (clone)
        Ponto2D ponto3 = ponto2.clone();
        System.out.println("Clone de ponto2: " + ponto3);

        // Verifica a igualdade semântica entre ponto2 e o clone
        System.out.println("Ponto2 é igual ao clone? " + ponto2.equals(ponto3));
    }
}
  