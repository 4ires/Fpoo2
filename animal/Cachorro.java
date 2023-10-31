package animal;

public class Cachorro extends Animal{
	
	public Cachorro(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}
	
		@Override
		public void dormir() {
		System.out.println("O cachorro está dormindo.");
	    }
		
		@Override
		public void caminhar() {
		System.out.println("O cachorro está caminhando.");
	    }
		
		@Override
		public void correr() {
		System.out.println("O cachorro está correndo.");
	    }
		
		@Override
		public void emitirSom() {
		System.out.println("O cachorro está latindo.");
	    }
}
