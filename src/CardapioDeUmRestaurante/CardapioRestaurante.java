package CardapioDeUmRestaurante;

import java.util.Scanner;

public class CardapioRestaurante {

    public class MainRestaurante {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            CardapioRestaurante cardapioRestaurante= new cardapioRestaurante();
            boolean loop = true;
            while (loop) {
                System.out.println("Digite '1' para adicionar prato\n '2' para remover prato\n'3' Para mostrar lista de pratos\n '4' para sair");
                int opcao = Integer.parseInt(input.nextLine());
                switch (opcao) {
                    case 1:
                        cardapioRestaurante.addprato();
                        break;
                    case 2:
                        cardapioRestaurante.excluir();
                    case 3:
                        cardapioRestaurante.exibir();
                        break;
                    case 4:
                        loop = false;
                }
            }
        }
    }

    private void addprato() {
    }

    private void cardapioRestaurante() {
    }
    
    }
}
