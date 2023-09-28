package item.tema;

public class ItemTemaObjeto {
	
	 public static void main(String[]args) {
			
	    ItemTema itemtema1 = new ItemTema();
		ItemTema itemtema2 = new ItemTema(2, "Toalha", "Para secar o bumbum fedido do otavio");
		
		System.out.println(itemtema2.getId());
		System.out.println(itemtema2.getNome());
		System.out.println(itemtema2.getDescricao());
	}
}
