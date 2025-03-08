public class Diretor extends Funcionario implements Autenticavel, Fornecedor, Departamento{
    public Diretor(double salario){
        super(salario);
    }

    @Override
    public double calcSalario(){
        return salario;
    }

    @Override
    public void login(){
        System.out.println("Diretor Autenticado!");
    }

    @Override 
    public void realizarPedido(){
        System.out.println("Diretor realizando pedido..");
    }

    @Override
    public void forneceProduto(){
        System.out.println("Diretor fornecendo produto..");
    }

    @Override
    public void criaDepartamento(){
        System.out.println("Diretor criando departamento..");
    }

    @Override
    public void cadastraFuncionario(){
        System.out.println("Diretor cadastrando funcionário..");
    }
}
