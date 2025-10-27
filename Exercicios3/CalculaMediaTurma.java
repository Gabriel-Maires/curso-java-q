/*
Pergunte quantos alunos há na turma.
Para cada aluno, pergunte a nota e calcule a média da turma.
Atenção, utilize um loop FOR.
*/

import java.util.Scanner;

public class CalculaMediaTurma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de alunos: ");
        int numeroAlunos = sc.nextInt();
        double somaNotasAlunos = 0;
        for (int i = 0; i < numeroAlunos; i++){
            System.out.print("Qual a nota " + (i + 1) + "º aluno? ");
            double notaAluno = sc.nextDouble();
            somaNotasAlunos += notaAluno;
        }
        System.out.print("A média da turma é: " + (somaNotasAlunos / numeroAlunos));
        sc.close();
    }
}