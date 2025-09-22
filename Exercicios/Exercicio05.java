
/*
Objetivo do programa: Calcule a área de um quadrado.
                    Como calcular: Area = lado * lado
Data da criacao: 2025-08-28
Criado por: @programacaomentoria
*/

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da área a ser calculada: ");
        Float area = scanner.nextFloat();
        System.out.println("A area é: " + (area * area));
    }
}
