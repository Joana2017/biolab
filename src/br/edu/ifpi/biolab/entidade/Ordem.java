package br.edu.ifpi.biolab.entidade;

public class Ordem {
	
	private int id;	
	private String nome;
	private String codigo_nomeclatura;
	private Familia familia;
	
	public  Ordem(int id,String nome,String codigo_nomeclatura,Familia familia){
		this.id= id;
		this.nome=nome;
		this.codigo_nomeclatura=codigo_nomeclatura;
		this.familia=familia; 
		
	}

	public Ordem() {
	
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

	public String getCodigo_nomeclatura() {
		return codigo_nomeclatura;
	}

	public void setCodigo_nomeclatura(String codigo_nomeclatura) {
		this.codigo_nomeclatura = codigo_nomeclatura;
	}

	public Familia getFamilia() {
		return familia;
	}

	public void setFamilia(Familia familia) {
		this.familia = familia;
	}

	public void add(Ordem ordem) {
		
		
	}

	
}
