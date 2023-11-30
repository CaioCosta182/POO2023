
public class Empregado {
    
 private String nome;
    private String sobrenome;
    private double salarioMensal;
    private String nomeCompleto;

    public Empregado() {
        // Construtor vazio
    }

    public Empregado(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }

    public void informarDados(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }

    public void darAumento(double percentual) {
        salarioMensal += salarioMensal * (percentual / 100);
    }

    public double calcularSalarioAnual() {
        return salarioMensal * 12;
    }

    public String informarNomeCompleto() {
        this.nomeCompleto = nome +sobrenome;
         return nomeCompleto;
    }

  
}
