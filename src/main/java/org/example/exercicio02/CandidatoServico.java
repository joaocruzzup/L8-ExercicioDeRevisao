package org.example.exercicio02;

public class CandidatoServico{
    private CandidatoOperacoes candidatoOperacoes;

    public CandidatoServico(CandidatoOperacoes candidatoOperacoes) {
        this.candidatoOperacoes = candidatoOperacoes;
    }


    public void adicionarCandidato() {
        candidatoOperacoes.adicionar();
    }

    public void removerCandidato() {
        candidatoOperacoes.remover();
    }

    public void exibirCandidato() {
        candidatoOperacoes.exibir();
    }
}
