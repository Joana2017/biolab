package br.edu.ifpi.biolab.visao;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import br.edu.ifpi.biolab.controle.ClasseControle;
import br.edu.ifpi.biolab.entidade.Classe;

public class ClasseVisao {

	private static ClasseControle classeControle;

	public ClasseVisao() {
		classeControle = new ClasseControle();
	}
		public void adiciona(Classe classe) throws SQLException {
			classeControle.adicionar(classe);
		}

		public List<Classe> buscaTodos() throws SQLException {
			List<Classe> classes = classeControle.buscaTodos();
			return classes;
		}

		public void alterar(Classe classe) throws SQLException {
			classeControle.alterar(classe);
		}

		public void deletar(Classe classe) throws SQLException {
			classeControle.deletar(classe);
		
	}

	public static void main(String[] args ) throws SQLException {
		ClasseVisao visao = new ClasseVisao();

		int opcaoEscolhida = 1;
		
		while(opcaoEscolhida != 0){
		
		String menu = " 1-Consultar:)\n 2-Adicionar: 0 3-alterar :} 4-deletar :,\n -Sair:( ";

		String valorDigitado = JOptionPane.showInputDialog(menu);

		opcaoEscolhida = Integer.parseInt(valorDigitado);

		switch (opcaoEscolhida) {
		case 1:
			List<Classe> classes = visao.buscaTodosClasses();
			String ClassesTela = "";
			for (Classe b : classes) {

				ClassesTela = ClassesTela + b.getId() + " - " + b.getNome() + "\n";

			}
			JOptionPane.showMessageDialog(null, ClassesTela);
			break;
		case 2:
			String inserirClasse = JOptionPane.showInputDialog("Digite o nome do Classe.");
			Classe r = new Classe();
			r.setNome(inserirClasse);
			visao.adiciona(r);
			JOptionPane.showMessageDialog(null, "Adicionado com sucesso ;)");
			break;
		case 3:
			String alterarClasse = JOptionPane.showInputDialog("Alterar o nome do Classe.");
			Classe classe = new Classe();
			classe.setNome(alterarClasse);
			visao.alterar(classe);
			break;

		case 4:
			String deletarClasse = JOptionPane.showInputDialog("Alterar o nome do Classe.");
			Classe classe1 = new Classe();
			classe1.setNome(deletarClasse);
			visao.alterar(classe1);
			break;
		
		}
	
		}
	}

	private List<Classe> buscaTodosClasses() throws SQLException {
		return classeControle.buscaTodos();
	}

	
}

