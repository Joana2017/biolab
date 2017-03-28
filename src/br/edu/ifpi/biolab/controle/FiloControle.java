package br.edu.ifpi.biolab.controle;

import java.sql.SQLException;
import java.util.List;

import br.edu.ifpi.biolab.dao.FiloDao;
import br.edu.ifpi.biolab.entidade.Filo;


public class FiloControle {
	
	private FiloDao filoDao;

	public FiloControle() {
		filoDao = new FiloDao();
	}

	public void adicionar(Filo filo) throws SQLException {
		filoDao.adiciona(filo);
		filoDao.fechaConexao();
	}

	public List<Filo> buscaTodos() throws SQLException {
		List<Filo> filos = filoDao.buscaTodos();
		filoDao.fechaConexao();
		return filos;

	}

	public void alterar(Filo filo) {
		filoDao.alterar(filo);
		filoDao.fechaConexao();
	}

	public void deletar(Filo filo) throws SQLException {
		filoDao.adiciona(filo);
		filoDao.fechaConexao();

	}
}
