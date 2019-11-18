package EstruturaDeDados;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class UsandoListas {

    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();
        frutas.add("Banana");
        frutas.add("Maça");
        frutas.add("Abacaxi");
        frutas.add("Tomate");
        frutas.add("Figo");
        frutas.add("Morango");

        frutas.addAll(Arrays.asList("Jaca", "Caju"));
        imprimir("Frutas iniciais:", frutas);

        frutas.add("Banana");
        imprimir("Mais frutas", frutas);

        imprimirEstatisticas(frutas);

        frutas.remove("Banana");
        imprimir("Sem uma Banana", frutas);

        frutas.remove(1);
        imprimir("Removendo o segundo", frutas);

        frutas.remove(1);
        imprimir("Removendo o segundo novamente", frutas);

        frutas.add(1, "Jambo");
        imprimir("Adicionando no segundo", frutas);

        frutas.removeAll(Arrays.asList("Figo", "Caju"));
        imprimir("Removendo vários", frutas);

        frutas.removeIf(it -> it.startsWith("J"));
        //frutas.removeIf(it -> it.equals("Banana"));
        imprimir("Removendo 'J'...", frutas);

        System.out.println("Com for indexado");
        for (int i = 0; i < frutas.size(); i++) {
            System.out.println(frutas.get(i));
        }

        separar();
        System.out.println("Com for-each");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        separar();
        System.out.println("Com for-each com lambda");
        frutas.forEach(f -> System.out.println(f));
//        frutas.forEach(f -> {
//            System.out.println(f);
//        });
        //frutas.forEach(System.out::println);
    }

    private static void imprimir(String titulo, List<String> frutas) {
        System.out.println(titulo);
        System.out.println(frutas);
        separar();
    }

    private static void separar() {
        System.out.println("------------------");
    }

    private static void imprimirEstatisticas(List<String> frutas) {
        System.out.println("Primeiro Banana " +
                frutas.indexOf("Banana"));
        System.out.println("Última Banana " +
                frutas.lastIndexOf("Banana"));
        System.out.println("Tamanho " + frutas.size());
    }
    //Método que retorne os nomes das cores que você mais gosta

    //Método que dado uma lista retorne a quantidade de itens

    //Método que receba 3 String, adicione todos em uma lista e remova a segunda posição

    //Método que imprima a lista de cores do primeiro método

    //Método que imprima as cores do primeiro método em ordem alfabética

    //Método que receba uma lista das cores que você mais gosta e o nome de uma cor a ser removida

    //Método que receba a lista de cores que você gosta e imprima em ordem decrescente (alfabética)

    //Método que receba uma lista de números e retorne um mapa com listas de números pares e impares
}