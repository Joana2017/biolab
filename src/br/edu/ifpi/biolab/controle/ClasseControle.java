package br.edu.ifpi.biolab.controle;

import java.sql.SQLException;
import java.util.List;

import br.edu.ifpi.biolab.dao.ClasseDao;
import br.edu.ifpi.biolab.entidade.Classe;


public class ClasseControle {
	
	private ClasseDao classeDao;

	public ClasseControle() {
		classeDao = new ClasseDao();
	}

	public void adicionar(Classe classe) throws SQLException {
		classeDao.adiciona(classe);
		classeDao.fechaConexao();
	}

	public List<Classe> buscaTodos() throws SQLException {
		List<Classe> classes = classeDao.buscaTodos();
		classeDao.fechaConexao();
		return null;
		

	}

	public void alterar(Classe classe) {
		classeDao.alterar(classe);
		classeDao.fechaConexao();
	}

	public void deletar(Classe classe) throws SQLException {
		classeDao.deletar(classe);
		classeDao.fechaConexao();

	}


}
