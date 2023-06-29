package org.example.exercicio01;

import java.util.Map;
import java.util.Scanner;

public class ProdutoValidador {

    Scanner sc = new Scanner(System.in);

    public void validarMap(Map<String, Double> map){
        if (map.size() == 0){
            System.out.println("Não há produtos na lista de produtos ainda");
        }
    }

    public void validarChave(Map<String, Double> map, Produto produto){
        if (map.containsKey(produto.getNome())){
            System.out.println("Erro! Já há esse produto cadastrado!");
            System.out.println("Digite um novo produto: ");
            String nome = sc.nextLine();
            produto.setNome(nome);
        }
    }

    public void validarNome(Produto produto){
        if (produto.getNome() == null || produto.getNome().isEmpty()){
            System.out.println("Erro! Não há nome do produto!");
            System.out.println("Digite um novo produto: ");
            String nome = sc.nextLine();
            produto.setNome(nome);
        }
    }

    public void validarPreco(Produto produto){
        if (produto.getPreco() <= 0.0){
            System.out.println("Erro! Preço inválido!");
            System.out.println("Digite um novo preço: ");
            int preco = sc.nextInt();
            produto.setPreco(preco);
        }
    }

}
