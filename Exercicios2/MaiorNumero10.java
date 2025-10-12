// 10
// Pergunte três números.
// Diga qual é o maior entre eles.
// Atenção, utilize a estrutura IF.

package Exercicios2;

import java.util.Scanner;
public class MaiorNumero10 {
    public static void verificaMaiorNumero(Integer numero1, Integer numero2, Integer numero3){
        if(numero1 > numero2 && numero1 > numero3){
            System.out.print("O maior número é: " + numero1 + " ");
        } else if(numero2 > numero1 && numero2 > numero3){
            System.out.print("O maior número é: " + numero2 + " ");
        }else{
            System.out.print("O maior número é: " + numero3 + " ");
        }
        
}
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite o primeiro número: ");
    Integer numero1 = sc.nextInt();
    System.out.print("Digite o segundo número: ");
    Integer numero2 = sc.nextInt();
    System.out.print("Digite o terceiro número: ");
    Integer numero3 = sc.nextInt();
    verificaMaiorNumero(numero1, numero2, numero3);
    }
}
