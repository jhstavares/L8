package ListaDeCandidatos;

import java.util.Scanner;

public class CandidatosMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ListaDeCandidatos candidatos = new ListaDeCandidatos();
        int respostaDoUsuario = 0;

        System.out.print("Deseja adicionar algum candidato a sua lista ([1] - sim / [2] - não): ");
        respostaDoUsuario = input.nextInt();

        if (respostaDoUsuario == 1) {
            do {
                candidatos.adicionarCandidatos();
                System.out.print("Deseja adicionar algo mais? ([1] - sim [2] - não): ");
                respostaDoUsuario = input.nextInt();

            } while (respostaDoUsuario == 1);

            candidatos.mostrarAlunos();
            System.out.print("Você gostaria de remover algum candidato da sua lista? ([1] - sim ] / [2] - não):  ");
            respostaDoUsuario = input.nextInt();
            do {
                candidatos.removerCandidato();
                System.out.print("Você deseja remover malgo mais? ([1] - sim / [2] - não): ");
                respostaDoUsuario = input.nextInt();
            } while (respostaDoUsuario == 1);
        }
        System.out.println("\nVolte sempre, Muito obrigado pela preferência <3 ");
        System.out.println("lista atualizada: " + candidatos.getCandidatos());


    }

}
