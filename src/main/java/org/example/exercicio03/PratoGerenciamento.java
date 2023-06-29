package org.example.exercicio03;


import java.util.*;

public class PratoGerenciamento implements PratoOperacoes{

    Scanner sc = new Scanner(System.in);

    Map<String, List<String>> mapPratos = new HashMap<>();

    PratoValidador pratoValidador = new PratoValidador();

    @Override
    public void adicionar() {
        Prato prato = new Prato();
        System.out.println("Digite o nome do produto: ");
        prato.setNome(sc.nextLine());
        pratoValidador.validarChave(mapPratos, prato);
        pratoValidador.validarNome(prato);

        System.out.println("Digite os ingredientes separados por vírgula: ");
        String ingredientes = sc.nextLine();
        prato.setIngredientes(separarString(ingredientes));
        pratoValidador.validarIngredientes(prato);
        mapPratos.put(prato.getNome(), prato.getIngredientes());
    }

    @Override
    public void remover() {
        System.out.println("Digite o nome do produto: ");
        String nome = sc.nextLine();
        List<String> listaChaves = new ArrayList<>(mapPratos.keySet());
        String chaveARemover = "";
        for (int i = 0; i < listaChaves.size(); i++) {
            String chave = listaChaves.get(i);
            if (chave.equalsIgnoreCase(nome)) {
                chaveARemover = chave;
            }
        }
        mapPratos.remove(chaveARemover);
    }

    @Override
    public void exibir() {
        pratoValidador.validarMap(mapPratos);
        int i = 1;
        for (String chave: mapPratos.keySet()) {
            System.out.println("Produto " + i +  ": [ Nome: " + chave + " | Ingredientes: " + mapPratos.get(chave) + " ]");
        }
    }

    public static List<String> separarString(String string){
        String[] arrayString = string.split(",");
        List<String> listaString = new ArrayList<>();

        for (String s:arrayString) {
            listaString.add(s.trim());
        }
        return listaString;
    }
}
