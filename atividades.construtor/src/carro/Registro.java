package carro;

public class Registro {
	private String placa;
	private int numChassi;
	
	public Registro(String placa, int numChassi) {
		this.placa = placa;
		this.numChassi = numChassi;
	}
	
	public Registro() {
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public int getNumChassi() {
		return numChassi;
	}
	
	public void setNumChassi(int numChassi) {
		this.numChassi= numChassi;
	}
}
