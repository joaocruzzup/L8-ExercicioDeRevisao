package org.example.exercicio01;

public class ProdutoServico {
    private ProdutoOperacoes produtoServico;

    public ProdutoServico(ProdutoOperacoes operacoes) {
        this.produtoServico = operacoes;
    }

    public void adicionarProduto(){
        produtoServico.adicionar();
    }

    public void removerProduto(){
        produtoServico.remover();
    }

    public void exibirProduto(){
        produtoServico.exibir();
    }
}
