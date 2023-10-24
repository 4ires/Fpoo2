package atividade2;

public class Horista extends Funcionario{
	double horastrab;
	double valorhora;
	
	public Horista(long id, String nome, String telefone, int matricula, String endereco) {
		super(id, nome, telefone, matricula, endereco);
	}
	
	@Override 
	public double calculaSalario(double horastrab, double valorhora) {
		 return horastrab * valorhora;
	}
}
