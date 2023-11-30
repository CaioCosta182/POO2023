package classeabstrata;
public abstract class Empregado {
    
    String nome;
    String sobrenome;
    String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public Empregado(){
        this.nome = null;
        this.sobrenome = null;
        this.cpf = null;
    }
    
    public Empregado (String n, String sn, String doc){
        this.nome = n;
        this.sobrenome = sn;
        this.cpf = doc;
    }
    
    public abstract double vencimento();
}
