
import java.util.Scanner;
public class VerificadorParOuImpar {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int numero = input.nextInt();
        if(numero % 2 == 0){
            System.out.println("O número é par");
        }else{
            System.out.println("O número é ímpar");

        }


    }


}