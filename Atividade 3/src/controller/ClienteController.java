
package controller;

import bo.ClienteBO;
import model.Cliente;
import view.ClienteView;

import java.util.List;

public class ClienteController {
    private ClienteBO clienteBO = new ClienteBO();
    private ClienteView clienteView = new ClienteView();

    public void iniciar() {
        int opcao;
        do {
            opcao = clienteView.exibirMenu();
            switch (opcao) {
                case 1:
                    try {
                        Cliente cliente = clienteView.lerDadosCliente();
                        clienteBO.cadastrarCliente(cliente.getNome(), cliente.getCpf());
                        clienteView.mostrarMensagem("Cliente cadastrado com sucesso!");
                    } catch (Exception e) {
                        clienteView.mostrarMensagem("Erro ao cadastrar: " + e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        List<Cliente> clientes = clienteBO.listarClientes();
                        clienteView.mostrarClientes(clientes);
                    } catch (Exception e) {
                        clienteView.mostrarMensagem("Erro ao listar clientes: " + e.getMessage());
                    }
                    break;
                case 0:
                    clienteView.mostrarMensagem("Saindo...");
                    break;
                default:
                    clienteView.mostrarMensagem("Opção inválida.");
            }
        } while (opcao != 0);
    }
}
