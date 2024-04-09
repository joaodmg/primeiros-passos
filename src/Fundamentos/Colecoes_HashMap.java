package Fundamentos;

import java.util.HashMap;
import java.util.Map;

public class Colecoes_HashMap {
    public static void main(String[] args) {
        // O MAP permite adicionar chave e valor dentro da nossa estrutura
        // Devemos informar o tipo da chave e o tipo do valor
        Map<String, Integer> notas = new HashMap<>();
        notas.put("Dani", 9);
        notas.put("Vini", 10);
        notas.put("Elias", 10);

        var nota = notas.get("Dani"); // Integer nota = notas.get("Dani") vai ser a mesma coisa nesse cenário
        System.out.println("var nota: " + nota);
        System.out.println("\n");

        for (Map.Entry<String, Integer> entry: notas.entrySet()){
            //notas.entrySet() retorna um conjunto de todas as entradas (pares chave-valor) no HashMap chamado notas
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("A chave é " + key + " e o valor é " + value);
        }
    }
}
