package POO.Pessoa;

public class TesteDePessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setCpf("11133344455");
        pessoa.setNome("Dani");
        pessoa.setIdade(33);

        System.out.println("PESSOA 1");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("CPF: " + pessoa.getCpf());
        System.out.println("Idade: " + pessoa.getIdade() + "\n");

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setCpf("66677788899");
        pessoa2.setNome("Elias");
        pessoa2.setIdade(27);

        System.out.println("PESSOA 2");
        System.out.println("Nome: " + pessoa2.getNome());
        System.out.println("CPF: " + pessoa2.getCpf());
        System.out.println("Idade: " + pessoa2.getIdade() + "\n");

        pessoa.imprimirDadosDaPessoa(1);
        System.out.println("\n");
        pessoa2.imprimirDadosDaPessoa(2);
        System.out.println("\n");

        Professor professor = new Professor();
        professor.setNome("Eduardo");
        professor.setCpf("11133377700");
        professor.setIdade(50);
        professor.setSalario(10000.0);

        professor.imprimirDadosDaPessoa(3);
        System.out.println("O salário do professor "+ professor.getNome() + " é de R$" + professor.getSalario());
        System.out.println("\n");

        Aluno aluno = new Aluno();
        aluno.setNome("Rodrigo");
        aluno.setCpf("32145678920");
        aluno.setIdade(15);
        aluno.setMatricula("1A2024");

        aluno.imprimirDadosDaPessoa(4);
        System.out.println("A matrícula do aluno " + aluno.getNome() + " é " + aluno.getMatricula());
    }
}
