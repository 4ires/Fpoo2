package atividade2;

public class Funcionario {
	
	private long id;
	private String nome;
	private String telefone;
	private int matricula;
	private String endereco;
	double horastrab;
	double valorhora;

	
	
	public Funcionario(long id, String nome, String telefone, int matricula, String endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.matricula = matricula;
		this.endereco = endereco;
	}

	public long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public int getMatricula() {
		return matricula;
	}

	public String getEndereco() {
		return endereco;
	}

	public double getHorastrab() {
		return horastrab;
	}

	public double getValorhora() {
		return valorhora;
	}

	public void calculaSalario() {
		System.out.println("O salário está sendo calculado");
	}

	public double calculaSalario(double horastrab, double valorhora) {
		return horastrab*valorhora;
	}
}
