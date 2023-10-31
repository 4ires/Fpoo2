package animal;

public class Principal {

	public static void main(String[] args) {
		
		Lobo lobo = new Lobo("Lobo", "macho", "raça");
		System.out.println(lobo.getNome());
		System.out.println(lobo.getRaca());
		System.out.println(lobo.getSexo());
		lobo.correr();
		lobo.caminhar();
		lobo.emitirSom();
		lobo.dormir();
		
		Cachorro dog = new Cachorro("Dog", "femea", "raca");
		System.out.println("\n");
		System.out.println(dog.getNome());
		System.out.println(dog.getRaca());
		System.out.println(dog.getSexo());
		dog.correr();
		dog.caminhar();
		dog.emitirSom();
		dog.dormir();
		
		Leao leao = new Leao("Leao", "macho", "raça");
		System.out.println("\n");
		System.out.println(leao.getNome());
		System.out.println(leao.getRaca());
		System.out.println(leao.getSexo());
		leao.correr();
		leao.caminhar();
		leao.emitirSom();
		leao.dormir();
		
		Tigre tigre = new Tigre("Tigre", "femea", "raca");
		System.out.println("\n");
		System.out.println(tigre.getNome());
		System.out.println(tigre.getRaca());
		System.out.println(tigre.getSexo());
		tigre.correr();
		tigre.caminhar();
		tigre.emitirSom();
		tigre.dormir();
		
		Gato gato = new Gato("Gato", "femea", "raça");
		System.out.println("\n");
		System.out.println(gato.getNome());
		System.out.println(gato.getRaca());
		System.out.println(gato.getSexo());
		gato.correr();
		gato.caminhar();
		gato.emitirSom();
		gato.dormir();
	}
}