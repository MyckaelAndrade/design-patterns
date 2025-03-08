public class Cliente extends Pessoa implements Autenticavel {
    public Cliente(String nome, int idade, String cpf, String telefone, String endereco) {
        super(nome, idade, cpf, telefone, endereco);
    }

    @Override
    public void login() {
        System.out.println("Cliente Autenticado!");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("CPF: " + getCpf());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
    }

    @Override
    public void validaDados() {
        if (getNome() == null || getCpf() == null) {
            System.out.println("Dados inválidos!");
        } else {
            System.out.println("Dados válidos!");
        }
    }
}
