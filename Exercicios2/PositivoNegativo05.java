package Exercicios2;
// 5 Pergunte um número. Diga se esse número é positivo, negativo ou zero.

import java.util.Scanner;

public class PositivoNegativo05 {

    public static void verificaNumeroPositivoNegativo(Integer numero){
        if(numero < 0){
            System.out.print("Este é um número negativo! ");
        } else if(numero > 0){
            System.out.print("Este é um número positivo! ");
        } else if(numero == 0){
            System.out.print("Você digitou o número 0! ");
        }
    }

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um número: ");
    int numero = sc.nextInt();
    verificaNumeroPositivoNegativo(numero);

    }
}
