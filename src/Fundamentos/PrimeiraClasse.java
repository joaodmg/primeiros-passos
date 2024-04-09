package Fundamentos;

/*
* public = Tipo de acesso a classe
* class = Tipo da classe
* Fundamentos.PrimeiraClasse = Nome da minha classe
*/
public class PrimeiraClasse {

    // Todo conteúdo deverá ser inserido aqui dentro
    public static void main(String[] args) {
        /*
        * public = Pode ser acessado de qualquer lugar do programa, se trata de um tipo de acesso
        * static = Método main pertence a essa classe
        * void = Tipo de retorno que meu método vai ter, no caso do void, não retorna nenhum valor, apenas executa o que está dentro do método]
        * main = nome do método, o main se trata do ponto inicial do nosso programa
        */
        /*
        * Números (int, double, float, long)
        * Texto (String)
        * Booleanos (boolean)
        */
        int dadoDoTipoInt = 10;
        double dadoDoTipoDouble = 3.14;
        float dadoDoTipoFloat = 3.14f;
        long dadoDoTipoLong = 9494464646L;
        String dadoDoTipoString = "Meu texto";
        boolean dadoDoTipoBoolean = false;

        System.out.println("Minha primeira classe\n");
        System.out.println("Valor de dadoDoTipoInt: " + dadoDoTipoInt);
        System.out.println("Valor de dadoDoTipoDouble: " + dadoDoTipoDouble);
        System.out.println("Valor de dadoDoTipoFloat: " + dadoDoTipoFloat);
        System.out.println("Valor de dadoDoTipoLong: " + dadoDoTipoLong);
        System.out.println("Valor de dadoDoTipoString: " + dadoDoTipoString);
        System.out.println("Valor de dadoDoTipoBoolean: " + dadoDoTipoBoolean);

        // if - else (se - se não)
        if(dadoDoTipoInt == 11) {
            System.out.println("\nEntrou dentro do IF");
        } else if(dadoDoTipoInt == 12) {
            System.out.println("\nEntrou dentro do ELSE IF");
        } else {
            System.out.println("\nEntrou dentro do ELSE");
        }

        // while (enquanto algo for verdadeiro, faça alguma coisa)
        int valorInicial = 0;
        while (valorInicial < 3) {
            System.out.println("O valor inicial é menor que 3.");
            System.out.println("Valor Inicial: " + valorInicial);
            valorInicial++;
        }

        //Java é linguagem síncrona,ele só vai pra próxima linha se a primeira tiver sido executada com sucesso
        System.out.println("Saiu do while\n");

        System.out.println("Iniciando o FOR");
        for (int i = 0; i < 4; i++) {
            System.out.println("O valor de i é: "+ i);
        }
        System.out.println("Finalizando o FOR");
    }
}
// Fora do escopo da classe
