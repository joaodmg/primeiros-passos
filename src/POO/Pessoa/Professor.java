package POO.Pessoa;

public class Professor extends Pessoa{
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    void imprimirDadosDaPessoa(int indice) {
        super.imprimirDadosDaPessoa(indice);
        System.out.println("Você é professor");
    }
}
