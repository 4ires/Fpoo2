package animal;

public class Animal {
	private String tamanho;
	private String cor;
	
	public Animal(String tamanho, String cor) {
		this.tamanho = tamanho;
		this.cor = cor;
	}
	
	public Animal() {
	}
	
	public String getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor= cor;
	}
}
