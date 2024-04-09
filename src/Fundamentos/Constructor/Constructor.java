package Fundamentos.Constructor;

public class Constructor {

    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Constructor(int numero, String texto) {
        this.numero = numero;
    }

    public Constructor(int numero){
        this.numero = numero;
    }
}
