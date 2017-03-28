package br.edu.ifpi.biolab.entidade;

public class Classe {

    private int id;	
    private String nome;
    private String subclasse;
    private String divisoes;
    private Ordem ordem;
	
	public Classe(int id,String nome,String subclasse,String divisoes, Ordem ordem){
		this.id=id;
		this.nome= nome;
		this.subclasse = subclasse;
		this.divisoes = divisoes;
		this.ordem = ordem;
	}

	public Classe() {
		
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

	public String getSubclasse() {
		return subclasse;
	}

	public void setSubclasse(String subclasse) {
		this.subclasse = subclasse;
	}

	public String getDivisoes() {
		return divisoes;
	}

	public void setDivisoes(String divisoes) {
		this.divisoes = divisoes;
	}

	public Ordem getOrdem() {
		return ordem;
	}

	public void setOrdem(Ordem ordem) {
		this.ordem = ordem;
	}

	}