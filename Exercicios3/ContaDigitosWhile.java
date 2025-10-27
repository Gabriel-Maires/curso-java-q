/*
11 3
Pergunte um número.
Conte quantos dígitos ele tem.
Atenção, utilize um loop WHILE.
*/

import java.util.Scanner;

public class ContaDigitosWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número a ser contado: ");
        int numero = sc.nextInt();
        int i = 1;

        while(i < numero){
            numero /= 10;
            if(numero != 0){
                i++;
            }
        }
        System.out.print("Resultado: " + i);
        sc.close();
    }

}