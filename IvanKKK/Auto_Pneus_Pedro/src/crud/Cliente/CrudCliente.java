package crud.Cliente;

import dao.Cliente_dao;
import dao.Veiculo_dao;

import java.util.Scanner;

public class CrudCliente {

	private final Cliente_dao clienteDao = new Cliente_dao();
	private final Veiculo_dao veiculoDao;
	private final Scanner scanner = new Scanner(System.in);
	
	public CrudCliente(Veiculo_dao veiculoDao) {
		this.veiculoDao = veiculoDao;
	}
	
	public Cliente_dao getClienteDao() {
		return clienteDao;
	}
	
	public void menu() {
		int opc = -1;
		
		do {
		System.out.println("\n[MENU CLIENTE]");
		System.out.println("1 - CADASTRAR CLIENTE");
		System.out.println("2 - LISTAR CLIENTES");
		System.out.println("3 - ATUALIZAR CLIENTE");
		System.out.println("4 - REMOVER CLIENTE");
		System.out.println("0 - VOLTAR");
		System.out.println("OPÇÃO: ");
		opc = scanner.nextInt();
		scanner.nextLine();
		
		switch(opc) {
		
		case 1 -> new Create_Cliente(clienteDao, veiculoDao, scanner).executar();
			
		case 2 -> new Read_Cliente(clienteDao).executar();
			
		case 3 -> new Update_Cliente().executar();
			
		case 4 -> new Delete_Cliente(clienteDao, scanner).executar();
			 
		case 0 -> System.out.println("VOLTANDO...");
		
		default -> System.out.println("OPÇÃO INVÁLIDA");
			
		}
	
		} while(opc != 0);
	} 
	
}
