package animal;

public class ConstrutorAnimal {
	public static void main(String[]args) {
		
		 Animal anima1 = new Animal();
		 Animal animal2 = new Animal("Porte pequeno", "Branco");
			
		System.out.println(animal2.getTamanho());
		System.out.println(animal2.getCor());
	}
}
