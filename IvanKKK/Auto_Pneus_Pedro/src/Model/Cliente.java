package Model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private int id;
	private String nome;
	private String cpf;
	private List<Model.Veiculo> veiculos = new ArrayList<>();

	public Cliente(int id, String nome, String cpf) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
	}

// ✅ Getters e Setters

	public int getId() {
		return id;
	}

	public void setId(int id) { // Necessário para setar o ID no Dao
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) { // Para atualizar nome
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public List<Model.Veiculo> getVeiculos() {
		return veiculos;
	}

	public void adicionarVeiculo(Model.Veiculo v) {
		veiculos.add(v);
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", cpf=" + cpf + "]";
	}
}
