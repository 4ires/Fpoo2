package endereco;

public class EnderecoObjeto {

	public static void main(String[]args) {
		
		Endereco endereco1 = new Endereco();
		Endereco endereco2 = new Endereco(1, "Perto do Central Park", 127, "Apartamento", "Brooklyn", "Nova Iorque", "150203697", "eua");
		
		System.out.println(endereco2.getId());
		System.out.println(endereco2.getLogradouro());
		System.out.println(endereco2.getNumero());
		System.out.println(endereco2.getComplemento());
		System.out.println(endereco2.getBairro());
		System.out.println(endereco2.getCidade());
		System.out.println(endereco2.getCep());
		System.out.println(endereco2.getUf());
		
	}
}
