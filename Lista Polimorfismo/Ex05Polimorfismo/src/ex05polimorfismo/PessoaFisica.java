package ex05polimorfismo;

public class PessoaFisica extends Pessoa {

    private int cpf;
    private double imposto;

    public PessoaFisica(String nome, String endereco, String[] contatos, double valorPagamento, int cpf, double imposto) {
        super(nome, endereco, contatos, valorPagamento);
        this.cpf = cpf;
        this.imposto = valorPagamento * imposto;
    }

    public int getCpf() {
        return cpf;
    }

    public double getImposto() {
        return imposto;
    }

    public double getValorPagamento() {
        return valorPagamento;
    }

    @Override
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
        System.out.println("CPF: " + getCpf());
        System.out.println("Valor do Pagamento: R$" + getValorPagamento());
        System.out.println("Imposto: R$" + getImposto());
        System.out.println("Pagamento Final: R$" + realizarPagamento());
    }
}
