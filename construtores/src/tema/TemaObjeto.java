package tema;

public class TemaObjeto {
	
	 public static void main(String[]args) {
			
		 Tema tema1 = new Tema();
		 Tema tema2 = new Tema(2, "Toalha", 12.00, 15);
		
		System.out.println(tema2.getId());
		System.out.println(tema2.getNome());
		System.out.println(tema2.getValorAluguel());
		System.out.println(tema2.getCorToalha());
	}
}
