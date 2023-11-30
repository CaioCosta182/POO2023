public class Pessoa {
    
private String nome;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;
    private int idade;

    public Pessoa(String nome, int diaNascimento, int mesNascimento, int anoNascimento) {
        this.nome = nome;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
        calcularIdade();
    }

    private void calcularIdade() {
        int diaAtual = 31; // Dia atual (exemplo)
        int mesAtual = 8;  // Mês atual (exemplo)
        int anoAtual = 2023; // Ano atual (exemplo)

        idade = anoAtual - anoNascimento;
        
        if (mesNascimento > mesAtual || (mesNascimento == mesAtual && diaNascimento > diaAtual)) {
            idade--;
        }
    }

    public int informaIdade() {
        return idade;
    }

    public String informaNome() {
        return nome;
    }

    public void ajustaDataDeNascimento(int dia, int mes, int ano) {
        diaNascimento = dia;
        mesNascimento = mes;
        anoNascimento = ano;
        calcularIdade();
    }
}