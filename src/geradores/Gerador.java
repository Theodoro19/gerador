package geradores;

public class Gerador {

	private Integer id;
	private String nome;
	private Integer potencia;
	private Integer capacidadeTotal;
	private Integer usoCapacidade;
	private Integer tamanhoTanque;
	private Boolean status = Boolean.FALSE;

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

	public Integer getPotencia() {
		return potencia;
	}

	public void setPotencia(Integer potencia) {
		this.potencia = potencia;
	}

	public Integer getCapacidadeTotal() {
		return capacidadeTotal;
	}

	public void setCapacidadeTotal(Integer capacidadeTotal) {
		this.capacidadeTotal = capacidadeTotal;
	}

	public Integer getUsoCapacidade() {
		return usoCapacidade;
	}

	public void setUsoCapacidade(Integer usoCapacidade) {
		this.usoCapacidade = usoCapacidade;
	}

	public Integer getTamanhoTanque() {
		return tamanhoTanque;
	}

	public void setTamanhoTanque(Integer tamanhoTanque) {
		this.tamanhoTanque = tamanhoTanque;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Gerador createGerador(Integer id, String nome, Integer capacidadeTotal, Integer usoCapacidade,
			Integer tamanhoTanque, Integer potencia) {
		Gerador gerador = new Gerador();
		gerador.setCapacidadeTotal(capacidadeTotal);
		gerador.setId(id);
		gerador.setNome(nome);
		gerador.setPotencia(potencia);
		gerador.setTamanhoTanque(tamanhoTanque);
		gerador.setUsoCapacidade(usoCapacidade);
		return gerador;
	}

	public void updateStatus(Gerador gerador) {
		gerador.setStatus(gerador.getStatus() ? Boolean.TRUE : Boolean.FALSE);
	}

	@Override
	public String toString() {
		return "Detalhes do Gerador \nNome: " + nome + "\nPotência: " + potencia
				+ "\nCapacidade de geração de energia: " + capacidadeTotal + "\nTamanho do Tanque: " + tamanhoTanque
				+ "\nStatus: " + (status ? "Ligado" : "Desligado")+"\n";
	}

}
