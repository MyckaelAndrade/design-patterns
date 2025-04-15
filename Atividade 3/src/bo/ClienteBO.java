
package bo;

import dao.ClienteDAO;
import model.Cliente;

import java.io.IOException;
import java.util.List;

public class ClienteBO {
    private ClienteDAO clienteDAO = new ClienteDAO();

    public void cadastrarCliente(String nome, String cpf) throws IOException {
        if (nome == null || nome.isEmpty() || cpf == null || cpf.isEmpty()) {
            throw new IllegalArgumentException("Nome e CPF são obrigatórios.");
        }

        Cliente cliente = new Cliente(nome, cpf);
        clienteDAO.salvar(cliente);
    }

    public List<Cliente> listarClientes() throws IOException {
        return clienteDAO.listarTodos();
    }
}
