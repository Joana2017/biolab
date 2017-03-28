

package br.edu.ifpi.biolab.entidade;

public class Familia {
	
	private int id;	
	private String codigo_nomeclatura;
	private String tribos;	
	private String subtribos;	
	private Genero genero;
	
	public  Familia(int id,String codigo_nomeclatura,String tribos,String subtribos, Genero genero){
		this.id= id;
		this.codigo_nomeclatura=codigo_nomeclatura;
		this.tribos=tribos;
		this.subtribos=subtribos; 
		this.genero=genero;
		
	}

	public Familia() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigo_nomeclatura() {
		return codigo_nomeclatura;
	}

	public void setCodigo_nomeclatura(String codigo_nomeclatura) {
		this.codigo_nomeclatura = codigo_nomeclatura;
	}

	public String getTribos() {
		return tribos;
	}

	public void setTribos(String tribos) {
		this.tribos = tribos;
	}

	public String getSubtribos() {
		return subtribos;
	}

	public void setSubtribos(String subtribos) {
		this.subtribos = subtribos;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public String getNome() {
		return null;
	}

	public void setNome(String inserirFamilia) {
		
		
	}

	
}
