package Fundamentos;

public class Excecoes_Checked {
    // Checked Exceptions -> São exceções em que o compilador do Java vai exigir que você trate as exceções, exceçôes que conseguimos prever

    // Unchecked Exceptions -> São exceções que não temos o controle sobre elas, não tratadas no código

    public static void main(String[] args) {
        try {
            validarNumero();
        } catch (Exception e) {
            System.err.println("Deu ruim");
            e.printStackTrace();
        }
    }

    public static void validarNumero() throws Exception{
        int numero = 10;
        if(numero < 100){
            throw new Exception("O número é menor do que 100");
        }
    }
}
