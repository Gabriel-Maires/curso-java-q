/*
16 3 (DESAFIO DA SEMANA 3)
Implemente um programa que cadastre produtos com Nome, Fabricante e Preço.
Após cada cadastro, pergunte se deseja continuar.
Ao final, o programa deve exibir todos os produtos cadastrados e destacar o produto mais
caro.
Objetivos didáticos:
- Uso de loops com controle por resposta
- Comparação de valores dentro do loop
- Identificação de máximo valor
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DesafioCadastroProdutoMaisCaro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean parar = false;
        List<String> produtos = new ArrayList<>();
        Map<String, String> produto1 = new HashMap<>();

        while(parar != true){
            System.out.println("Seja bem vindo ao programa! ");
            System.out.println("Para começar, digite o nome do produto: ");
            String nomeProduto = sc.nextLine();
            System.out.println("Digite o fabricante do produto: ");
            String fabricanteProduto = sc.nextLine();
            System.out.println("Por fim, digite o preço do produto: ");
            Double precoProduto = sc.nextDouble();

            produtos.add(nomeProduto);
            produtos.add(fabricanteProduto);
            produtos.add(precoProduto);

            System.out.println("Produto cadastrado com sucesso! Gostaria de continuar? (1 - Sim | 2 - Não) ");
            int respostaCliente = sc.nextInt();
            
            if(respostaCliente == 1){
                parar = true;
            }else{
                parar = false;
            }
        }

    }
}