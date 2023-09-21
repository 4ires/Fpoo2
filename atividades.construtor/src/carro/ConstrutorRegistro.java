package carro;

public class ConstrutorRegistro {
	 public static void main(String[]args) {
			
		 Registro dono1 = new Registro();
		 Registro dono2 = new Registro("Onix", 581689);
			
		System.out.println(dono2.getPlaca());
		System.out.println(dono2.getNumChassi());
	}
}
