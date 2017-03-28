package br.edu.ifpi.biolab.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.edu.ifpi.biolab.entidade.Especie;

public class EspecieDao extends Dao {

	public  void adiciona(Especie especie) throws SQLException {
		
		// cria um preparedStatement
		String sql = "insert into Especie" + " (nome_cientifico,divisao,classificacao"
				+ ",nome_comum,id_genero,data_inclusao)" + " values (?,?,?,?,?,?)";
		
		PreparedStatement stmt = super.getConexao().prepareStatement(sql);
		// preenche os valores
		stmt.setString(1,especie.getNomeCientifico());
		stmt.setString(2,especie.getDivisao());
		stmt.setString(3,especie.getClassificacao());
		stmt.setString(4,especie.getNomeComum());
		stmt.setInt(5,especie.getGenero().getId());
		stmt.setDate(6,new java.sql.Date(especie.getDataInclusao().getTime()));

		// executa
		stmt.execute();
		stmt.close();
		System.out.println("Gravado!");
		
	}

	public List<Especie> buscaTodos() throws SQLException {

		List<Especie> especies = new ArrayList<>();
		Connection conexao = ConnectionFactory.getConexao();
		PreparedStatement stmt = conexao.prepareStatement("Select * from especie");
		ResultSet rs= stmt.executeQuery();
		
		while (rs.next()){
			// criando o objeto Especie
			Especie especie = new Especie();
			especie.setId(rs.getInt("id"));
			especie.setNomeComum(rs.getString("nome_comum"));
			
			
			// montando a data atraves do Calendario
			Calendar data = Calendar.getInstance();
			data.setTime(rs.getDate("data_inclusao"));
			especie.setDataInclusao(data.getTime());
			
			// adicionando o objeto e lista
			especies.add(especie);
		}
		
		rs.close();
		stmt.close();
		return especies;
	}

	
	public void alterar(Especie especie) {
		String sql = "update Especie set id=? nome=?" + "where id=?";

		try {
			PreparedStatement stmt = getConexao().prepareStatement(sql);
			stmt.setString(1,especie.getNomeComum());
			stmt.setInt(2, especie.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Connection getConexao() {
				return null;
	}
	public void deletar(Especie especie) {
		try {
			PreparedStatement stmt = getConexao().prepareStatement("delete from Especie where id=?");
			stmt.setLong(1, especie.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	public Especie buscaPorId(int id) {
		return null;

	}

}
