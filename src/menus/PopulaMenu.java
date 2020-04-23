package menus;

import java.util.ArrayList;
import java.util.List;

public class PopulaMenu {

	private List<Menu> lista = new ArrayList<>();
	private Menu menu = new Menu();
	
	public List<Menu> getMenu(){
		return lista;
	}
	
	public void addToList() {
		lista.add(menu.createMenu(1, "Acionamento manual de gerador"));
		lista.add(menu.createMenu(2, "Status dos geradores"));
		lista.add(menu.createMenu(3, "Status dos tanques de combustível"));
		lista.add(menu.createMenu(4, "Abastecer tanque de combustível"));
		lista.add(menu.createMenu(5, "Detalhes do gerador"));
		lista.add(menu.createMenu(6, "Sair"));
		
	}
}
