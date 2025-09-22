/*
(DESAFIO DA SEMANA): Você está montando um cadastro para uma empresa de vendas na internet, e precisa fornecer
este "formulário de dados de clientes". Não se preocupe neste momento
se irá ou não guardar este dado em algum lugar. Pergunte e obtenha os seguintes dados
e depois exiba todos na tela:

Nome Completo
Data de Nascimento
Cidade/País de Origem(Nascimento)
Endereço completo de onde mora
País onde reside
Data do Cadastro
Escolaridade: (Ensino Básico/Ensino Fundamental/Ensino Superior)
*/
import java.util.Scanner;
import java.time.LocalDate;

public class DesafioSemanaJava {
        static Scanner scanner = new Scanner(System.in);
        static String escolaridade;

        public static String verificarEscolaridade() {
        System.out.println("Qual sua escolaridade? 1 - (Ensino Básico) 2 - (Ensino Fundamental) 3 -(Ensino Superior): ");
        String escolaridadeInput = scanner.nextLine();

            if(escolaridadeInput.equals("1")){
                escolaridade = "Ensino Básico";
            } 
            else if(escolaridadeInput.equals("2")){
                escolaridade = "Ensino Fundamental";
            } 
            else if(escolaridadeInput.equals("3")){
                escolaridade = "Ensino Superior";
            } 
            else{
                System.out.println("Digite uma opçao valida: 1 ou 2, ou 3 ");
                return verificarEscolaridade();
            }
        return escolaridade;
    }

    public static void main(String[] args) {

        System.out.println("Olá! Qual seu nome? ");
        String name = scanner.nextLine();
        System.out.println("Sua data de nascimento: ");
        String dataNascimento = scanner.nextLine();
        System.out.println("Qual sua cidade de origem? ");
        String cidadeOrigem = scanner.nextLine();
        System.out.println("Qual seu país de origem? ");
        String paisOrigem = scanner.nextLine();
        System.out.println("Por favor digite seu endereço completo: ");
        String enderecoCompleto = scanner.nextLine();
        System.out.println("Pais de residencia: ");
        String paisResidencia = scanner.nextLine();


        verificarEscolaridade();

        System.out.println("Nome: " + name);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Nome: " + cidadeOrigem);
        System.out.println("País de origem: " + paisOrigem);
        System.out.println("Endereço Completo: " + enderecoCompleto);
        System.out.println("País de Residencia: " + paisResidencia);
        System.out.println("País de Residencia: " + escolaridade);
        LocalDate dataHoraAgora = LocalDate.now();
        System.out.println("Data Cadastro: " + dataHoraAgora);

    }
}
