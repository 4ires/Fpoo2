package atividade.heranca;

public class Principal {
	
	public static void main(String[] args) {

		Veiculo veiculo = new Veiculo("Fiat", "Fiat Argo", 2010, "Prata");
		System.out.println("Marca: " + veiculo.getMarca());
		System.out.println("Modelo: " + veiculo.getModelo());
		System.out.println("Ano: " + veiculo.getAno());
		System.out.println("Cor: " + veiculo.getCor());


		Automovel automovel = new Automovel("Fiat", "Fiat Argo", 2010, "Prata");
		System.out.println("Marca: " + veiculo.getMarca());
		System.out.println("Modelo: " + veiculo.getModelo());
		System.out.println("Ano: " + veiculo.getAno());
		System.out.println("Cor: " + veiculo.getCor());
		System.out.println("Número de portas:" + automovel.getNumeroPortas());
		System.out.println("Motor: " + automovel.getMotor());
		

		Moto moto = new Moto("Vespa", "Scooter", 2020, "Verde claro", 125);
		System.out.println("Marca: " + veiculo.getMarca());
		System.out.println("Modelo: " + veiculo.getModelo());
		System.out.println("Ano: " + veiculo.getAno());
		System.out.println("Cor: " + veiculo.getCor());
		System.out.println("Nome:" + moto.getCilindrada());
	}
}
