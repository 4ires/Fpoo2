package sorvete;

public class Camisa extends Produto {
	private String cor;
	private String tecido;
	private String tamanho;

	public Camisa(long id, String nome, double preco, String cor, String tecido, String tamanho) {
		super(id, nome, preco);
		this.cor = cor;
		this.tecido = tecido;
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public String getTecido() {
		return tecido;
	}

	public String getTamanho() {
		return tamanho;
	}
}