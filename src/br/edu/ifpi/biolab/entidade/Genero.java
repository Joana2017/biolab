package br.edu.ifpi.biolab.entidade;

public class Genero {
	
	private int id;
	private String nome;
	private String habitat;
	private String subdivisao;
	private Especie especie;
	
	public Genero(int id,String nome,String habitat,String subdivisao,Especie especie ){
		this.id= id;
		this.nome= nome;
		this.habitat= habitat;
		this.subdivisao= subdivisao;
		this.especie = especie;
	}

	public Genero() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getSubdivisao() {
		return subdivisao;
	}

	public void setSubdivisao(String subdivisao) {
		this.subdivisao = subdivisao;
	}

	public Especie getEspecie() {
		return especie;
	}

	public void setEspecie(Especie especie) {
		this.especie = especie;
	}

	
}
