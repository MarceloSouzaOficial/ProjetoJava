public class Cadastro {
    public static void main(String[] args) {

        Pessoa pessoas[] = new Pessoa[2]; //Declara que a pessoa vai armazenar 2 elementos do tipo pessoas.

        //Instânciando a primeira pessoa
        pessoas[0] = new Pessoa(); // Cria instância para ocorrência 0.
        pessoas[0].altura = 1.68;
        pessoas[0].peso = 55;

        //Instânciando a segunda pessoa
        pessoas[1] = new Pessoa(); //Cria instância para ocorrência 1.
        pessoas[1].altura = 1.77;
        pessoas[1].peso = 60;

        //Impressão de dados

        //Pessoa posição 0
        System.out.println("Mostrando os dados da matriz pessoa posição 0");
        System.out.println("Sua Altura é: " + pessoas[0].altura);
        System.out.println("Seu peso em kg é :" + pessoas[0].peso);

        //Pessoa posição 1
        System.out.println("Mostrando os dados da matriz pessoa posição 1");
        System.out.println("Sua Altura é: " + pessoas[1].altura);
        System.out.println("Seu peso em kg é :" + pessoas[1].peso);



    }
}
