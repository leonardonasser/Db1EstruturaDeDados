package EstruturaDeDados;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import javax.crypto.spec.PSource;
import java.util.*;

public class MétodosResolvidos{

    public static void  main(String[] args) {
        List<String> cores = new ArrayList<>();
        cores.addAll(Arrays.asList("Vermelho", "Azul", "Preto", "Cinza"));


//1- Método que retorne os nomes das cores que você mais gosta
        imprimir("Método 1 - Mostrar Cores:", cores);
        separar();
//============================================================

        System.out.println();

//2- Método que dado uma lista retorne a quantidade de itens
        Integer QuantidadeDePalavras = RetornaQuantidadeDeItens("Método 2 - Contar todas as palavras", cores);
        System.out.println("Tem " + QuantidadeDePalavras + " palavras");
        separar();
//============================================================

        System.out.println();

//3- Método que receba 3 String, adicione todos em uma lista e remova a segunda posição
        Metodo3AdicionarERemover("Método 3 - Adicionar Strings e depois remover a segunda posição", cores);
        separar();
//============================================================

        System.out.println();

//4- Método que imprima a lista de cores do primeiro método
        ImprimirListaPrimeiroDoMetodo("Método 4 - Imprimir lista do primeiro Metodo:", cores);
        separar();
//=========================================================

        System.out.println();

//5- Método que imprima as cores do primeiro método em ordem alfabética
        ImprimirEmOrdemAlfabética("Método 5 - Imprimir em ordem alfabética", cores);
        separar();
//=========================================================

        System.out.println();

//6- Método que receba uma lista das cores que você mais gosta e o nome de uma cor a ser removida
        ListaDeCoresEUmaSendoRemovida("Método 6 - Lista de cores e uma sendo removida", cores);
        separar();

//==========================================================
        System.out.println();

//7- Método que receba a lista de cores que você gosta e imprima em ordem decrescente (alfabética)
        ImprimirEmOrdemAlfabéticaDecrescente("Método 7 - Imprimir em ordem alfabética decrescente", cores);
        separar();
//===========================================================

        System.out.println();

//8- Método que receba uma lista de números e retorne um mapa com listas de números pares e impares
        Map<Integer,String> MapaParImpar = new LinkedHashMap<>();
        List<Integer> numeros = new ArrayList<>();
        numeros.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9,10));
        MapaParImpar=RetornaUmMapaComListasDeNúmerosParesEImpares("Método 8 - Receba uma Lista de números e retorne um mapa com listas de números pares e impares", numeros, MapaParImpar);
        for(Map.Entry<Integer, String> entry : MapaParImpar.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        separar();

//==============================================================


    }



    //==============================================METODOS=======================================================//

    //Esse procedimento serve para separar
    private static void separar(){
        System.out.println("------------------------------");
    }


    //1- Método que retorne os nomes das cores que você mais gosta
    private static void imprimir(String titulo, List<String> cores) {
        System.out.println(titulo);
        System.out.println(cores);
    }
//============================================================

    //2- Método que dado uma lista retorne a quantidade de itens
    private static Integer RetornaQuantidadeDeItens(String titulo, List<String> cores){
        System.out.println(titulo);
        int contarpalavras=0;
        contarpalavras=cores.size();
        return contarpalavras;
    }
//==========================================================

    //3- Método que receba 3 String, adicione todos em uma lista e remova a segunda posição
    private  static void Metodo3AdicionarERemover(String titulo, List<String> cores){
        System.out.print(titulo);
        cores.addAll(Arrays.asList("Marrom","Rosa","Verde"));
        cores.remove(1);
        imprimir(" ",cores);
    }
//==========================================================


    //4- Método que imprima a lista de cores do primeiro método
    private static void ImprimirListaPrimeiroDoMetodo(String titulo, List<String> cores){
        System.out.println(titulo);
        cores.removeAll(Arrays.asList("Vermelho","Preto","Cinza", "Marrom", "Rosa", "Verde", "Azul"));
        cores.addAll(Arrays.asList("Vermelho", "Azul", "Preto", "Cinza"));
        System.out.println(cores);
    }
//==========================================================


    //5- Método que imprima as cores do primeiro método em ordem alfabética
    private static void ImprimirEmOrdemAlfabética(String Titulo, List <String> cores) {
        System.out.println(Titulo);
        Collections.sort(cores);
        System.out.println(cores);
    }
//======================================================================

    //6- Método que receba uma lista das cores que você mais gosta e o nome de uma cor a ser removida
    private static void ListaDeCoresEUmaSendoRemovida(String Titulo, List<String> cores){
        System.out.println(Titulo);
        System.out.println("Cores que mais gosto:     "+cores);
        cores.remove("Cinza");
        System.out.println("Com a cor cinza removida: "+cores);
    }
//======================================================================

    //7- Método que receba a lista de cores que você gosta e imprima em ordem decrescente (alfabética)
    private static void ImprimirEmOrdemAlfabéticaDecrescente(String Titulo, List<String> cores){
        System.out.println(Titulo);
        Collections.reverse(cores);
        System.out.println(cores);
    }
//======================================================================

    //8- Método que receba uma lista de números e retorne um mapa com listas de números pares e impares
    private static Map<Integer, String> RetornaUmMapaComListasDeNúmerosParesEImpares (String Titulo, List<Integer> numeros, Map<Integer, String> MapaParImpar) {
        System.out.println(Titulo);
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) % 2 == 0) {
                MapaParImpar.put(numeros.get(i),"Par");
            } else {
                MapaParImpar.put(numeros.get(i),"Impar");
            }
        }

        return MapaParImpar;
    }
//======================================================================


}
