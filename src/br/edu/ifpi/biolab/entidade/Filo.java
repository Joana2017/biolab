package br.edu.ifpi.biolab.entidade;


public class Filo {
	
private int id;	
private String nome;
private String subfilo;
private String superDivisao;
private Classe classe;

	public Filo(int id,String nome,String subfilo,String superDivisao,Classe classe){
		this. id= id;		
		this.nome= nome;
		this.subfilo= subfilo;
		this.superDivisao= superDivisao;
		this.classe = classe;
	}

	public Filo() {
		
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

	public String getSubfilo() {
		return subfilo;
	}

	public void setSubfilo(String subfilo) {
		this.subfilo = subfilo;
	}

	public String getSuperDivisao() {
		return superDivisao;
	}

	public void setSuperDivisao(String superDivisao) {
		this.superDivisao = superDivisao;
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClassificacao(Classe classe) {
		this.classe =classe ;
	}


}
