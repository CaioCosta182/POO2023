package heranca;
public class Funcionario {
    
    private String cpf;
    private String nome;
    private double salario;
    
    public Funcionario(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = 0.0;
    }
    public double calculaBonificação(){
    
        return (this.salario*0.10);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
