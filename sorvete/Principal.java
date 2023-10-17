package sorvete;

public class Principal {

	public static void main(String[] args) {
		
		Produto produto = new Produto(1, "Valentina", 12.00);
		System.out.println("Pessoa: " + produto.getId());
		System.out.println("Nome: " + produto.getNome());
		System.out.println("Preço: " + produto.getPreco());

		
		Sorvete sorvete = new Sorvete(2, "Martina", 7.00, 21);
		System.out.println("Pessoa: " + sorvete.getId());
		System.out.println("Nome: " + sorvete.getNome());
		System.out.println("Preço: " + sorvete.getPreco());
		System.out.println("Temperatura Adequada: " + sorvete.getTempAdequada());
	
		
		Camisa camisa = new Camisa(3, "Vick", 9.00, "Branca", "Crochê", "M");
		System.out.println("Pessoa: " + camisa.getId());
		System.out.println("Nome: " + camisa.getNome());
		System.out.println("Preço: " + camisa.getPreco());
		System.out.println("Cor: " + camisa.getCor());
		System.out.println("Tecido: " + camisa.getTecido());
		System.out.println("Tamanho: " + camisa.getTamanho());
	
	}

}
