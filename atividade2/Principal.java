package atividade2;

public class Principal {
	
	public static void main(String[] args) {
		
		Jornada jornada = new Jornada(1, "Mariana", "33765894", 4, "Rua dezenove");
		System.out.println("Id: " + jornada.getId());
		System.out.println("Nome: " + jornada.getNome());
		System.out.println("Telefone: " + jornada.getTelefone());
		System.out.println("Matrícula: " + jornada.getMatricula());
		System.out.println("Endereço: " + jornada.getEndereco());
		
		System.out.println("O seu salário é de: " + jornada.calculaSalario(30,10));
		
		System.out.println("\n");
		
		Horista horista = new Horista(2, "Ana", "32786742", 5, "Rua quinze");
		System.out.println("Id: " + horista.getId());
		System.out.println("Nome: " + horista.getNome());
		System.out.println("Telefone: " + horista.getTelefone());
		System.out.println("Matricula: " + horista.getMatricula());
		System.out.println("Endereço: " + horista.getEndereco());
		
		System.out.println("O seu salário é de: " + horista.calculaSalario(30,20));
		System.out.println("\n");
		
		PessoaJuridica pessoaJuridica = new PessoaJuridica(3, "Valen", "33452786", 6, "Rua vinte e seis");
		System.out.println("Id: " + pessoaJuridica.getId());
		System.out.println("Nome: " + pessoaJuridica.getNome());
		System.out.println("Telefone: " + pessoaJuridica.getTelefone());
		System.out.println("Matricula: " + pessoaJuridica.getMatricula());
		System.out.println("Endereço: " + pessoaJuridica.getEndereco());
		
		System.out.println("O seu salário é de: " + pessoaJuridica.calculaSalario(30,40,50));
	}
}
