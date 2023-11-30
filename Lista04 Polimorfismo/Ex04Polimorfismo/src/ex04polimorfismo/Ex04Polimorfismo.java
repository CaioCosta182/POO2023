package ex04polimorfismo;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04Polimorfismo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ArrayList<Veiculos> cadastrarVeiculo = new ArrayList<>();

        System.out.println("Escolha o tipo de veículo (C para Carro, M para Moto):");
        String tipoVeiculo = teclado.next();

        if (tipoVeiculo.equalsIgnoreCase("C")) {

            Carro carro = new Carro();
            cadastrarVeiculo.add(carro.insertDados());
            
            //carro.imprimirRelatorio();

        } else if (tipoVeiculo.equalsIgnoreCase("M")) {
            cadastrarMoto(teclado);
        } else {
            System.out.println("Opção inválida");
        }

        teclado.close();
    }

   

    // Método para cadastrar uma moto
    private static void cadastrarMoto(Scanner teclado) {
        System.out.println("Informe o modelo da moto:");
        String modelo = teclado.next();
        System.out.println("Informe o preço da moto:");
        double preco = teclado.nextDouble();
        System.out.println("Informe o ano da moto");
        int ano = teclado.nextInt();
        Moto moto = new Moto(modelo, preco, ano);
        System.out.println("\nRelatório da Moto:");
        moto.imprimirRelatorio();
    }

}
