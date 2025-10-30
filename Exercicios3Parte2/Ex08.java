package Exercicios3Parte2;

// DESAFIO: Contagem Regressiva Personalizada: Solicite um número inteiro ao usuário e faça uma contagem regressiva a partir desse número até 0, 
// exibindo "FIM!" ao final.

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Olá, digite um numero: ");
        int numero = sc.nextInt();
        for(int i = numero; i >= 0; i--){
            System.out.print(i);
            System.out.print(" ");
        }
        sc.close();
    }
}