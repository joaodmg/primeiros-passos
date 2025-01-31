package POO.Conta;

public class ContaBancaria {

    private String numero;
    private String titular;
    private double saldo;

    public ContaBancaria() {
        saldo = 0.0;
    }
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depóisto de R$" + valor + ". Saldo atual R$" + saldo);
        } else {
            System.out.println("O valor de depósito é inválido.");
        }
    }

    void sacar(double valor) {
        if(valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + ". Saldo atual R$" + saldo);
        } else {
            System.out.println("O valor de saque é inválido.");
        }
    }
}
