package dao;

import Model.Veiculo;
import java.util.ArrayList;
import java.util.List;

public class Veiculo_dao {
	private static List<Veiculo> veiculos = new ArrayList<>();
	private static int idCounter = 1;

	public Veiculo adicionar(Veiculo veiculo) {
		veiculo = new Veiculo(idCounter++, veiculo.getModelo(), veiculo.getPlaca(), veiculo.getDono());
		veiculos.add(veiculo);
		return veiculo; // <<<<<< Adicionado
	}

	public List<Veiculo> listar() {
		return veiculos;
	}
}