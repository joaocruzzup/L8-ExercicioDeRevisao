package org.example.exercicio03;


public class PratoServico {

    private PratoOperacoes pratoServicos;

    public PratoServico(PratoOperacoes operacoes) {
        this.pratoServicos = operacoes;
    }

    public void adicionarPrato(){
        pratoServicos.adicionar();
    }

    public void removerPrato(){
        pratoServicos.remover();
    }

    public void exibirPrato(){
        pratoServicos.exibir();
    }
}
