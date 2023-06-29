package org.example.exercicio01;

import java.util.*;

public class ProdutoGerenciamento implements ProdutoOperacoes {

    Scanner sc = new Scanner(System.in);

    Map<String, Double> mapProdutos = new HashMap<>();

    ProdutoValidador produtoValidator = new ProdutoValidador();

    @Override
    public void adicionar() {
        Produto produto = new Produto();
        System.out.println("Digite o nome do produto: ");
        produto.setNome(sc.nextLine());
        produtoValidator.validarChave(mapProdutos, produto);
        produtoValidator.validarNome(produto);

        System.out.println("Digite o preço do produto: ");
        produto.setPreco(sc.nextDouble());
        produtoValidator.validarPreco(produto);
        sc.nextLine();
        mapProdutos.put(produto.getNome(), produto.getPreco());
    }

    @Override
    public void remover() {
        System.out.println("Digite o nome do produto: ");
        String nome = sc.nextLine();
        List<String> listaChaves = new ArrayList<>(mapProdutos.keySet());
        String chaveARemover = "";
        for (int i = 0; i < listaChaves.size(); i++) {
            String chave = listaChaves.get(i);
            if (chave.equalsIgnoreCase(nome)) {
                chaveARemover = chave;
            }
        }
        mapProdutos.remove(chaveARemover);
    }

    @Override
    public void exibir() {
        produtoValidator.validarMap(mapProdutos);
        int i = 1;
        for (String chave: mapProdutos.keySet()) {
            System.out.println("Produto " + i +  ": [ Nome: " + chave + " | Preço: " + mapProdutos.get(chave) + " ]");
        }
    }
}
