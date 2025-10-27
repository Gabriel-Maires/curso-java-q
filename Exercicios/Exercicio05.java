
/*
Objetivo do programa: Calcule a área de um quadrado.
                    Como calcular: Area = lado * lado
Data da criacao: 2025-08-28
Criado por: @programacaomentoria
*/

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do lado para calcular a area do quadrado: ");
        double lado = sc.nextDouble();
        System.out.println("A area do quadrado é: " + (lado * lado));
        sc.close();
    }
}
