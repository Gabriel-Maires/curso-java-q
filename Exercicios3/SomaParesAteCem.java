/*
4 3 Faça um programa que some de 0 a 100 os números pares, e exiba o resultado.
*/

public class SomaParesAteCem {
    public static void main(String[] args) {
        for(int i = 0; i <= 100; i++){
            if(i % 2 == 0){
                System.out.print(i+i);
                System.out.print(" ");
            }
        } 
    }
}