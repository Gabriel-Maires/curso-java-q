package Exercicios3Parte2;

// DESAFIO: Tabuada de um Número: Peça ao usuário para digitar um número inteiro e, em seguida, imprima a tabuada desse número (de 1 a 10).

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número a ser contado: ");
        int numero = sc.nextInt();
        sc.close();
        for(int i = 1; i <= 10; i++){
            System.out.println(numero + " X " + i + " = " + numero * i);
        }
    }
}