package ex02polimorfismo;

import java.util.Scanner;

    public class Midia {
    
        private int codigo;
        private double preco;
        private String nome;
        
        Midia(){
        
        }

    public Midia(int codigo, double preco, String nome) {
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
    }
        public String getTipo(){
        return "Midia";
        }
        
        public String getDetalhes(){
        return "Veículos de comunicação.";
        }
        
        public void printDados(){
            System.out.println(this.getTipo()+" "+this.getDetalhes());
        }
        
        public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
    
   
    public void inserirDados() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserindo dados para Midia:");
        
        System.out.print("Digite o código: ");
        setCodigo(scanner.nextInt());

        System.out.print("Digite o preço: ");
        setPreco(scanner.nextDouble());

        System.out.print("Digite o nome: ");
        setNome(scanner.next());
    }
}
