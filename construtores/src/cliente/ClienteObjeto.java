package cliente;

public class ClienteObjeto {
	public static void main(String[]args) {
		
	    Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente(2, "Toalha", "32756978", "45685314792", "54984230148");
		
		System.out.println(cliente2.getId());
		System.out.println(cliente2.getNome());
		System.out.println(cliente2.getTelefone());
		System.out.println(cliente2.getCpf());
		System.out.println(cliente2.getRg());
	}
}
