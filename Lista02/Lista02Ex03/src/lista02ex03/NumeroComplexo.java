
package lista02ex03;

public class NumeroComplexo {
    private double parteReal;
    private double parteImaginaria;

    // Construtor com valores para a parte real e parte imaginária
    public NumeroComplexo(double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    // Getters e setters
    public double getParteReal() {
        return parteReal;
    }

    public void setParteReal(double parteReal) {
        this.parteReal = parteReal;
    }

    public double getParteImaginaria() {
        return parteImaginaria;
    }

    public void setParteImaginaria(double parteImaginaria) {
        this.parteImaginaria = parteImaginaria;
    }

    // Método para somar dois números complexos
    public void somar(NumeroComplexo outroComplexo) {
        this.parteReal += outroComplexo.getParteReal();
        this.parteImaginaria += outroComplexo.getParteImaginaria();
    }

    // Método para subtrair dois números complexos
    public void subtrair(NumeroComplexo outroComplexo) {
        this.parteReal -= outroComplexo.getParteReal();
        this.parteImaginaria -= outroComplexo.getParteImaginaria();
    }

    // Método para multiplicar dois números complexos
    public void multiplicar(NumeroComplexo outroComplexo) {
        double novaParteReal = (this.parteReal * outroComplexo.getParteReal()) -
                                (this.parteImaginaria * outroComplexo.getParteImaginaria());
        double novaParteImaginaria = (this.parteReal * outroComplexo.getParteImaginaria()) +
                                      (this.parteImaginaria * outroComplexo.getParteReal());
        this.parteReal = novaParteReal;
        this.parteImaginaria = novaParteImaginaria;
    }

    // Método para dividir dois números complexos
    public void dividir(NumeroComplexo outroComplexo) {
        double denominador = outroComplexo.getParteReal() * outroComplexo.getParteReal() +
                             outroComplexo.getParteImaginaria() * outroComplexo.getParteImaginaria();

        double novaParteReal = (this.parteReal * outroComplexo.getParteReal() +
                                this.parteImaginaria * outroComplexo.getParteImaginaria()) / denominador;
        double novaParteImaginaria = (this.parteImaginaria * outroComplexo.getParteReal() -
                                      this.parteReal * outroComplexo.getParteImaginaria()) / denominador;

        this.parteReal = novaParteReal;
        this.parteImaginaria = novaParteImaginaria;
    }

    // Método para comparação semântica dos números complexos
    public boolean equals(NumeroComplexo outroComplexo) {
        return this.parteReal == outroComplexo.getParteReal() &&
               this.parteImaginaria == outroComplexo.getParteImaginaria();
    }

    // Método para representação string do número complexo
    @Override
    public String toString() {
        return parteReal + (parteImaginaria >= 0 ? "+" : "") + parteImaginaria + "i";
    }

    // Método para calcular o módulo do número complexo
    public double calcularModulo() {
        return Math.sqrt(parteReal * parteReal + parteImaginaria * parteImaginaria);
    }
}
