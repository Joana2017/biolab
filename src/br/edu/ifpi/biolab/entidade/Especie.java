package br.edu.ifpi.biolab.entidade;

import java.util.Date;

public class Especie {

	private int id;
	private String nomeComum;
	private String divisao;
	private String nomeCientifico;
	private String classificacao;
	private Date dataInclusao;
	private Genero genero;
	

	public Especie(){
		this.id = id;
		this.nomeComum= nomeComum;
		this.nomeCientifico= nomeCientifico;
		this.dataInclusao= dataInclusao ;
		this.classificacao= classificacao;
		this.divisao= divisao;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNomeComum() {
		return nomeComum;
	}


	public void setNomeComum(String nomeComum) {
		this.nomeComum = nomeComum;
	}


	public String getDivisao() {
		return divisao;
	}


	public void setDivisao(String divisao) {
		this.divisao = divisao;
	}


	public String getNomeCientifico() {
		return nomeCientifico;
	}


	public void setNomeCientifico(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
	}


	public String getClassificacao() {
		return classificacao;
	}


	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}


	public Date getDataInclusao() {
		return dataInclusao;
	}


	public void setDataInclusao(Date dataInclusao) {
		this.dataInclusao = dataInclusao;
	}


	public Genero getGenero() {
		return genero;
	}


	public void setGenero(Genero genero) {
		this.genero = genero;
	}


	public void setNome(String deletarEspecie) {
		
	}


	

	

	/* Especie -> Genero -> Familia -> Ordem -> Classe -> Filo */

}
