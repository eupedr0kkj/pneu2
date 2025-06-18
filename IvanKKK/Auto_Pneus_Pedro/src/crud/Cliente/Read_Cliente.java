package crud.Cliente;

import dao.Cliente_dao;
import Model.Cliente;
import Model.Veiculo;

public class Read_Cliente {
	private final Cliente_dao clienteDao;

	public Read_Cliente(Cliente_dao clienteDao) {
		this.clienteDao = clienteDao;

	}

	public void executar() {
		for (Cliente cliente : clienteDao.listar()) {
			System.out.println(cliente);
			for (Veiculo veiculo : cliente.getVeiculos()) {
				System.out.println(" ->" + veiculo);
			}
		}
	}
}
