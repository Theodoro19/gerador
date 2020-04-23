package menus;

public class Menu {

	private Integer id;
	private String nome;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Menu createMenu(Integer id, String nome) {
		Menu menu = new Menu();
		menu.setId(id);
		menu.setNome(nome);
		return menu;
	}

	@Override
	public String toString() {
		return id + " - " + nome;
	}
	
}
