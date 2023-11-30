
public class EmpregadoTeste {
    
public static void main(String[] args) {
        Empregado empregado1 = new Empregado("João", "Silva", 3000.0);
        Empregado empregado2 = new Empregado();

        empregado2.informarDados("Maria", "Souza", 4000.0);

        System.out.println("Salário anual de " + empregado1.informarNomeCompleto() + ": $" + empregado1.calcularSalarioAnual());
        System.out.println("Salário anual de " + empregado2.informarNomeCompleto() + ": $" + empregado2.calcularSalarioAnual());

        empregado1.darAumento(10);
        empregado2.darAumento(10);

        System.out.println("Salário anual de " + empregado1.informarNomeCompleto() + " após aumento: $" + empregado1.calcularSalarioAnual());
        System.out.println("Salário anual de " + empregado2.informarNomeCompleto() + " após aumento: $" + empregado2.calcularSalarioAnual());
    }
}
