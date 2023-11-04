package poo_trabalhopraticohamburgueria;

public class Cliente {
    private String nomeCliente;
    private String endereco;
    private Pedido pedido; // COMPOSICIONALIDADE

    
    // MÉTODO CONSTRUTOR 1 
    public Cliente(String nomeCliente, String endereco) {
        this.nomeCliente = nomeCliente;
        this.endereco = endereco;
    }

    // MÉTODO CONSTRUTOR 2 - SOBRECARGA
    public Cliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
        this.endereco = "RETIRAR NO LOCAL";
    }

    // MÉTODOS GETTER E SETTER
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
      public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Pedido getPedido() {
        return pedido;
    }
}