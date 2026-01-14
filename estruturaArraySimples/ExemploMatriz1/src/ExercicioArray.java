import java.util.Scanner;

public class ExercicioArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Aluno alunos[] = new Aluno[2]; //Declara que o Aluno vai armazenar 4 elementos do tipo alunos.



        //Instânciando a primeira pessoa
        alunos[0] = new Aluno(); // Cria instância para ocorrência 0.
        alunos[0].nome = "Pedro";
        alunos[0].idade = 13;
        alunos[0].materia = "historia";
        alunos[0].nota = 7.1;

        //Instânciando a segunda pessoa
        alunos[1] = new Aluno(); // Cria instância para ocorrência 1.
        alunos[1].nome = "João";
        alunos[1].idade = 14;
        alunos[1].materia = "Matemática";
        alunos[1].nota = 7.8;

        //Impressão de dados

        //Pessoa posição 0
        System.out.println("Mostrando os dados da matriz pessoa posição 0");
        System.out.println("O nome do Aluno é: " + alunos[0].nome);
        System.out.println("A idade do Aluno é :" + alunos[0].idade);
        System.out.println("A Matéria  é: " + alunos[0].materia);
        System.out.println("O nota do Aluno é: " + alunos[0].nota);

        //Pessoa posição 1
        System.out.println("O nome do Aluno é: " + alunos[1].nome);
        System.out.println("A idade do Aluno é :" + alunos[1].idade);
        System.out.println("A Matéria do Aluno é: " + alunos[1].materia);
        System.out.println("O nota do Aluno é: " + alunos[1].nota);

    }


}

