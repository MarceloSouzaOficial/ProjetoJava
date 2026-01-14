import java.util.Scanner;

public class Pancadao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x;
        System.out.println(" Digite a sua idade: ");
        x = Integer.parseInt(entrada.nextLine());

        //Verificando se a idade é maior que 17
        if (x > 18) {
            System.out.println(" Você pode entrar ");
        } else {
            System.out.println(" Você não pode entrar ");


        }

    }

}