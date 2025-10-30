package Exercicios3Parte2;

// DESAFIO: Validação de Senha Simples: Peça ao usuário para digitar uma senha. Continue pedindo a senha até que ele digite "secreta123".

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        boolean senhaCorreta = false;
        Scanner sc = new Scanner(System.in);
        int count = 2;
        while(senhaCorreta != true){
        System.out.print(" Digite sua senha: ");
        String senhaInserida = sc.next();

        if(senhaInserida.equals( "secreta123")){
            senhaCorreta = true;
            System.out.print("Senha validada. Bem vindo ao sistema! ");
        }else if(count > 0){
            System.out.print("Senha incorreta. Você possui mais " + count + " tentativa(s) restantes.");
            count -= 1;
        }else if(count == 0){
            System.out.print("Acesso bloqueado. Tente novamente mais tarde.");
            break;
        }
    }
    sc.close();
}
}