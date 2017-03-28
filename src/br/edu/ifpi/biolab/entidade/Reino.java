package br.edu.ifpi.biolab.entidade;

import java.sql.Date;

public class Reino {
	
	private int id;
	private String nome;
	private String classificacao;
	private Date datainclusao;
	private Filo filo;
	
	public Reino(int id,String nome,String classificacao,Filo filo){
		this.id = id;
		this.classificacao = classificacao;
		this.filo = filo;
	}
	
	public Reino() {
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

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public Date getDatainclusao() {
		return datainclusao;
	}

	public void setDatainclusao(Date datainclusao) {
		this.datainclusao = datainclusao;
	}

	public Filo getFilo() {
		return filo;
	}

	public void setFilo(Filo filo) {
		this.filo = filo;
	}

	

}
