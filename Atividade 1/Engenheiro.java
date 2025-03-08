public class Engenheiro extends Funcionario implements Fornecedor{
    private double comissao;

    public Engenheiro(double comissao, double salario) {
        super(salario);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcSalario() {
        return salario + comissao;
    }

    @Override 
    public void realizarPedido(){
        System.out.println("Engenheiro realizando pedido..");
    }

    @Override
    public void forneceProduto(){
        System.out.println("Engenheiro fornecendo produto..");
    }
}
