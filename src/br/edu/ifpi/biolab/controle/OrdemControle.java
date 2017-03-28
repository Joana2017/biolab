package br.edu.ifpi.biolab.controle;

import java.sql.SQLException;
import java.util.List;

import br.edu.ifpi.biolab.dao.OrdemDao;
import br.edu.ifpi.biolab.entidade.Ordem;

public class OrdemControle {
	
	private OrdemDao ordemDao;

	public OrdemControle() {
		ordemDao = new OrdemDao();
	}

	public void adicionar(Ordem ordem) throws SQLException {
		ordemDao.adiciona(ordem);
		ordemDao.fechaConexao();
	}

	public List<Ordem> buscaTodos() throws SQLException {
		List<Ordem> ordens = ordemDao.buscaTodos();
		ordemDao.fechaConexao();
		return ordens;

	}

	public void alterar(Ordem ordem) {
		ordemDao.alterar(ordem);
		ordemDao.fechaConexao();
	}

	public void deletar(Ordem ordem) throws SQLException {
		ordemDao.deletar(ordem);
		ordemDao.fechaConexao();

	}
}
