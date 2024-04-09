package Fundamentos;

import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados_List_And_ArrayList {
    public static void main(String[] args) {
        // Lista
        List<String> nomes = new ArrayList<>();
        nomes.add("Dani");
        nomes.add("Vini");
        nomes.add("Elias");

        System.out.println("Lista de Nomes: " + nomes);
        System.out.println("Posição 0 do array: " + nomes.get(0));
        System.out.println("Posição 1 do array: " + nomes.get(1));
        System.out.println("Posição 2 do array: " + nomes.get(2));
        System.out.println("\n");

        /*
        *Ele vai percorrer a minha lista "nomes" e pra cada elemento do meu index (nesse caso sera nomes)
        * Ele vai trazer pra mim o "nome"
        */
        for (String nome : nomes) {
            System.out.println("O nome no FOR é: " + nome);
        }

        System.out.println("\n");

        // A partir do Java 8 pode fazer assim:
        nomes.forEach(nome -> System.out.println("O nome no forEach é: " + nome));
    }
}
