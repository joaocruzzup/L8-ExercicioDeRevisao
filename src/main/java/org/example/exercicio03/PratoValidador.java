package org.example.exercicio03;


import java.util.List;
import java.util.Map;
import java.util.Scanner;

import static org.example.exercicio03.PratoGerenciamento.separarString;

public class PratoValidador {
    Scanner sc = new Scanner(System.in);

    public void validarMap(Map<String, List<String>> map){
        if (map.size() == 0){
            System.out.println("Não há produtos na lista de produtos ainda");
        }
    }

    public void validarChave(Map<String, List<String>> map, Prato prato){
        if (map.containsKey(prato.getNome())){
            System.out.println("Erro! Já há esse produto cadastrado!");
            System.out.println("Digite um novo produto: ");
            String nome = sc.nextLine();
            prato.setNome(nome);
        }
    }

    public void validarNome(Prato prato){
        if (prato.getNome() == null || prato.getNome().isEmpty()){
            System.out.println("Erro! Não há nome do produto!");
            System.out.println("Digite um novo produto: ");
            String nome = sc.nextLine();
            prato.setNome(nome);
        }
    }

    public void validarIngredientes(Prato prato){
        if (prato.getIngredientes().size() == 0){
            System.out.println("Erro! Não há ingredientes");
            System.out.println("Digite os ingredientes separados por vírgula: ");
            String ingredientes = sc.nextLine();
            prato.setIngredientes(separarString(ingredientes));
        }
    }
}
