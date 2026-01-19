import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Instanciando o primeiro objeto
        Veiculo v1 = new Veiculo();
        System.out.println("--- Cadastro do Veículo 1 ---");
        System.out.print("Marca: ");
        v1.setMarca(leitor.nextLine());
        System.out.print("Modelo: ");
        v1.setModelo(leitor.nextLine());
        System.out.print("Ano: ");
        v1.setAno(leitor.nextInt());

        leitor.nextLine(); // Limpar o buffer do teclado

        // Instanciando o segundo objeto
        Veiculo v2 = new Veiculo();
        System.out.println("\n--- Cadastro do Veículo 2 ---");
        System.out.print("Marca: ");
        v2.setMarca(leitor.nextLine());
        System.out.print("Modelo: ");
        v2.setModelo(leitor.nextLine());
        System.out.print("Ano: ");
        v2.setAno(leitor.nextInt());

        // Exibição dos dados coletados
        System.out.println("\n--- Veículos Cadastrados - Ano: 2026 ---");
        v1.exibirInformacoes();
        v2.exibirInformacoes();

        leitor.close();
    }
}