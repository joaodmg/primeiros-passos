package Fundamentos;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Victor");
        nomes.add("Monica");
        nomes.add("Gabriel");

        System.out.println(nomes.get(0));
    }
}
