package crud.Cliente;

import dao.Cliente_dao;
import Model.Cliente;
import java.util.Scanner;

public class Delete_Cliente {
	private final Cliente_dao clienteDao;
	private final Scanner scanner;

	public Delete_Cliente(Cliente_dao clienteDao, Scanner scanner) {
		this.clienteDao = clienteDao;
		this.scanner = scanner;

	}

	public void executar() {
		System.out.print("Digite o CPF do cliente a remover; ");
		String cpf = scanner.nextLine();

		Cliente cliente = clienteDao.buscarPorCpf(cpf);
		if (cliente == null) {
			System.out.println("Cliente não encontrado. ");
			return;
		}
		clienteDao.remover(cliente);
		System.out.println("Cliente removido!");
	}

}
