package cliente;

public class Cliente {
	
		private long id;
		private String nome;
		private String telefone;
		private String cpf;
		private String rg;
		
		public Cliente(long id, String nome, String telefone, String cpf, String rg) {
			this.id = id;
			this.nome = nome;
			this.telefone = telefone;
			this.cpf = cpf;
			this.rg = rg;
		}

		public Cliente() {
		}
		
		public long getId() {
			return id;
		}

		public String getNome() {
			return nome;
		}

		public String getTelefone() {
			return telefone;
		}

		public String getCpf() {
			return cpf;
		}

		public String getRg() {
			return rg;
		}

}
