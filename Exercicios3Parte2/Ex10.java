package Exercicios3Parte2;

// DESAFIO: Menu de Opções: Crie um menu simples que exiba as opções "1. Iniciar", "2. Configurar", "3. Sair". 
// O programa deve continuar exibindo o menu até que o usuário escolha a opção "3".

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        boolean sair = false;
        Scanner sc = new Scanner(System.in);
        while(sair == false){
            System.out.println("Digite uma das opções abaixo: ");
            System.out.println("1. Iniciar: ");
            System.out.println("2. Configurar: ");
            System.out.println("3. Sair: ");
            int numero = sc.nextInt();
            if(numero == 3){
                sair = true;
                System.out.print("Obrigado! Volte sempre.");
            }
        }
        sc.close();
    }
}