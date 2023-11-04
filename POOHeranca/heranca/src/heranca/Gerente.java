
package heranca;
public class Gerente extends Funcionario {
    
    
    private int senha;
    private int numFuncGerenciados;
    
    public Gerente( String nome, String cpf,int senha){
        super(nome, cpf);
        this.senha = senha;
        
                
    }
    
    public boolean validaSenha(int senha){
        System.out.println("Sou o (a) "+ this.getNome()+ " e estou validando minha senha!");
        if(senha == this.senha){
            return true;
        }else{
            return false;
        }
    }
public double calculaBonificação(){
    
        return (this.getSalario()*0.15);
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumFuncGerenciados() {
        return numFuncGerenciados;
    }

    public void setNumFuncGerenciados(int numFuncGerenciados) {
        this.numFuncGerenciados = numFuncGerenciados;
    }
    
    
}
