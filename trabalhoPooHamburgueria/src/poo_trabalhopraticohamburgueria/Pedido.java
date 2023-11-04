
package poo_trabalhopraticohamburgueria;

public class Pedido {
    private Cliente cliente; // COMPOSICIONALIDADE
    private Hamburguer hamburguer;  // COMPOSICIONALIDADE
    private int quantidade;

    // METODO CONSTRUTOR
    public Pedido(Cliente cliente, Hamburguer hamburguer, int quantidade) {
        this.cliente = cliente;
        this.hamburguer = hamburguer;
        this.quantidade = quantidade;
        cliente.setPedido(this);
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public Hamburguer getHamburguer() {
        return hamburguer;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
     public double calcularPedido() {
        double valorTotal = hamburguer.getValor() * quantidade;
        return valorTotal;
     }
}