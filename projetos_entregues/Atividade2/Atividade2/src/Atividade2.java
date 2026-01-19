import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //O Usuário digita o número inteiro para gerar a tabuada
        System.out.println("Digite um número inteiro :");
        int numero = leitor.nextInt();

        System.out.println("----------- Tabuada de número : " + numero + ":-------------");
        System.out.println("-----------------------------------------------");

        //Estrutura de Laço de repetição
        for (int i = 1; i <= 10; i++){
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        System.out.println("---------------------------------------------");

        leitor.close();

    }
}
