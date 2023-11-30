/*
 Implemente a classe Funcionario com nome, salario e os métodos
addAumento(double valor), ganhoAnual() e exibeDados() - imprime os valores do funcionário.
a. crie a classe Assistente, que também é um funcionário, e que possui um número de
matrícula (faça os métodos GET e SET). Sobrescreva o método exibeDados().
b. sabendo que os Assistentes Técnicos possuem um bônus salarial e que os Assistentes
Administrativos possuem um turno (dia ou noite) e um adicional noturno, crie as classes
Tecnico e Administrativo e sobrescreva o método ganhoAnual() de ambas as classes
(Administrativo e Tecnico).
 */
package ex01heranca;

public class Main {
    public static void main(String[] args) {
        Assistente assistente = new Assistente("João", 3000, 1234);
        assistente.exibeDados();
        
        Tecnico tecnico = new Tecnico("Maria",  6000, 12345,5000);
        System.out.println("Ganho anual do técnico: " + tecnico.ganhoAnual());
        
        Administrativo administrativo = new Administrativo("Juvenal", 4500, 123456, "noite",2000);
        System.out.println("Ganho anual do administrativo: "+ administrativo.ganhoAnual());
    }
    
}
