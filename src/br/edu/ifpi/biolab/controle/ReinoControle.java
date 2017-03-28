package br.edu.ifpi.biolab.controle;

import java.sql.SQLException;
import java.util.List;

import br.edu.ifpi.biolab.dao.ReinoDao;
import br.edu.ifpi.biolab.entidade.Reino;

public class ReinoControle {
	
	private ReinoDao reinoDao;

	public ReinoControle() {
		reinoDao = new ReinoDao();
	}

	public void adicionar(Reino reino) throws SQLException {
		reinoDao.adicionar(reino);
		reinoDao.fechaConexao();
	}

	public List<Reino> buscaTodos() throws SQLException {
		List<Reino> reinos = reinoDao.buscaTodos();
		reinoDao.fechaConexao();
		return reinos;

	}

	public void altera(Reino reino) {
		reinoDao.alterar(reino);
		reinoDao.fechaConexao();
	}

	public void deletar(Reino reino) throws SQLException {
		reinoDao.deletar(reino);
		reinoDao.fechaConexao();

	}
}