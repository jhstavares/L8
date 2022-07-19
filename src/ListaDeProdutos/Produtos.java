package ListaDeProdutos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Produtos {
    public static void menu() {
        System.out.println("Produtos");
        System.out.println("1. Adicionar produto à lista.");
        System.out.println("2. Exibir Produtos");
        System.out.println("3. Excluir produto.");
        System.out.println("4. Sair.");

    }
    public static Gerenciador.Produto adicionar() {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do produto e tecle enter.");
        String nome = input.next();
        System.out.println("Digite o preço do produto e tecle enter.");
        double preco = input.nextDouble();

        return new Gerenciador.Produto(nome, preco);
    }

    public static void excluir(List<Gerenciador.Produto> Gerenciador) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do produto e tecle enter");
        String nome = input.next();
        for (int i = 0; i < Gerenciador.size(); i++) {
            if (Gerenciador.get(i).getNome().contains(nome)) {
                Gerenciador.remove(i);
                System.out.println("gerenciador de produtos\n" + "Produto excluído");
                System.out.println(Gerenciador);
                break;
            }
        }
    }

    public static void main(String[] args) {
        int opcao;
        Scanner input = new Scanner(System.in);
        List<Gerenciador.Produto> listaDeProdutos = new ArrayList<>();
        do {
            menu();
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    Gerenciador.Produto Gerenciador = adicionar();
                    Produtos.add(Gerenciador);
                    break;
                case 2:
                    System.out.println(listaDeProdutos);
                    break;
                case 3:
                    List<ListaDeProdutos.Gerenciador.Produto> Produtos = null;
                    excluir(Produtos);
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao < 4);

    }

    private static void add(Gerenciador.Produto gerenciador) {
    }
}

