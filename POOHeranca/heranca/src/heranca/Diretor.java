package heranca;
public class Diretor extends Gerente {
    private int numDepartamentos;
    
    public Diretor(String nome, String cpf, int senha){
        super( nome, cpf,senha);
        this.numDepartamentos = 4;
    }
    
    public double calculaBonificação(){
    
        return (this.getSalario()*0.20);
    }

    public int getNumDepartamentos() {
        return numDepartamentos;
    }

    public void setNumDepartamentos(int numDepartamentos) {
        this.numDepartamentos = numDepartamentos;
    }
    
}
