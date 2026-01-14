import java.util.Scanner;

public class CondicionalSE {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x;
        System.out.println("Digite um valor inteiro");
        x = Integer.parseInt(entrada.nextLine());

        //Verificando se o valor é maior que 0
        if (x>0) {
            System.out.println("O número é Positivo");
        } else {
            System.out.println("O número é Palmeiras");


        }
    }



}
