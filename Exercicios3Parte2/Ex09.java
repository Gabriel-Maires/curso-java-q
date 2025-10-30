package Exercicios3Parte2;

import java.util.Scanner;

// DESAFIO: Múltiplos de 5: Imprima todos os múltiplos de 5 que estão entre 1 e 50 (inclusive).

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i <= 50; i++){
            if(i % 10 == 5 || i % 10 == 0){
                System.out.print(i);
                System.out.print(" ");
            }
        }
        sc.close();
    }
}