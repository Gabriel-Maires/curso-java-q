package Exercicios3Parte2;

// DESAFIO: Números Pares: Escreva um algoritmo que imprima apenas os números pares de 2 a 20.

public class Ex03 {
    public static void main(String[] args) {
        for(int i = 2; i <= 20; i++){
            if(i % 2 == 0){
            System.out.print(i);
            System.out.print(" ");
            }
        }
    }
}