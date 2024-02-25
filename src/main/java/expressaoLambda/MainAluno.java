package src.main.java.expressaoLambda;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class MainAluno {
    public static void main(String[] args) {

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Rayane", 20));
        alunos.add(new Aluno("Joana", 23));
        alunos.add(new Aluno("Ane", 21));
        alunos.add(new Aluno("Maria", 22));

        //Ordenando alunos por ordem alfabética com expressão lambda / Função anonima
        //Chamamos a classe Comparator com a classe aluno, definimos um nome para essa expressão, no caso abaixo "ordenarAlunos"
        //Depois adicionamos dois parametros que fazem referência a classe Aluno
        //e colocamos a "Arrow function" trazendo como retorno a comparação dos parametros a1 e a2
        Comparator<Aluno> ordenarAlunos = (a1, a2) -> {
            return a1.toString().toUpperCase().compareTo(a2.toString().toUpperCase());
        };
        alunos.sort(ordenarAlunos);
        System.out.println("Ordenando Alunos por ordem alfabética:::");
        for (Aluno a : alunos){
            System.out.println(a);
        }

        //Ordenando alunos por idade com expressão lambda / Função anonima
        Comparator<Aluno> ordenarAlunosPorIdade = (a1, a2) -> {
            return a1.getIdade().compareTo(a2.getIdade());
        };

        System.out.println("\nOrdenando Alunos em ordem crescente por idade:::");
        alunos.sort(ordenarAlunosPorIdade);

        for (Aluno a : alunos){
            System.out.println(a);
        }

    }


}
