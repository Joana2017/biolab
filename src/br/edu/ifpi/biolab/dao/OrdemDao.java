package br.edu.ifpi.biolab.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import br.edu.ifpi.biolab.entidade.Ordem;

public class OrdemDao {
	
	public void adiciona(Ordem ordem) throws SQLException {
		new ConnectionFactory();
		// conectando
		Connection con = ConnectionFactory.getConexao();
		// cria um preparedStatement
		String sql = "insert into Filo" + " (nome,codigo_nomeclatura)" + " values (?,?)";
		PreparedStatement stmt = con.prepareStatement(sql);
		
		// preenche os valores
		stmt.setString(1,ordem.getNome());
		stmt.setString(2,ordem.getCodigo_nomeclatura());
				
	
		// executa
		stmt.execute();
		stmt.close();
		System.out.println("Gravado!");
		con.close();
	}
	public List<Ordem> buscaTodos() throws SQLException {

		List<Ordem> ordens = new ArrayList<>();
		Connection conexao = (Connection) ConnectionFactory.getConexao();
		PreparedStatement stmt = conexao.prepareStatement("Select * from ordem");
		ResultSet rs= stmt.executeQuery();
		
		while (rs.next()){
			// criando o objeto Especie
			Ordem ordem = new Ordem(0, null, null, null);
			ordem.setId(rs.getInt("id"));
			ordem.setNome(rs.getString("nome"));
			ordem.setCodigo_nomeclatura(rs.getString("codigo_nomeclatura"));
			// adicionando o objeto e lista
			ordem.add(ordem);
		}
		
		rs.close();
		stmt.close();
		return ordens;
		
	}
	
	public void alterar(Ordem ordem) {
		String sql = "update Ordem set id=? nome=?" + "where id=?";

		try {
			PreparedStatement stmt = getConexao().prepareStatement(sql);
			stmt.setString(1,ordem.getNome());
			stmt.setInt(2, ordem.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	private Connection getConexao() {
				return null;
	}
	public void deletar(Ordem ordem) {
		try {
			PreparedStatement stmt = getConexao().prepareStatement("delete from Ordem where id=?");
			stmt.setLong(1, ordem.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Ordem buscaPorId(int id) {
		return null;

	}
	public void fechaConexao() {
		
		
	}
	
}
