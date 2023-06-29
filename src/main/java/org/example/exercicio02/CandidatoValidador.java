package org.example.exercicio02;

import java.util.Map;
import java.util.Scanner;

public class CandidatoValidador {

    Scanner sc = new Scanner(System.in);

    public void validarMap(Map<String, Double> map){
        if (map.size() == 0){
            System.out.println("Não há produtos na lista de candidatos ainda");
        }
    }

    public void validarChave(Map<String, Double> map, Candidato candidato){
        if (map.containsKey(candidato.getMatricula())){
            System.out.println("Erro! Já há esse candidato cadastrado!");
            System.out.println("Digite um novo candidato: ");
            String matricula = sc.nextLine();
            candidato.setMatricula(matricula);
        }
    }

    public void validarMatricula(Candidato candidato){
        if (candidato.getMatricula() == null || candidato.getMatricula().isEmpty()){
            System.out.println("Erro! Não há nome do candidato!");
            System.out.println("Digite um novo candidato: ");
            String matricula = sc.nextLine();
            candidato.setMatricula(matricula);
        }
    }

    public void validarNota(Candidato candidato){
        if (candidato.getNota() <= 0.0){
            System.out.println("Erro! Nota inválido!");
            System.out.println("Digite uma nova nota: ");
            int nota = sc.nextInt();
            candidato.setNota(nota);
        }
    }
}
