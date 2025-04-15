
package view;

import java.util.List;
import java.util.Scanner;

import model.Cliente;

public class ClienteView {
    private Scanner scanner = new Scanner(System.in);

    public int exibirMenu() {
        System.out.println("1 - Cadastrar cliente");
        System.out.println("2 - Listar clientes");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public Cliente lerDadosCliente() {
        scanner.nextLine(); // Limpar buffer
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        return new Cliente(nome, cpf);
    }

    public void mostrarClientes(List<Cliente> clientes) {
        System.out.println("=== Lista de Clientes ===");
        for (Cliente cliente : clientes) {
            System.out.println("Nome: " + cliente.getNome() + " | CPF: " + cliente.getCpf());
        }
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
