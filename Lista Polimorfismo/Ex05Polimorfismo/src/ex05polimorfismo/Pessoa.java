package ex05polimorfismo;
public abstract class Pessoa {
    
    private String nome;
    private String endereco;
    private String []contatos;
    double valorPagamento;

    public Pessoa(String nome, String endereco, String[]contatos, double valorPagamento) {
        this.nome = nome;
        this.endereco = endereco;
        this.contatos = contatos;
        this.valorPagamento = valorPagamento;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String[] getContatos() {
        return contatos;
    }
    
    
    public double realizarPagamento(){
    
        return 0;
    
    }
    
}
