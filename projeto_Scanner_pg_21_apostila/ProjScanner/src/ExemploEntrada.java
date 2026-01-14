import java.util.Scanner;

public class ExemploEntrada {

    public static void main(String[] args) {

        //1 - Declaração de variáveis
        char sexo;//Tipo char armazena apenas um CARACTER
        float salario;
        int idade;
        String nome;

        //2 - Entrada de dados
        Scanner leia;//declara a variável leia para ser utilizada na classe Scanner

        leia = new Scanner(System.in); //Inicializando a variável LEIA para ser utilizada pelo Scanner

        System.out.println("Digite o nome"); //Mostrando mensagem para que tipo de informação deve ser informado

        nome = leia.nextLine();

        System.out.println("Digite a idade");

        idade = leia.nextInt();

        System.out.println("Digite o Salário");

        salario = leia.nextFloat(); // Recebe o valor do Salário

        System.out.println("Digite o sexo ");

        sexo = leia.next().charAt(0); // Recebe o valor digitado e armazena na vas SEXO

        //3 - Saída de dados

        System.out.println("O nome digitado foi " + nome);
        System.out.println("O Salário digitado foi " + salario);
        System.out.println("O idade digitado foi " + idade);
        System.out.println("O sexo digitado foi " + sexo);


    }
}
