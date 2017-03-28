package br.edu.ifpi.biolab.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifpi.biolab.entidade.Familia;


public class FamiliaDao {
	
	public void adiciona(Familia familia) throws SQLException {
		new ConnectionFactory();
		// conectando
		Connection con = ConnectionFactory.getConexao();
		// cria um preparedStatement
		String sql = "insert into Familia" + " (codigo_nomeclatura,tribos,subtribos)" 
		+ " values (?,?,?,?)";
		PreparedStatement stmt = con.prepareStatement(sql);
		
		// preenche os valores
		
		stmt.setString(1,familia.getCodigo_nomeclatura());
		stmt.setString(2,familia.getTribos());
		stmt.setString(3,familia.getSubtribos());
	
		// executa
		stmt.execute();
		stmt.close();
		System.out.println("Gravado!");
		con.close();
	}
	public List<Familia> buscaTodos() throws SQLException {

		List<Familia> familias = new ArrayList<>();
		Connection conexao = (Connection) ConnectionFactory.getConexao();
		PreparedStatement stmt = conexao.prepareStatement("Select * from familia");
		ResultSet rs= stmt.executeQuery();
		
		while (rs.next()){
			// criando o objeto familia
			Familia familia = new Familia();
			familia.setId(rs.getInt("id"));
			familia.setCodigo_nomeclatura(rs.getString("codigo_nomeclatura"));
			familia.setTribos(rs.getString("tribos"));
			familia.setSubtribos(rs.getString("subtribos"));
			// adicionando o objeto e lista
			familias.add(familia);
		}
		
		rs.close();
		stmt.close();
		return familias;
		
	}
	
	public void alterar(Familia familia) {
		String sql = "update Familia set id=? nome=?" + "where id=?";

		try {
			PreparedStatement stmt = getConexao().prepareStatement(sql);
			stmt.setString(1,familia.getNome());
			stmt.setInt(2, familia.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	private Connection getConexao() {
				return null;
	}
	public void deletar(Familia familia) {
		try {
			PreparedStatement stmt = getConexao().prepareStatement("delete from Familia where id=?");
			stmt.setLong(1, familia.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Familia buscaPorId(int id) {
		return null;

	}
	public void fechaConexao() {
		// TODO Auto-generated method stub
		
	}

}
