package br.edu.ifpi.biolab.controle;

import java.sql.SQLException;
import java.util.List;

import br.edu.ifpi.biolab.dao.GeneroDao;
import br.edu.ifpi.biolab.entidade.Genero;

public class GeneroControle {
	
	private GeneroDao generoDao;

	public GeneroControle() {
		generoDao = new GeneroDao();
	}

	public void adicionar(Genero Genero) throws SQLException {
		generoDao.adiciona(Genero);
		generoDao.fechaConexao();
	}

	public List<Genero> buscaTodos() throws SQLException {
		List<Genero> generos = generoDao.buscaTodos();
		generoDao.fechaConexao();
		return generos;

	}

	public void alterar(Genero genero) {
		generoDao.alterar(genero);
		generoDao.fechaConexao();
	}

	public void deletar(Genero genero) throws SQLException {
		generoDao.deletar(genero);
		generoDao.fechaConexao();

	}

}
