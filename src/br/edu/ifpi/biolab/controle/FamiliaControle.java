package br.edu.ifpi.biolab.controle;

import java.sql.SQLException;
import java.util.List;

import br.edu.ifpi.biolab.dao.FamiliaDao;
import br.edu.ifpi.biolab.entidade.Familia;


public class FamiliaControle {
	
	private FamiliaDao familiaDao;

	public FamiliaControle() {
		familiaDao = new FamiliaDao();
	}

	public void adicionar(Familia familia) throws SQLException {
		familiaDao.adiciona(familia);
		familiaDao.fechaConexao();
	}

	public List<Familia> buscaTodos() throws SQLException {
		familiaDao.buscaTodos();
		familiaDao.fechaConexao();
		return null;
		

	}

	public void alterar(Familia familia) {
		familiaDao.alterar(familia);
		familiaDao.fechaConexao();
	}

	public void deletar(Familia familia) throws SQLException {
		familiaDao.deletar(familia);
		familiaDao.fechaConexao();

	}

}
