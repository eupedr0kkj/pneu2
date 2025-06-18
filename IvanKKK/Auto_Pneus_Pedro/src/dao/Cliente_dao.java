package dao;

import Model.Cliente;
import java.util.ArrayList;
import java.util.List;

public class Cliente_dao {
	private static List<Cliente> clientes = new ArrayList<>();
	private static int idCounter = 1;

	public Cliente adicionar(Cliente cliente) {
		cliente = new Cliente(idCounter++, cliente.getNome(), cliente.getCpf());
		clientes.add(cliente);
		return cliente;
	}

	public List<Cliente> listar() {
		return clientes;
	}

	public Cliente buscarPorId(int id) {
		for (Cliente c : clientes) {
			if (c.getId() == id)
				return c;
		}
		return null;
	}

	// ✅ Adicionando métodos solicitados

	public Cliente buscarPorCpf(String cpf) {
		for (Cliente c : clientes) {
			if (c.getCpf().equals(cpf)) {
				return c;
			}
		}
		return null;
	}

	public void atualizar(Cliente cliente) {
		for (int i = 0; i < clientes.size(); i++) {
			if (clientes.get(i).getId() == cliente.getId()) {
				clientes.set(i, cliente);
				return;
			}
		}
	}

	public void remover(Cliente cliente) {
		clientes.remove(cliente);
	}

}
