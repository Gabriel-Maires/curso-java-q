package Exercicios3Parte2;

// DESAFIO: Soma de Números até um Limite: Crie um programa que peça números ao usuário repetidamente até que a soma dos números digitados seja maior que 50.
// Ao final, imprima a soma total.

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int resultado = 0;

        for(int i = 0; i <= 50; i++){
            System.out.print("Digite o número a ser somado: ");
            int numero = sc.nextInt();
            resultado += numero;
            if(resultado > 50){
                break;
            }
        }
        System.out.print("Resultado: " + resultado);
        sc.close();
    }
}