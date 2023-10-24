package atividade2;

public class PessoaJuridica extends Funcionario {
	
	public PessoaJuridica (long id, String nome, String telefone, int matricula, String endereco) {
		super(id, nome, telefone, matricula, endereco);
	}
	
	public double calculaSalario(double horastrab, double valorhora, double imposto) {
		return horastrab * valorhora - imposto;
	}
}
