package atv;

public class PrincipalCarros {

	public static void main(String[] args) {
		Carros.values();
		
		for(Carros lista: Carros.values()) {
			System.out.println(lista);
		}
	}

}
