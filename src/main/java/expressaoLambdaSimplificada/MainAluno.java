package src.main.java.expressaoLambdaSimplificada;


import src.main.java.expressaoLambda.Aluno;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainAluno {
    public static void main(String[] args) {

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Rayane", 20));
        alunos.add(new Aluno("Joana", 23));
        alunos.add(new Aluno("Ane", 21));
        alunos.add(new Aluno("Maria", 22));

        //Como temos apenas uma linha dentro da função anonima abaixo, podemos reduzir ela
        //Deixando da seguinte forma:
        Comparator<Aluno> ordenarAlunos = (a1, a2) ->
            a1.toString().toUpperCase().compareTo(a2.toString().toUpperCase());

        alunos.sort(ordenarAlunos);
        System.out.println("Ordenando Alunos por ordem alfabética:::");
        for (Aluno a : alunos){
            System.out.println(a);
        }

        //Ordenando alunos por idade com Expressão lambda / Função anônima ainda mais simplificada
        alunos.sort((a1, a2) ->
                a1.getIdade().compareTo(a2.getIdade()));

        System.out.println("\nOrdenando Alunos em ordem crescente por idade:::");

        for (Aluno a : alunos){
            System.out.println(a);
        }

    }


}
