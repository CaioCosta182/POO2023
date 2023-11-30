package ex02polimorfismo;

import java.util.Scanner;

    public class Cd extends Midia {
    
        private int nMusicas;

    public Cd() {
        
    }

    public Cd( int codigo, double preco, String nome,int nMusicas) {
        super(codigo, preco, nome);
        this.nMusicas = nMusicas;
    }
    
    public  String getTipo(){
       return "Cd";
    }
   
   public String getDetalhe(){
   return "O Cd pode armazenar varios tipos de dados, mas sua principal aplicação é o armazenamento de músicas, tendo capacidade de armazenamento de até 600mb.";
   }
   
   public void setMusica(int nMusicas){
   this.nMusicas = nMusicas;
   }
   
   
    @Override
    public void inserirDados() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserindo dados para o CD:");
        System.out.print("Digite o número de músicas: ");
        int numeroMusicas = scanner.nextInt();
        setnMusicas(numeroMusicas);

        System.out.print("Digite o código: ");
        setCodigo(scanner.nextInt());

        System.out.print("Digite o preço: ");
        setPreco(scanner.nextDouble());

        System.out.print("Digite o nome: ");
        setNome(scanner.next());
    }

    // Getter e Setter específico para Cd
    public int getnMusicas() {
        return nMusicas;
    }

    public void setnMusicas(int nMusicas) {
        this.nMusicas = nMusicas;
    }
   }
        
        

