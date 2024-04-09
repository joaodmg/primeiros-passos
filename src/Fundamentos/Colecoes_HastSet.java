package Fundamentos;

import java.util.HashSet;
import java.util.Set;

public class Colecoes_HastSet {
    public static void main(String[] args) {
        // A diferença do HashSet pro HashMap, é que
        // O HashSet é uma coleção de elemntos únicos
        // No HashMap temos o conceito de chave e valor, com a chave sendo única
        // No HashSet vamos ter somente o valor, não vamos passar chave

        Set<Integer> numeros = new HashSet<>();
        numeros.add(10);
        numeros.add(11);
        numeros.add(12);
        numeros.add(13);
        // numeros.add(13); -> Não da pra adicionar valores duplicdos, ele vai igorar

        System.out.println("Tamanho do SET: " + numeros.size());

        System.out.println("\nCOLEÇÃO DE ELEMENTOS");
        for (Integer elemento : numeros) {
            System.out.println(elemento);
        }

        numeros.remove(12);
        System.out.println("\nCOLEÇÃO DE ELEMENTOS COM REMOVE 12");
        for (Integer elemento : numeros) {
            System.out.println(elemento);
        }

        System.out.println("\nPossui o número 10 na lista? " + numeros.contains(10));
        System.out.println("Possui o número 12 na lista? " + numeros.contains(12));

        // Se precisar de ordenação usar o List ao invés do HashSet, visto que o HashSet não vai ordenar, logo não da pra pegar o
        // get(2), logo 3 item da listagem

    }
}
