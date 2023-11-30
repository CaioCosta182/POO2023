package ex05polimorfismo;

public class PessoaJuridica extends Pessoa {

    private int cnpj;
    private String nomeFantasia;
    private String razaoSocial;
    private double imposto;

    public PessoaJuridica(String nome, String endereco, String[] contatos, double valorPagamento, int cnpj, String nomeFantasia, String razaoSocial, double imposto) {
        super(nome, endereco, contatos, valorPagamento);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.imposto = valorPagamento * imposto;
    }

    public double realizarPagamento() {

        return valorPagamento - imposto;

    }

    public void relatorio() {
        System.out.println("Nome: " + super.getNome());
        System.out.println("Endereço: " + super.getEndereco());
        System.out.print("Contatos: ");
         for (String contato : getContatos()) {
            System.out.print(contato + " ");
            System.out.println("");
        }
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Nome fantasia:" + nomeFantasia);
        System.out.println("razão social:" + razaoSocial);
        System.out.println("Valor do Pagamento: R$" + super.valorPagamento);
        System.out.println("Imposto: R$" + imposto);
        System.out.println("Pagamento Final: R$" + realizarPagamento());
    }

}
