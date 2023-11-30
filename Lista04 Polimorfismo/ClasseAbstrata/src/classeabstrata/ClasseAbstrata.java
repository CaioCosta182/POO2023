package classeabstrata;

import java.util.ArrayList;

public class ClasseAbstrata {
    
    public static void main(String[] args) {
    
        ArrayList<Empregado>listaEmpregado = new ArrayList<>();
        
        Empregado e1 = new Assalariado("Maria", "Silva", "1234", 2500 );
        Assalariado e2 = new Assalariado("Jao", "Silva", "5678", 1500);
        
        Empregado e3 = new Comissionado("Juvenal ", "Antena", "09876", 10000, 0.10);
        Empregado e4 = new Comissionado("Joana ", "Antena", "65432", 1000000, 0.10);
        
        Empregado e5 = new Horista("Lud ", "Silva", "142536", 100.0, 160.0);
        //Empregado e6 = new Horista("Joana ", "Antena", "65432", 200, 165);
        
        Empregado e6 = new Horista( 200, 165);
        
        listaEmpregado.add(e1);
        listaEmpregado.add(e2);
        listaEmpregado.add(e3);
        listaEmpregado.add(e4);
        listaEmpregado.add(e5);
        listaEmpregado.add(e6);
        
        double soma = 0;
        for(int i = 0; i < listaEmpregado.size(); i++){
            Empregado e = listaEmpregado.get(i);
            soma += e.vencimento();
            System.out.println(e.vencimento());
            System.out.println(e.nome);
        }
        System.out.println("-----------Total-------------");
        System.out.println("O Valor gasto foi R$: "+ soma);
    }
    
}
