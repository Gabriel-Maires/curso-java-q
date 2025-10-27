// 7
// Pergunte um número de 1 a 7.
// Diga a qual dia da semana esse número é correspondente (1 = Domingo, 2 = Segunda, ..., 7 =
// Sábado).
// Atenção, utilize a estrutura CASE.

package Exercicios2;

import java.util.Scanner;

public class DiaDaSemana07 {
    public static void verificaDiaDaSemana(String dia){
            switch (dia) {
            case ("1"):
                System.out.print("Você escolheu Segunda-Feira! ");
                break;
            case ("2"):
                System.out.print("Você escolheu Terça-Feira! ");
                break;
            case ("3"):
                System.out.print("Você escolheu Quarta-Feira! ");
                break;
            case ("4"):
                System.out.print("Você escolheu Quinta-Feira! ");
                break;
            case ("5"):
                System.out.print("Você escolheu Sexta-Feira! ");
                break;
            case ("6"):
                System.out.print("Você escolheu Sábado! ");
                break;
            case ("7"):
                System.out.print("Você escolheu Domingo! ");
                break;
            default:
                System.out.print("A opção digitada não é válida. ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para o dia da semana, (Ex. 1 - Segunda): ");
        String dia = sc.nextLine();
        verificaDiaDaSemana(dia);
        sc.close();
    }
}
