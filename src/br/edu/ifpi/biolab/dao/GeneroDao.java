package br.edu.ifpi.biolab.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifpi.biolab.entidade.Genero;

public class GeneroDao {
	
private Connection con;

public  void adiciona(Genero genero) throws SQLException {
		
		// cria um preparedStatement
		String sql = "insert into Genero" + " (nome,habitat,subdivisao)" + " values (?,?,?)";
		con = null;
		PreparedStatement stmt = con.prepareStatement(sql);
		
		// preenche os valores
		stmt.setString(1,genero.getNome());
		stmt.setString(2,genero.getHabitat());
		stmt.setString(3,genero.getSubdivisao());
		
		// executa
		stmt.execute();
		stmt.close();
		System.out.println("Gravado!");
		
	}

	public List<Genero> buscaTodos() throws SQLException {

		List<Genero> generos = new ArrayList<>();
		Connection conexao = ConnectionFactory.getConexao();
		PreparedStatement stmt = conexao.prepareStatement("Select * from genero");
		ResultSet rs= stmt.executeQuery();
		
		while (rs.next()){
			// criando o objeto Especie
			Genero genero = new Genero();
			genero.setId(rs.getInt("id"));
			genero.setNome(rs.getString("nome"));
			genero.setSubdivisao(rs.getString("subdivisao"));
			
			
			// adicionando o objeto e lista
			generos.add(genero);
		}
		
		rs.close();
		stmt.close();
		return generos;
	}
	
	public void alterar(Genero genero) {
		String sql = "update Genero set id=? nome=?" + "where id=?";

		try {
			PreparedStatement stmt = getConexao().prepareStatement(sql);
			stmt.setString(1,genero.getNome());
			stmt.setInt(2, genero.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	private Connection getConexao() {
				return null;
	}
	public void deletar(Genero genero) {
		try {
			PreparedStatement stmt = getConexao().prepareStatement("delete from Genero where id=?");
			stmt.setLong(1, genero.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Genero buscaPorId(int id) {
		return null;

	}

	public void fechaConexao() {
		
		
	}


}



