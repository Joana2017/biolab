package br.edu.ifpi.biolab.visao;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import br.edu.ifpi.biolab.controle.ReinoControle;
import br.edu.ifpi.biolab.entidade.Reino;

public class ReinoVisao {

	private static ReinoControle reinoControle;

	public ReinoVisao() {
		reinoControle = new ReinoControle();
	}
		public void adiciona(Reino reino) throws SQLException {
			reinoControle.adicionar(reino);
		}

		public List<Reino> buscaTodos() throws SQLException {
			List<Reino> reinos = reinoControle.buscaTodos();
			return reinos;
		}

		public void alterar(Reino reino) throws SQLException {
			reinoControle.altera(reino);
		}

		public void deletar(Reino reino) throws SQLException {
			reinoControle.deletar(reino);
		
	}

	public static void main(String[] args ) throws SQLException {
		ReinoVisao visao = new ReinoVisao();

		int opcaoEscolhida = 1;
		
		while(opcaoEscolhida != 0){
		
		String menu = " 1-Consultar:)\n 2-Adicionar: 0 3-alterar :} 4-deletar :,\n -Sair:( ";

		String valorDigitado = JOptionPane.showInputDialog(menu);

		opcaoEscolhida = Integer.parseInt(valorDigitado);

		switch (opcaoEscolhida) {
		case 1:
			List<Reino> reinos = visao.buscaTodosReinos();
			String reinosTela = "";
			for (Reino b : reinos) {

				reinosTela = reinosTela + b.getId() + " - " + b.getNome() + "\n";

			}
			JOptionPane.showMessageDialog(null, reinosTela);
			break;
		case 2:
			String inserirReino = JOptionPane.showInputDialog("Digite o nome do Reino.");
			Reino r = new Reino();
			r.setNome(inserirReino);
			visao.adiciona(r);
			JOptionPane.showMessageDialog(null, "Adicionado com sucesso ;)");
			break;
		case 3:
			String alterarReino = JOptionPane.showInputDialog("Alterar o nome do Reino.");
			Reino reino = new Reino();
			reino.setNome(alterarReino);
			visao.alterar(reino);
			break;

		case 4:
			String deletarReino = JOptionPane.showInputDialog("Alterar o nome do Reino.");
			Reino reino1 = new Reino();
			reino1.setNome(deletarReino);
			visao.alterar(reino1);
			break;
		
		}
	
		}
	}

	private List<Reino> buscaTodosReinos() throws SQLException {
		return reinoControle.buscaTodos();
	}


}
