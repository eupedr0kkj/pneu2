package crud.Cliente;

import dao.Cliente_dao;
import Model.Cliente;
import java.util.Scanner;

public class Update_Cliente {
	private final Cliente_dao clienteDao = new Cliente_dao();
	private final Scanner scanner = null;

public void Uptade_Cliente(Cliente_dao clienteDao, Scanner scanner) {
}

	public void executar() {
		System.out.print("Digite o CPF do cliente que deseja atualizar: ");
		String cpf = scanner.nextLine();

		Cliente cliente = clienteDao.buscarPorCpf(cpf);
		if (cliente == null) {
			System.out.println("Cliente não encontrado.");
			return;
		}
		System.out.println("Cliente atual: " + cliente);

		System.out.print("Novo nome (deixe em branco para manter): ");
		String novoNome = scanner.nextLine();
		if (!novoNome.isEmpty()) {
			cliente.setNome(novoNome);
		}
		clienteDao.atualizar(cliente);
		System.out.println("Cliente atualizado");
	}
}
