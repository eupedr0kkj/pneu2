package crud.Cliente;

import dao.Cliente_dao;
import dao.Veiculo_dao;
import Model.Cliente;
import Model.Veiculo;
import java.util.Scanner;

public class Create_Cliente {
	private final Cliente_dao clienteDao;
	public Veiculo_dao veiculoDao;
	private final Scanner scanner;
	public Create_Cliente(Cliente_dao clienteDao, Veiculo_dao veiculoDao, Scanner scanner) {
		this.clienteDao = clienteDao;
		this.veiculoDao = veiculoDao;
		this.scanner = scanner;
	}
	public void executar() {
		System.out.print("Nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("CPF: ");
		String cpf = scanner.nextLine();
		
		Cliente cliente = new Cliente(0, nome, cpf);
		cliente = clienteDao.adicionar(cliente);
		System.out.println("Cliente cadastrado com sucesso!");
		
		String resposta;
		do {
			System.out.print("Deseja cadastrar um veiculo para este cliente? (s/n): ");
			resposta = scanner.nextLine().toLowerCase();
			
			if (resposta.equals("s")) {
				System.out.print("Modelo: ");
				String modelo = scanner.nextLine();
				System.out.print("Placa: ");
				String placa = scanner.nextLine();
				
				Veiculo veiculo = new Veiculo(0, modelo, placa, cliente);
				veiculo = veiculoDao.adicionar(veiculo);
				System.out.println("Veiculo cadastrado!");
				
			}
			
		} while (resposta.equals("s"));
		
	}
}

