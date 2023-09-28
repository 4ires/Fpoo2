package tema;

public class Tema {
	private long id;
	private String nome;
	private double valorAluguel;
	private int corToalha;
	
	public Tema( long id, String nome, double valorAluguel, int corToalha) {
		this.id = id;
		this.nome = nome;
		this.valorAluguel = valorAluguel;
		this.corToalha = corToalha;
	}
	
	public Tema() {
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getValorAluguel() {
		return valorAluguel;
	}
	
	public void setValorAluguel(double valorAluguel) {
		this.valorAluguel= valorAluguel;
	}
	public int getCorToalha() {
		return corToalha;
	}
	
	public void setCorToalha(int corToalha) {
		this.corToalha = corToalha;
	}
}
