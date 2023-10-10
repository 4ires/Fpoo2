package funcionario.heranca;

public class Principal {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario("Otavio", "Engenheiro", 20.000, "32756890", "Rua quinze", "13/10/2006");
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Matrícula: " + funcionario.getMatricula());
		System.out.println("Salário: " + funcionario.getSalario());
		System.out.println("Telefone: " + funcionario.getTelefone());
		System.out.println("Endereço: " + funcionario.getEndereco());
		System.out.println("Data de nascimento: " + funcionario.getDataNascimento());
		
		Administrador admin = new Administrador("Ana", "Administradora", 20.000, "32756890", "Rua quinze", "16/06/2010", 1);
		System.out.println("Nome: " + admin.getNome());
		System.out.println("Matrícula: " + admin.getMatricula());
		System.out.println("Salário: " + admin.getSalario());
		System.out.println("Telefone: " + admin.getTelefone());
		System.out.println("Endereço: " + admin.getEndereco());
		System.out.println("Data de nascimento: " + admin.getDataNascimento());
		System.out.println("Cra: " + admin.getCra());
		
		Engenheiro eng = new Engenheiro("Otavio", "Engenheiro", 25.000, "32735684", "Rua dezeseis", "13/10/2006", 2);
		System.out.println("Nome: " + eng.getNome());
		System.out.println("Matrícula: " + eng.getMatricula());
		System.out.println("Salário: " + eng.getSalario());
		System.out.println("Telefone: " + eng.getTelefone());
		System.out.println("Endereço: " + eng.getEndereco());
		System.out.println("Data de nascimento: " + eng.getDataNascimento());
		System.out.println("Número de Crea: " + eng.getNumCrea());
		
		Medico med = new Medico("Ritinha", "Médica", 30.000, "32757853", "Rua dezoito", "02/05/2007", 3);
		System.out.println("Nome: " + med.getNome());
		System.out.println("Matrícula: " + med.getMatricula());
		System.out.println("Salário: " + med.getSalario());
		System.out.println("Telefone: " + med.getTelefone());
		System.out.println("Endereço: " + med.getEndereco());
		System.out.println("Data de nascimento: " + med.getDataNascimento());
		System.out.println("Número de Crm: " + med.getCrm());
	}

}
