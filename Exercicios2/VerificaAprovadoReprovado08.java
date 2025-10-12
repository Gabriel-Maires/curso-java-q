// 8
// Pergunte a nota de um aluno (de 0 a 10).
// Diga se o aluno está reprovado (nota < 5), em recuperação (nota entre 5 e 6.9) ou aprovado
// (nota ≥ 7)

package Exercicios2;

import java.util.Scanner;

public class VerificaAprovadoReprovado08 {

    public static void verificaNotaALuno(Double nota){
            if(nota >= 7){
                System.out.print("Aluno aprovado! ");
            }else if(nota < 5){
                System.out.print("Aluno reprovado! ");
            }else if(nota >= 5 && nota <= 6.9){
                System.out.print("Aluno está de recuperação! ");
            }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma nota: ");
        Double nota = sc.nextDouble();
        verificaNotaALuno(nota);
    }
}
