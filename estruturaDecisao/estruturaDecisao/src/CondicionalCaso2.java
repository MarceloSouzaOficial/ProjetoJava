import java.util.Scanner;

public class CondicionalCaso2 {
   public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int Saldo = 500; //Saldo inicial
        int VerSaldo = 1, DepSaldo = 2, SaqDinheiro = 3;

        System.out.println("--- CAIXA ELETRÔNICO ---");
        System.out.println("Digite 1 para Ver Saldo" );
        System.out.println("Digite 2 para Sacar Dinheiro" );
        System.out.println("Digite 3 para Depositar Dinheiro" );
        System.out.print("Escolha uma opção: ");

        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("O seu Saldo é: " + Saldo);
                break;
            case 2:
                System.out.println("Digite o valor para Saque");
                if (Saldo >= 0)
                    System.out.println("Não é possivél sacar dinheiro, deposite dinheiro");
                else 
                break;
            case 3:
                System.out.println("Corredor C e Categoria Eletrônico");
               break;

       }
   }
}
