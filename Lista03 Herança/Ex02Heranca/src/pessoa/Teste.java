package pessoa;

public class Teste {
    public static void main(String[] args) {
    
   
        Rica rica = new Rica("Patricia", 35, 5000);
        Pobre pobre = new Pobre("Juvenal", 44);
        Miseravel miseravel = new Miseravel("Vitoria", 19);
    
        System.out.println(rica.getNome() + " " + rica.getIdade() + " " + rica.fazCompras());
        System.out.println(pobre.getNome()+ " "+ pobre.getIdade()+ " " + pobre.trabalha());
        System.out.println(miseravel.getNome()+" " + miseravel.getIdade()+ " "+ miseravel.mendiga());
    }
}
