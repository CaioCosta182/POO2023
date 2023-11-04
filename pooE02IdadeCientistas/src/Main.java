public class Main {
    
public static void main(String[] args) {
        Pessoa albertEinstein = new Pessoa("Albert Einstein", 14, 3, 1879);
        Pessoa isaacNewton = new Pessoa("Isaac Newton", 4, 1, 1643);

        System.out.println("Idade de " + albertEinstein.informaNome() + ": " + albertEinstein.informaIdade() + " anos");
        System.out.println("Idade de " + isaacNewton.informaNome() + ": " + isaacNewton.informaIdade() + " anos");

        // Suponhamos que estamos avançando para o ano de 2023
        albertEinstein.ajustaDataDeNascimento(14, 3, 1879);
        isaacNewton.ajustaDataDeNascimento(4, 1, 1643);

        System.out.println("Idade de " + albertEinstein.informaNome() + " (em 2023): " + albertEinstein.informaIdade() + " anos");
        System.out.println("Idade de " + isaacNewton.informaNome() + " (em 2023): " + isaacNewton.informaIdade() + " anos");
    }
}
