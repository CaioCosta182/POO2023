package poo_trabalhopraticohamburgueria;

import java.util.ArrayList;
import java.util.Scanner;

public class HamburgueriaApp {

    static Scanner teclado = new Scanner(System.in);
    static ArrayList<Hamburguer> cardapio = new ArrayList<>();
    static ArrayList<Cliente> clientes = new ArrayList<>();

    public static void main(String[] args) {
        int opcao;
        adicionarItemCardapio();

        do {
            System.out.println("OLÁ! INFORME A OPERAÇÃO A SER REALIZADA: ");
            System.out.println("1- CONSULTAR CARDÁPIO | 2 - REALIZAR PEDIDO | 3 - STATUS DO PEDIDO | 0 - FINALIZAR ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("Finalizando...");
                    break;
                case 1:
                    System.out.println(solicitarCardapio());
                    break;
                case 2:
                    realizarPedido();
                    break;
                case 3:
                    statusPedido();
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    //  MÉTODOS
    private static void adicionarItemCardapio() {
        cardapio.add(new Hamburguer("BOMB BACON", " (Pão, hambúrguer artesanal de carne bovina (130 g), queijo cheddar, bacon, ovo caipira, cebola roxa e picles)...........................", 35));
        cardapio.add(new Hamburguer("BURGUER #710", " (Pão, hambúrguer artesanal de carne bovina (130 g), queijo cheddar, cebola caramelizada e muito bacon)................................", 35));
        cardapio.add(new Hamburguer("MASTER CHICKEN", " (Pão, hambúrguer artesanal de frango (130 g), mussarela, bacon e salada ©710).......................................................", 35));
        cardapio.add(new Hamburguer("BIG BOMB", " (Pão, dois hambúrgueres artesanais de carne bovina (130 g/cada), dupla camada de queijo cheddar, cebola caramelizada e muito bacon).......", 45));
        cardapio.add(new Hamburguer("BIG #710", " (Pão, dois hambúrgueres artesanais de carne bovina (130 g/cada), dupla camada de queijo cheddar, bacon, ovo caipira, cebola roxa e picles)", 45));
        cardapio.add(new Hamburguer("BIG CHICKEN", " (Pão, dois hambúrgueres artesanais de frango (130 g/cada), dupla camada de mussarela, bacon e salada ©710..............................", 45));
    }

    private static String solicitarCardapio() {
        StringBuilder cardapioStr = new StringBuilder();
        for (int i = 0; i < cardapio.size(); i++) {
            cardapioStr.append(i + 1).append(" - ").append(cardapio.get(i).getNome()).append(cardapio.get(i).getDescricao()).append("...R$")
                    .append(cardapio.get(i).getValor()).append("\n");
        }
        return cardapioStr.toString();
    }

    public static void realizarPedido() {
        System.out.println("INFORME SEU NOME:");
        String nomeCliente = teclado.next();
        
        System.out.println("ESCOLHA UMA OPÇÃO DE ENTREGA: ");
        System.out.println("1 - INFORMAR ENDEREÇO");
        System.out.println("2 - RETIRAR NO LOCAL");
        int opcaoEntrega = teclado.nextInt();

        String endereco = "";

        if (opcaoEntrega == 1) {
            System.out.println("INFORME O ENDEREÇO:");
            endereco = teclado.next();
            
        }

        System.out.println("INFORME A OPÇÃO DO HAMBURGUER DESEJADO:");
        int numeroHamburguer = teclado.nextInt();

        System.out.println("INSIRA A QUANTIDADE: ");
        int quantidade = teclado.nextInt();

        if (numeroHamburguer < 1 || numeroHamburguer > cardapio.size()) {
            System.out.println("OPÇÃO INVÁLIDA! TENTE NOVAMENTE.");
        } else {
         
            Cliente cliente;
        
        if (opcaoEntrega == 1) {
            cliente = new Cliente(nomeCliente, endereco);
        } else {
            cliente = new Cliente(nomeCliente);
        }  
            Hamburguer hamburguer = cardapio.get(numeroHamburguer - 1);
            Pedido pedido = new Pedido(cliente, hamburguer, quantidade);
            clientes.add(cliente);
            System.out.println("PEDIDO REALIZADO COM SUCESSO! \n");
        }
    }

    private static void statusPedido() {
        if (!clientes.isEmpty()) {
            System.out.println("STATUS DOS PEDIDOS:");
            for (int i = 0; i < clientes.size(); i++) {
                Cliente cliente = clientes.get(i);
                Pedido pedido = cliente.getPedido();
                System.out.println("DESCRIÇÃO DO PEDIDO " + (i + 1) + ":");
                System.out.println("CLIENTE: " + cliente.getNomeCliente());
                System.out.println("ENDEREÇO: " + cliente.getEndereco());
                System.out.println("HAMBURGUER: " + pedido.getHamburguer().getNome());
                System.out.println("QUANTIDADE: " + pedido.getQuantidade());
                System.out.println("VALOR TOTAL: R$" + pedido.calcularPedido());
                System.out.println("MÉDIA DE PREPARO: 50 MINUTOS");
                System.out.println();
            }
        } else {
            System.out.println("NENHUM PEDIDO REALIZADO! \n");
        }
    }
}