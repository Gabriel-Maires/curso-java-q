/*
6 3
Faça um programa que pergunte um número.
Exiba os números de 0 até o número digitado, separados por um espaço, exibindo o
resultado.
*/

import java.util.Scanner;

public class ExibeAteNumeroDigitado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número a ser contado: ");
        int numero = sc.nextInt();
        for(int i = 0; i <= numero;i++){
            System.out.print(i);
            System.out.print(" ");
        }
        sc.close();

    }
}