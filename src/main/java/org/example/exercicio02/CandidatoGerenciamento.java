package org.example.exercicio02;

import java.util.*;

public class CandidatoGerenciamento implements CandidatoOperacoes{
    Scanner sc = new Scanner(System.in);

    Map<String, Double> mapCandidatos = new HashMap<>();

    CandidatoValidador candidatoValidador = new CandidatoValidador();

    @Override
    public void adicionar() {
        Candidato candidato = new Candidato();
        System.out.println("Digite a matrícula do candidato: ");
        candidato.setMatricula(sc.nextLine());
        candidatoValidador.validarChave(mapCandidatos, candidato);
        candidatoValidador.validarMatricula(candidato);

        System.out.println("Digite a nota do candidato: ");
        candidato.setNota(sc.nextDouble());
        candidatoValidador.validarNota(candidato);
        sc.nextLine();
        mapCandidatos.put(candidato.getMatricula(), candidato.getNota());
    }

    @Override
    public void remover() {
        System.out.println("Digite a matrícula do candidato: ");
        String nome = sc.nextLine();
        List<String> listaChaves = new ArrayList<>(mapCandidatos.keySet());
        String chaveARemover = "";
        for (int i = 0; i < listaChaves.size(); i++) {
            String chave = listaChaves.get(i);
            if (chave.equalsIgnoreCase(nome)) {
                chaveARemover = chave;
            }
        }
        mapCandidatos.remove(chaveARemover);
    }

    @Override
    public void exibir() {
        candidatoValidador.validarMap(mapCandidatos);
        int i = 1;
        for (String chave: mapCandidatos.keySet()) {
            System.out.println("Candidato " + i +  ": [ Nome: " + chave + " | Nota: " + mapCandidatos.get(chave) + " ]");
        }
    }
}
