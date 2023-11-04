package poo_trabalhopraticohamburgueria;

public class Hamburguer {

    private String nome;
    private String descricao;
    private double valor;

    // MÉTODO CONSTRUTOR 1
    public Hamburguer() {
        this.nome = "";
        this.descricao = "";
        this.valor = 0.0;
    }

    // MÉTODO CONSTRUTOR 2
    public Hamburguer(String nome, String descricao, double valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    // MÉTODOS GETTER E SETTER
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}