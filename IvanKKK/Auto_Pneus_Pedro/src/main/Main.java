package main;
 import crud.Cliente.CrudCliente;
import dao.Veiculo_dao;
 import dao.Produto_Dao;
 import java.util.Scanner;
 
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Veiculo_dao veiculoDao = null;
		CrudCliente crudCliente = new CrudCliente(veiculoDao);
		int opc;
		do {
			System.out.println("\n= = = Menu Principal = = =");
			System.out.println("1. - Cliente");
			System.out.println("2. - Veículo");
			System.out.println("3. - Produto");
			System.out.println("0. - Sair");
			opc = scanner.nextInt();
			scanner.nextLine();
			switch(opc) {
			case 1 -> crudCliente.menu();
			}
		} while(opc != 0);
		scanner.close();

	}

}
