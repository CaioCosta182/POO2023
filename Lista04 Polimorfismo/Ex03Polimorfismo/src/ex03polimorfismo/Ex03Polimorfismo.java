package ex03polimorfismo;

import java.util.Scanner;

public class Ex03Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 'S' para inserir um empregado assalariado ou 'H' para inserir um empregado horista:");
        char escolha = scanner.next().charAt(0);

        Funcionario empregado;

        if (escolha == 'S' || escolha == 's') {
            System.out.print("Digite o nome do empregado assalariado: ");
            String nome = scanner.next();
            System.out.print("Digite o salário do empregado assalariado: ");
            double salario = scanner.nextDouble();

            empregado = new Assalariado(nome, salario);
        } else if (escolha == 'H' || escolha == 'h') {
            System.out.print("Digite o nome do empregado horista: ");
            String nome = scanner.next();
            System.out.print("Digite a quantidade de horas trabalhadas: ");
            double horasTrabalhadas = scanner.nextDouble();

            empregado = new Horista(nome, 200,horasTrabalhadas);
        } else {
            System.out.println("Escolha inválida. Encerrando o programa.");
            return;
        }

       
        System.out.println("\nInformações do empregado:");
        System.out.println("Nome: " + empregado.getNome());

       
        if (empregado instanceof Assalariado) {
            Assalariado assalariado = (Assalariado) empregado;
            System.out.println("Salário: " + assalariado.getPay());
        } else if (empregado instanceof Horista) {
            Horista horista = (Horista) empregado;
            System.out.println("Salário: " + horista.getPay());
        }

       
        double gastoTotal = calcularGastoTotal(empregado);
        System.out.println("\nGasto total da empresa com a folha salarial: " + gastoTotal);

      
    }

    public static double calcularGastoTotal(Funcionario empregado) {
       
        return empregado.getPay();
    }
}