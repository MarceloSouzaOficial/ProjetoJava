import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Entrada das 4 notas do Aluno
        System.out.print("Digite a primeira nota do Aluno: ");
        double n1 = entrada.nextDouble();

        System.out.print("Digite a segunda nota do Aluno: ");
        double n2 = entrada.nextDouble();

        System.out.print("Digite a terceira nota do Aluno: ");
        double n3 = entrada.nextDouble();

        System.out.print("Digite a quarta nota do Aluno: ");
        double n4 = entrada.nextDouble();

        //Calculo das Médias Aritmética
        double media = (n1 + n2 + n3 + n4) / 4;

        double numero = media ;
        String formatado = String.format("A Média final é: %.2f", media);
        System.out.println(formatado); // Saída: 123.46


        if (media >= 7.0) {
            System.out.println("Aluno Aprovado ");

            } else if (media >= 5.0 && media <= 6.99) {

                System.out.println("Aluno em Exame ");
            } else {
                System.out.println("Aluno Reprovado");

            }

             entrada.close();
        }

    }

