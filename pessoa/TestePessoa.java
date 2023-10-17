package pessoa;

public class TestePessoa {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa();

        pessoa.nome = "Uítalo";
        pessoa.idade = 32;
        pessoa.cpf = "33333333311";

        pessoa.imprimirDados();
    }
}
