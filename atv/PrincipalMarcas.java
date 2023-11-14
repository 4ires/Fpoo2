package atv;

public class PrincipalMarcas {

	public static void main(String[] args) {
		Marcas.values();

		for(Marcas lista: Marcas.values()) {
			System.out.println(lista);
		}
	}
}
