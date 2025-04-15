
package dao;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import model.Cliente;

public class ClienteDAO {
    private static final String CAMINHO_ARQUIVO = "clientes.txt";

    public void salvar(Cliente cliente) throws IOException {
        BufferedWriter escritor = new BufferedWriter(new FileWriter(CAMINHO_ARQUIVO, true));
        escritor.write(cliente.toString());
        escritor.newLine();
        escritor.close();
    }

    public List<Cliente> listarTodos() throws IOException {
        List<Cliente> clientes = new ArrayList<>();
        File arquivo = new File(CAMINHO_ARQUIVO);
        if (!arquivo.exists()) {
            return clientes;
        }

        BufferedReader leitor = new BufferedReader(new FileReader(CAMINHO_ARQUIVO));
        String linha;
        while ((linha = leitor.readLine()) != null) {
            clientes.add(Cliente.fromString(linha));
        }
        leitor.close();
        return clientes;
    }
}
