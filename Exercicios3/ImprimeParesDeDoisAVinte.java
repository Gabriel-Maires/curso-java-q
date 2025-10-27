/*
7 3 Faça um programa que imprima os números pares de 2 a 20 inclusive, ou seja, incluindo o 2
e o 20.
*/

public class ImprimeParesDeDoisAVinte {
    public static void main(String[] args) {
        int i = 2;
        while(i <= 20){
            if(i % 2 == 0 || i == 2){
                System.out.print(i);
                System.out.print(" ");
            }
            i++;
        }
    }
}