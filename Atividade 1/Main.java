// Atividade 1:
// Criar uma aplicação em Java conforme a UML apresentada em sala de aula. 
// ***Incluir as Interfaces Fornecedor e Departamento e a classe abstrata Pessoa com os atributos e métodos discutidos em sala de aula.

// Criar Interface Fornecedor
// As classes Engenheiro, Diretor e Gerente implementam a interface Fornecedor
// Os métodos dessa interface e o método realizar pedido

// Criar a Interface Departamento
// As classes Diretor e Gerente implementam a interface Departamento
// Os métodos da Interface Departamento: Cria Departamento e Cadastrar Funcionários

// Criar a classe Abstrata Pessoa
// Criar 5 atributos e 5 métodos
// Pelo menos 2 desses métodos devem ser abstratos
// A Classe Pessoa é a super classe de Cliente
// Implemente os métodos em Cliente (Pode ser apenas a impressão dos valores)

// Fazer a UML dessa nova aplicação 

public class Main {
    public static void main(String[] args) {
        // Secretario secretario = new Secretario(3000);
        // Engenheiro engenheiro = new Engenheiro(800, 5000);
        // Diretor diretor = new Diretor(40000);
        // Gerente gerente = new Gerente(20000);

        // System.out.println("\n ============================================");
        // System.out.println("Salário do Gerente: " + gerente.calcSalario());
        // System.out.println("Salário do Diretor: " + diretor.calcSalario());
        // System.out.println("Salário do Engenheiro: " + engenheiro.calcSalario());
        // System.out.println("Salário do Secretario: " + secretario.calcSalario());
        // System.out.println("============================================\n");

        // gerente.login();
        // diretor.login();

        // Testando as classes Depois das alterações solicitadas pelo professor:

        System.out.println("\n ============================================");
        Engenheiro engenheiro = new Engenheiro(3, 3);
        engenheiro.forneceProduto();
        engenheiro.realizarPedido();

        Diretor diretor = new Diretor(5);
        diretor.criaDepartamento();
        diretor.cadastraFuncionario();

        Cliente cliente = new Cliente("João",20,"000.000.001-000","123456789","Rua 1 N2");
        cliente.setNome("João Silva");
        cliente.setIdade(30);
        cliente.setCpf("123.456.789-00");
        cliente.setEndereco("Rua ABC, 123");
        cliente.setTelefone("(11) 99999-9999");
        cliente.exibirInformacoes();
        cliente.validaDados();
        System.out.println("\n ============================================");
    }
}
