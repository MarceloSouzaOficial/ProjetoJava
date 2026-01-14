import java.util.Scanner;

public class CodigoCategoria {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int x;
        System.out.println("Digite um valor de Código de 1 a 5");
        x = Integer.parseInt(entrada.nextLine());

        switch (x) {
            case 1:
                System.out.println("Corredor A e Categoria Alimentos Perrecíveis");
                break;
            case 2:
                System.out.println("Corredor B e Categoria Limpeza");
                break;
            case 3:
                System.out.println("Corredor C e Categoria Eletrônico");
                break;
            case 4:
                System.out.println("Corredor D e Categoria Vestuário");
                break;
            case 5:
                System.out.println("Corredor E e Categoria Móveis");
            default:
                System.out.println("Categoria Desconhecida Entrada de triagem");
                break;
        }
    }
}
