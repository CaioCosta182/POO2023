package ex01heranca;
    public class Tecnico extends Assistente {
        private double bonusSalarial;
        
        public Tecnico(String nome, double salario, int matricula, double bonusSalarial){
            super(nome, salario, matricula);
            this.bonusSalarial = bonusSalarial;
        }
    
}
