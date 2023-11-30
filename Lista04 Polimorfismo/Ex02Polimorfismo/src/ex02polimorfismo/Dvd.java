package ex02polimorfismo;

import java.util.Scanner;

    public class Dvd extends Midia {
        
        private int nFaixas;

    public Dvd() {
    }

    public Dvd(int codigo, double preco, String nome,int nFaixas ) {
        super(codigo, preco, nome);
        this.nFaixas = nFaixas;
    }
   public  String getTipo(){
       return "Dvd";
    }
   
   public String getDetalhe(){
   return "O Dvd pode armazenar vários tipos de dados, desde músicas ou vídeos até arquivos e programas, com capacidade de armazenamento entre 4,5Gb até 9Gb.";
   }
   
   public void setFaixas(int nFaixas){
   this.nFaixas = nFaixas;
   }

    public int getnFaixas() {
        return nFaixas;
    }
   
    @Override
    public void inserirDados() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserindo dados para o DVD:");
        System.out.print("Digite o número de faixas: ");
        int numeroFaixas = scanner.nextInt();
        setFaixas(numeroFaixas);

        System.out.print("Digite o código: ");
        setCodigo(scanner.nextInt());

        System.out.print("Digite o preço: ");
        setPreco(scanner.nextDouble());

        System.out.print("Digite o nome: ");
        setNome(scanner.next());
    }

   
    
}
