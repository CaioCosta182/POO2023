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

public class Ponto2D {
     
    private double x;  // Coordenada x
    private double y;  // Coordenada y

    // Construtor padrão (na origem do espaço 2D)
    public Ponto2D() {
        this.x = 0.0;
        this.y = 0.0;
    }

    // Construtor com coordenadas especificadas
    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Construtor com base em outro ponto
    public Ponto2D(Ponto2D outroPonto) {
        this.x = outroPonto.getX();
        this.y = outroPonto.getY();
    }

    // Getters e setters
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Métodos de movimentação
    public void mover(double deltaX, double deltaY) {
        this.x += deltaX;
        this.y += deltaY;
    }

    // Método para comparação semântica (equals)
    public boolean equals(Ponto2D outroPonto) {
        return this.x == outroPonto.getX() && this.y == outroPonto.getY();
    }

    // Método para representação como String
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Método para calcular a distância entre dois pontos
    public double calcularDistancia(Ponto2D outroPonto) {
        double deltaX = this.x - outroPonto.getX();
        double deltaY = this.y - outroPonto.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    // Método para criar um novo ponto no mesmo local (clone)
    public Ponto2D clone() {
        return new Ponto2D(this.x, this.y);
    }
  }