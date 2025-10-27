/*
12 3
Pergunte um número.
Some todos os números de 1 até esse número.
Atenção, utilize um loop WHILE.
*/

import java.util.Scanner;

public class SomaAteNumeroWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número a ser contado: ");
        int numero = sc.nextInt();
        for(int i = 1; i < numero; i += i){
            if(i < numero){
                System.out.print(i + i);asdasd
                System.out.print(" ");
            }
        }
        sc.close();
    }
}