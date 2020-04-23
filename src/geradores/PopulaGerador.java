package geradores;

import java.util.ArrayList;
import java.util.List;

public class PopulaGerador {

	private List<Gerador> lista = new ArrayList<>();
	private Gerador gerador = new Gerador();
	
	public List<Gerador> getLista(){
		return lista;
	}

	public void addToList() {
		lista.add(gerador.createGerador(1, "G1", 5000, 0, 400, 85));
		lista.add(gerador.createGerador(2, "G2", 3000, 0, 600, 55));
		lista.add(gerador.createGerador(3, "G3", 10000, 0, 1000, 50));
		lista.add(gerador.createGerador(4, "G4", 5000, 0, 400, 85));
	}
	
}
