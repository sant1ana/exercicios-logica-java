import java.util.Scanner;

public class CadastroSimplesDeUsuario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.print("Digite seu sexo ( M/F) : ");
        String sexo = input.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();


        if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F")) {
            if (idade > 0) {
                System.out.print("Cadastro confirmado com sucesso");
            } else {
                System.out.print("Erro no cadastro por favor tente novamente");


            }

        }


    }
}