package POO.Conta;

import POO.Conta.ContaBancaria;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria contaBancaria1 = new ContaBancaria();
        contaBancaria1.setNumero("1234");
        contaBancaria1.setTitular("Jose");

        contaBancaria1.depositar(50);
        contaBancaria1.sacar(100);
    }
}
