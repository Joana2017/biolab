package br.edu.ifpi.biolab.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifpi.biolab.entidade.Classe;


public class ClasseDao {
	
	public void adiciona(Classe classe) throws SQLException {
		new ConnectionFactory();
		// conectando
		Connection con = ConnectionFactory.getConexao();
		// cria um preparedStatement
		String sql = "insert into Classe" + " (nome,subclasse,divisoes,id_filo)" + " values (?,?,?)";
		PreparedStatement stmt = con.prepareStatement(sql);
		
		// preenche os valores
		stmt.setString(1,classe.getNome());
		stmt.setString(2,classe.getSubclasse());
		stmt.setString(3,classe.getDivisoes());
		
		

		// executa
		stmt.execute();
		stmt.close();
		System.out.println("Gravado!");
		con.close();
	}
	
	public List<Classe> buscaTodos() throws SQLException {

		List<Classe> classes = new ArrayList<>();
		Connection conexao = ConnectionFactory.getConexao();
		PreparedStatement stmt = conexao.prepareStatement("Select * from classe");
		ResultSet rs= stmt.executeQuery();
		
		while (rs.next()){
			// criando o objeto Especie
			Classe classe = new Classe();
			classe.setId(rs.getInt("id"));
			classe.setNome(rs.getString("nome"));
			
			
			
			
			// adicionando o objeto e lista
			classes.add(classe);
		}
		
		rs.close();
		stmt.close();
		return classes;
	}
	
	public void alterar(Classe classe) {
		String sql = "update Classe set id=? nome=?" + "where id=?";

		try {
			PreparedStatement stmt = getConexao().prepareStatement(sql);
			stmt.setString(1,classe.getNome());
			stmt.setInt(2, classe.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	private Connection getConexao() {
				return null;
	}
	public void deletar(Classe classe) {
		try {
			PreparedStatement stmt = getConexao().prepareStatement("delete from Classe where id=?");
			stmt.setLong(1, classe.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void fechaConexao() {
		
		
	}


}
