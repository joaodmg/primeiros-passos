package POO.Pessoa;

public class Aluno extends Pessoa {
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    void imprimirDadosDaPessoa(int indice) {
        super.imprimirDadosDaPessoa(indice);
        System.out.println("Você é aluno");
    }
}
