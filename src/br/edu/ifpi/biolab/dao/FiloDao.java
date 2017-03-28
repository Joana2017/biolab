package br.edu.ifpi.biolab.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifpi.biolab.entidade.Filo;

public class FiloDao {
	
	public void adiciona(Filo filo) throws SQLException {
		new ConnectionFactory();
		// conectando
		Connection con = ConnectionFactory.getConexao();
		// cria um preparedStatement
		String sql = "insert into Filo" + " (nome,subfilo,superdivisao,id_reino)" + " values (?,?,?,?)";
		PreparedStatement stmt = con.prepareStatement(sql);
		
		// preenche os valores
		stmt.setString(1,filo.getNome());
		stmt.setString(2,filo.getSubfilo());
		stmt.setString(3,filo.getSuperDivisao());
		
	
		// executa
		stmt.execute();
		stmt.close();
		System.out.println("Gravado!");
		con.close();
	}
	public List<Filo> buscaTodos() throws SQLException {

		List<Filo> filos = new ArrayList<>();
		Connection conexao = (Connection) ConnectionFactory.getConexao();
		PreparedStatement stmt = conexao.prepareStatement("Select * from filo");
		ResultSet rs= stmt.executeQuery();
		
		while (rs.next()){
			// criando o objeto Especie
			Filo filo = new Filo(0, null, null, null, null);
			filo.setId(rs.getInt("id"));
			filo.setNome(rs.getString("nome"));
			filo.setSubfilo(rs.getString("Subfilo"));
			filo.setSuperDivisao(rs.getString("SuperDivisao"));
			// adicionando o objeto e lista
						filos.add(filo);
		}
		
		rs.close();
		stmt.close();
		return filos;
	}
	
	public void alterar(Filo filo) {
		String sql = "update Filo set id=? nome=?" + "where id=?";

		try {
			PreparedStatement stmt = getConexao().prepareStatement(sql);
			stmt.setString(1,filo.getNome());
			stmt.setInt(2, filo.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	private Connection getConexao() {
				return null;
	}
	public void deletar(Filo filo) {
		try {
			PreparedStatement stmt = getConexao().prepareStatement("delete from Filo where id=?");
			stmt.setLong(1, filo.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Filo buscaPorId(int id) {
		return null;

	}
	public void fechaConexao() {
		
		
	}

}




