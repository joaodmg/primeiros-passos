package POO.Pessoa;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    void imprimirDadosDaPessoa(int indice) {
        System.out.println("O nome da pessoa é: " + nome);
        System.out.println("A idade da pessoa é: " + idade);
        System.out.println("O CPF da pessoa é: " + cpf);
        System.out.println("O indice da pessoa é: " + indice);
    }
}
