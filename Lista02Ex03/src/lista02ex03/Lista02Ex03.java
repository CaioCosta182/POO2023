/*
) Escreva em Java uma classe NumeroComplexo, que representa um número
complexo. A classe deve fornecer as seguintes operações:
a) Construtor com valores das partes inteira e fracionária;
b) Métodos getter/setter para os atributos da parte inteira e parte
imaginária;
c) Método somar, que recebe outro número complexo e o adiciona ao
número complexo que recebeu a mensagem. (a+bi)+(c+di) =
(a+c)+(b+d)i;
d) Método subtrair, que recebe outro número complexo e o subtrai do
número complexo que recebeu a mensagem. (a+bi)−(c+di) =
(a−c)+(b−d)i;
e) Método multiplicar, que recebe outro número complexo e o
multiplica ao complexo que recebeu a mensagem: (a+bi) * (c+di) =
(ac−bd)+(ad+bc)i;
f) Método dividir, que recebe outro número complexo e o divide ao
complexo que recebeu a mensagem: (a+bi) / (c+di) = (ac+bd)/(c2 +
d2
) + (bc-ad)/(c2 + d2
)i;
g) Um método de comparação semântica dos números complexos;
h) Um método que gere e retorne a representação string do número
complexo;
i) Um método que retorne o módulo do número complexo.
 */
package lista02ex03;

public class Lista02Ex03 {
    public static void main(String[] args) {
             // Exemplo de uso da classe NumeroComplexo
        NumeroComplexo complexo1 = new NumeroComplexo(2.0, 3.0);
        NumeroComplexo complexo2 = new NumeroComplexo(1.0, -2.0);

        System.out.println("Complexo1: " + complexo1);
        System.out.println("Complexo2: " + complexo2);

        // Operações
        complexo1.somar(complexo2);
        System.out.println("Soma: " + complexo1);

        complexo1.subtrair(complexo2);
        System.out.println("Subtração: " + complexo1);

        complexo1.multiplicar(complexo2);
        System.out.println("Multiplicação: " + complexo1);

        complexo1.dividir(complexo2);
        System.out.println("Divisão: " + complexo1);

        // Comparação semântica
        System.out.println("Comparação semântica: " + complexo1.equals(complexo2));

        // Módulo
        System.out.println("Módulo do Complexo1: " + complexo1.calcularModulo());
        System.out.println("Módulo do Complexo2: " + complexo2.calcularModulo());
    }
}