package consulta;

public class Pessoa {
		private String nomePcnt;
		private String nomeDents;
		private int data;
		
		public Pessoa (String nomePcnt, String nomeDents, int data) {
			this.nomePcnt = nomePcnt;
			this.nomeDents = nomeDents;
			this.data = data;
		}
		
		public Pessoa() {
		}
		
		public String getNomePcnt() {
			return nomePcnt;
		}
		
		public void setNomePcnt(String nomePcnt) {
			this.nomePcnt = nomePcnt;
		}
		
		public String getNomeDents() {
			return nomeDents;
		}
		
		public void setNomeDents(String nomeDents) {
			this.nomeDents = nomeDents;
		}
		
		public int getData() {
			return data;
		}
		
		public void setData(int data) {
			this.data = data;
		}
		
	}

