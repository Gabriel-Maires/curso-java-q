package Exercicios2;
// 6 Pergunte a idade de uma pessoa. Diga se essa pessoa é uma criança (até 12 anos), um
// adolescente (13 a 17 anos), uma adulta (18 a 59 anos) ou idosa (60 anos ou mais)

import java.util.Scanner;



public class VerificaIdade06 {

    public static void verificaIdadePessoa(Integer idade){

        if(idade <= 12){
            System.out.print("Você é uma criança! ");
        } else if(idade > 13 && idade <= 17){
            System.out.print("Você é adolescente! ");
        }else if(idade >= 18 && idade <= 59){
            System.out.print("Você é adulto! Vai trabalhar! ");
        }else{
            System.out.print("Você é idoso! Pode aderir à aposentadoria. ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual sua idade? ");
        Integer idade = sc.nextInt();
        verificaIdadePessoa(idade);
    }
}
