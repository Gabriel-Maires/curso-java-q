package Exercicios3Parte2;

// DESAFIO: Números Ímpares: Elabore um programa que mostre apenas os números ímpares de 1 a 19.

public class Ex04 {
    public static void main(String[] args) {
        for(int i = 1; i <= 19; i++){
            if(i % 2 != 0){
            System.out.print(i);
            System.out.print(" ");
            }
        }
    }
}