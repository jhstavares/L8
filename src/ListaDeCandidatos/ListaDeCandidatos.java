package ListaDeCandidatos;

import java.util.HashMap;
import java.util.Scanner;

public class ListaDeCandidatos {

    public void adicionarCandidatos() {
    }

    public void mostrarAlunos() {
    }

    public void removerCandidato() {
    }

    public String getCandidatos() {
        return null;
    }


    public class ListadeCandidatos {
        private int numeroDaMatricula;
        private double nota;
        private HashMap<Integer, Double> candidatos = new HashMap<>();
        public int quantidadeDeCandidatos;
        public String respostas;

        public ListadeCandidatos() {
            this.numeroDaMatricula = numeroDaMatricula;
            this.nota = nota;
            this.candidatos = candidatos;
            this.quantidadeDeCandidatos = quantidadeDeCandidatos;
            this.respostas = respostas;
        }

        public void adicionarCandidatos() {
            Scanner input1 = new Scanner(System.in);
            System.out.print("\nQuantos candidatos você gostaria de adicionar?: ");
            quantidadeDeCandidatos = input1.nextInt();

            for (int i = 0; i < quantidadeDeCandidatos; i++) {
                System.out.print("Informe o número da matricula do(a) " + (1 + i) + "º candidato(a): ");
                this.numeroDaMatricula = input1.nextInt();
                System.out.print("Informe a nota do(a) " + (i + 1) + "º candidato: ");
                this.nota = input1.nextInt();
                candidatos.put(getNumeroDaMatricula(), getNota());
            }

        }

        public void mostrarAlunos() {
            System.out.println("\nLista de candidatos após as atualizações " + this.getCandidatos());
        }

        public void removerCandidato() {
            Scanner input2 = new Scanner(System.in);
            System.out.print("Quantos candidatos você gostaria de remover?: ");
            quantidadeDeCandidatos = input2.nextInt();

            for (int i = 0; i < quantidadeDeCandidatos; i++) {
                System.out.print("Informe o número da matricula do(a) " + (i + 1) + "º candidato(a): ");
                this.numeroDaMatricula = input2.nextInt();
                candidatos.remove(numeroDaMatricula);
            }
        }


        public int getNumeroDaMatricula() {
            return numeroDaMatricula;
        }

        public void setNumeroDaMatricula(int numeroDaMatricula) {
            this.numeroDaMatricula = numeroDaMatricula;
        }

        public double getNota() {
            return nota;
        }

        public void setNota(double nota) {
            this.nota = nota;
        }

        public HashMap<Integer, Double> getCandidatos() {
            return candidatos;
        }

        public void setCandidatos(HashMap<Integer, Double> candidatos) {
            this.candidatos = candidatos;
        }

        public int getQuantidadeDeCandidatos() {
            return quantidadeDeCandidatos;
        }

        public void setQuantidadeDeCandidatos(int quantidadeDeCandidatos) {
            this.quantidadeDeCandidatos = quantidadeDeCandidatos;
        }

        public String getRespostas() {
            return respostas;
        }

        public void setRespostas(String respostas) {
            this.respostas = respostas;
        }


    }
}