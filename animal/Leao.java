package animal;

public class Leao extends Animal{
	
	public Leao(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}
	
		@Override
		public void dormir() {
		System.out.println("O leão está dormindo.");
	    }
		
		@Override
		public void caminhar() {
		System.out.println("O leão está caminhando.");
	    }
		
		@Override
		public void correr() {
		System.out.println("O leão está correndo.");
	    }
		
		@Override
		public void emitirSom() {
		System.out.println("O leão está rugindo.");
	    }
}
