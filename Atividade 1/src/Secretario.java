package src;
public class Secretario extends Funcionario{
    public Secretario(double salario){
        super(salario);
    }

    @Override
    public double calcSalario(){
        return salario;
    }
}
