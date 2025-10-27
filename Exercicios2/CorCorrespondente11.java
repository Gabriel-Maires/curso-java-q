
// 11
// - Pergunte uma letra (V, A, B).
// Diga a cor correspondente (Vermelho, Azul, Branco).
// Atenção, utilize a estrutura CASE.

package Exercicios2;
import java.util.Scanner;

public class CorCorrespondente11 {

    public static void verificaCor(String cor){    
        switch (cor) {
            case ("V"):
                System.out.print("A cor escolhida é: Vermelho");
                break;
            case ("A"):
                System.out.print("A cor escolhida é: Azul");
                break;
            case ("B"):
                System.out.print("A cor escolhida é: Branco");
                break;
            default:
                System.out.print("A opção digitada não é válida.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma das opções: V, A, B ");
        String cor = sc.nextLine();
        verificaCor(cor);
        sc.close();
    }
}
