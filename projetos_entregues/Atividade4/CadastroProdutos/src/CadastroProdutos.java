import java.util.Scanner;

public class CadastroProdutos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // 1. Declaração do array unidimensional para 5 produtos
        String[] produtos = new String[5];

        // 2. Entrada de dados usando um laço for convencional
        System.out.println("--- Cadastro de Produtos (Janeiro de 2026) ---");
        for (int i = 0; i < produtos.length; i++) {
            System.out.print("Digite o nome do " + (i + 1) + "º produto: ");
            produtos[i] = leitor.nextLine();
        }

        // 3. Exibição dos dados usando o laço foreach
        System.out.println("\n--- Lista de Produtos Cadastrados ---");
        for (String item : produtos) {
            System.out.println("Produto: " + item);
        }

        leitor.close();
    }
}
