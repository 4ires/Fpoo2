package endereco;

public class Endereco {
	private long id;
	private String logradouro;
	private int numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String cep;
	private String uf;
	
	public Endereco(long id, String logradouro, int numero, String complemento, String bairro, String cidade,
			String cep, String uf) {

		this.id = id;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
		this.uf = uf;
	}
	
	public Endereco() {
	}
	public long getId() {
		return id;
	}
	public String getLogradouro() {
		return logradouro;
	}

	public int getNumero() {
		return numero;
	}
	
	public String getComplemento() {
		return complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public String getCep() {
		return cep;
	}

	public String getUf() {
		return uf;
	}

}
