package br.edu.ifpi.biolab.controle;

import java.sql.SQLException;
import java.util.List;

import br.edu.ifpi.biolab.dao.EspecieDao;
import br.edu.ifpi.biolab.entidade.Especie;

public class EspecieControle {

	private EspecieDao especieDao;

	public EspecieControle() {
		especieDao = new EspecieDao();
	}

	public void adicionar(Especie especie) throws SQLException {
		especieDao.adiciona(especie);
		especieDao.fechaConexao();
	}

	public List<Especie> buscaTodos() throws SQLException {
		List<Especie> especies = especieDao.buscaTodos();
		especieDao.fechaConexao();
		return null;

	}

	public void alterar(Especie especie) {
		especieDao.alterar(especie);
		especieDao.fechaConexao();
	}

	public void deletar(Especie especie) throws SQLException {
		especieDao.deletar(especie);
		especieDao.fechaConexao();

	}

	public List<Especie> buscarTodos() {
		return null;
	}

}
