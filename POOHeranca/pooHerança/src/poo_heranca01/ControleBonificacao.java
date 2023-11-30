package poo_heranca01;

/**
 *
 * @author caiocosta
 */
public class ControleBonificacao {
    
    double totalBonificacao = 0;
    
    
    public void registra(Funcionario f){
    
        this.totalBonificacao += f.calculaBonificacao();
    }

    public double getTotalBonificacao() {
        return totalBonificacao;
    }
    
}
