package Model;

import java.util.Objects;

public class Produto {
	private static int contador = 1;
	private int id;
	private String nome;
	private String marca;
	private String categoria;
	private double preco;
	private int quantidade;

	public Produto(String nome, String marca, String categoria, double preco, int quantidade) {
		this.nome = nome;
		this.marca = marca;
		this.categoria = categoria;
		this.preco = preco;
		this.quantidade = quantidade;
		this.id = contador++;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getMarca() {
		return marca;
	}

	public String getCategoria() {
		return categoria;
	}

	public double getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void adicionarQuantidade(int qtd) {
		this.quantidade += qtd;
	}

	public void removerQuantidade(int qtd) {
		if (qtd <= quantidade) {
			this.quantidade -= qtd;
		}
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Produto produto = (Produto) o;
		return nome.equalsIgnoreCase(produto.nome) && marca.equalsIgnoreCase(produto.marca)
				&& categoria.equalsIgnoreCase(produto.categoria);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome.toLowerCase(), marca.toLowerCase(), categoria.toLowerCase());
	}

	@Override
	public String toString() {
		return id + " - Produto: " + nome + " | Marca: " + marca + " | Categoria: " + categoria + " | Preço: R$ "
				+ preco + " | Estoque: " + quantidade;
	}
}
