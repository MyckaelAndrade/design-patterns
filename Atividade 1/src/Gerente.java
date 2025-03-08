package src;
public class Gerente extends Funcionario implements Autenticavel, Fornecedor, Departamento {
    public Gerente(double salario) {
        super(salario);
    }

    @Override
    public double calcSalario() {
        return salario;
    }

    @Override
    public void login() {
        System.out.println("Gerente Autenticado!");
    }

    @Override
    public void realizarPedido() {
        System.out.println("Pedido Realizado");
    }

    @Override
    public void forneceProduto() {
        System.out.println("Produto");
    }

    @Override
    public void criaDepartamento() {
        System.out.println("Departamento criado!");
    }

    @Override
    public void cadastraFuncionario() {
        System.out.println("Funcionário Cadastrado!");
    }
}
