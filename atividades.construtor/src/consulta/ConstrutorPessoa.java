package consulta;

public class ConstrutorPessoa {
  public static void main(String[]args) {
		
		Pessoa paciente1 = new Pessoa();
		Pessoa paciente2 = new Pessoa("Maria Rita", "Valeria", 20);
		
		System.out.println(paciente2.getNomePcnt());
		System.out.println(paciente2.getNomeDents());
		System.out.println(paciente2.getData());
	}
}
