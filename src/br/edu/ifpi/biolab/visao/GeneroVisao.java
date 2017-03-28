package br.edu.ifpi.biolab.visao;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import br.edu.ifpi.biolab.controle.GeneroControle;
import br.edu.ifpi.biolab.entidade.Genero;

public class GeneroVisao {

	private static GeneroControle generoControle;

	public GeneroVisao() {
		generoControle = new GeneroControle();
	}
		public void adiciona(Genero genero) throws SQLException {
			generoControle.adicionar(genero);
		}

		public List<Genero> buscaTodos() throws SQLException {
			List<Genero> generos = generoControle.buscaTodos();
			return generos;
		}

		public void alterar(Genero genero) throws SQLException {
			generoControle.alterar(genero);
		}

		public void deletar(Genero genero) throws SQLException {
			generoControle.deletar(genero);
		
	}

	public static void main(String[] args ) throws SQLException {
		GeneroVisao visao = new GeneroVisao();

		int opcaoEscolhida = 1;
		
		while(opcaoEscolhida != 0){
		
		String menu = " 1-Consultar:)\n 2-Adicionar: 0 3-alterar :} 4-deletar :,\n -Sair:( ";

		String valorDigitado = JOptionPane.showInputDialog(menu);

		opcaoEscolhida = Integer.parseInt(valorDigitado);

		switch (opcaoEscolhida) {
		case 1:
			List<Genero> generos = visao.buscaTodosGeneros();
			String GenerosTela = "";
			for (Genero b : generos) {

				GenerosTela = GenerosTela + b.getId() + " - " + b.getNome() + "\n";

			}
			JOptionPane.showMessageDialog(null, GenerosTela);
			break;
		case 2:
			String inserirGenero = JOptionPane.showInputDialog("Digite o nome do Genero.");
			Genero r = new Genero();
			r.setNome(inserirGenero);
			visao.adiciona(r);
			JOptionPane.showMessageDialog(null, "Adicionado com sucesso ;)");
			break;
		case 3:
			String alterarGenero = JOptionPane.showInputDialog("Alterar o nome do Genero.");
			Genero genero = new Genero();
			genero.setNome(alterarGenero);
			visao.alterar(genero);
			break;

		case 4:
			String deletarGenero = JOptionPane.showInputDialog("Alterar o nome do Genero.");
			Genero genero1 = new Genero();
			genero1.setNome(deletarGenero);
			visao.alterar(genero1);
			break;
		
		}
	
		}
	}

	private List<Genero> buscaTodosGeneros() throws SQLException {
		return generoControle.buscaTodos();
	}

}