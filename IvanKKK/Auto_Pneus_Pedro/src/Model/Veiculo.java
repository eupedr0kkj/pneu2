package Model;

public class Veiculo {
	private int id;
	private String modelo;
	private String placa;
	private Cliente dono;

	public Veiculo(int id, String modelo, String placa, Cliente dono) {
		this.id = id;
		this.modelo = modelo;
		this.placa = placa;
		this.dono = dono;
	}

	public int getId() {
		return id;
	}

	public String getModelo() {
		return modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public Cliente getDono() {
		return dono;
	}

	@Override
	public String toString() {
		return id + " - " + modelo + " (Placa: " + placa + ", Dono: " + dono.getNome() + ")";
	}
}
