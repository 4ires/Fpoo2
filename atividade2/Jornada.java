package atividade2;

public class Jornada extends Funcionario{
	private long id;
	private String nome;
	private String telefone;
	private int matricula;
	private String endereco;


	
	public Jornada(long id, String nome, String telefone, int matricula, String endereco) {
		super(id, nome, telefone, matricula, endereco);
		
		this.id = id;
		this.nome = nome;
		this.matricula = matricula;
		this.telefone = telefone;
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


	@Override
	public double calculaSalario(double horastrab, double valorhora) {
		return horastrab * valorhora;
	}
}
