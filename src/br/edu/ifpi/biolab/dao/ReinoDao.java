package br.edu.ifpi.biolab.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifpi.biolab.entidade.Reino;

public class ReinoDao extends Dao {

	public void adicionar(Reino reino) throws SQLException {

		// cria um preparedStatement
		String sql = "insert into Reino" + " (nome)" + " values (?)";
		PreparedStatement stmt = super.getConexao().prepareStatement(sql);

		// preenche os valores
		stmt.setString(1, reino.getNome());

		// executa
		stmt.execute();
		stmt.close();
		System.out.println("Gravado!");

	}

	public List<Reino> buscaTodos() throws SQLException {

		List<Reino> reinos = new ArrayList<>();
		Connection conexao = ConnectionFactory.getConexao();
		PreparedStatement stmt = conexao.prepareStatement("Select * from Reino");
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			// criando o objeto Especie
			Reino reino = new Reino();
			reino.setId(rs.getInt("id"));
			reino.setNome(rs.getString("nome"));

			// adicionando o objeto e lista
			reinos.add(reino);
		}

		rs.close();
		stmt.close();
		return reinos;
	}
	
	public void alterar(Reino reino) {
		String sql = "update reino set id=? nome=?" + "where id=?";

		try {
			PreparedStatement stmt = getConexao().prepareStatement(sql);
			stmt.setString(1, reino.getNome());
			stmt.setInt(2, reino.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void deletar(Reino reino) {
		try {
			PreparedStatement stmt = getConexao().prepareStatement("delete from reino where id=?");
			stmt.setLong(1, reino.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Reino buscaPorId(int id) {
		return null;

	}

	public void fechar(Reino reino) {
		
		
	}

	

}
