package SingleResponsibility.Correcao;

public class CalcularSalario extends Funcionario{
    public CalcularSalario(String nome, double salario){
        super(nome, salario);
    }

    // Método que calcula o salário com 10% de aumento
    public Double calcularSalario(){
        return this.salario * 1.1;
    }
}