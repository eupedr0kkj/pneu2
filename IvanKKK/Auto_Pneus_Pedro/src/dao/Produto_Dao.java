package dao;

import Model.Produto;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Produto_Dao {
	private List<Produto> produtos = new ArrayList<>();

	public void salvarOuAtualizar(Produto novo) {
		for (Produto p : produtos) {
			if (p.equals(novo)) {
				p.adicionarQuantidade(novo.getQuantidade());
				return;
			}
		}
		produtos.add(novo);
	}

	public void removerPorId(int id) {
		produtos.removeIf(p -> p.getId() == id);
	}

	public List<Produto> listar() {
		return produtos;
	}

	public List<Produto> filtrar(String termo) {
		return produtos.stream()
				.filter(p -> p.getNome().toLowerCase().contains(termo.toLowerCase())
						|| p.getMarca().toLowerCase().contains(termo.toLowerCase())
						|| p.getCategoria().toLowerCase().contains(termo.toLowerCase()))
				.collect(Collectors.toList());
	}

	public Produto buscarPorId(int id) {
		for (Produto p : produtos) {
			if (p.getId() == id)
				return p;
		}
		return null;
	}
}
