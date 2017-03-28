package br.edu.ifpi.biolab.visao;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import br.edu.ifpi.biolab.controle.OrdemControle;
import br.edu.ifpi.biolab.entidade.Ordem;

public class OrdemVisao {

	private static OrdemControle ordemControle;

	public OrdemVisao() {
		ordemControle = new OrdemControle();
	}
		public void adiciona(Ordem ordem) throws SQLException {
			ordemControle.adicionar(ordem);
		}

		public List<Ordem> buscaTodos() throws SQLException {
			List<Ordem> ordems = ordemControle.buscaTodos();
			return ordems;
		}

		public void alterar(Ordem ordem) throws SQLException {
			ordemControle.alterar(ordem);
		}

		public void deletar(Ordem ordem) throws SQLException {
			ordemControle.deletar(ordem);
		
	}

	public static void main(String[] args ) throws SQLException {
		OrdemVisao visao = new OrdemVisao();

		int opcaoEscolhida = 1;
		
		while(opcaoEscolhida != 0){
		
		String menu = " 1-Consultar:)\n 2-Adicionar: 0 3-alterar :} 4-deletar :,\n -Sair:( ";

		String valorDigitado = JOptionPane.showInputDialog(menu);

		opcaoEscolhida = Integer.parseInt(valorDigitado);

		switch (opcaoEscolhida) {
		case 1:
			List<Ordem> Ordems = visao.buscaTodosOrdems();
			String OrdemsTela = "";
			for (Ordem b : Ordems) {

				OrdemsTela = OrdemsTela + b.getId() + " - " + b.getNome() + "\n";

			}
			JOptionPane.showMessageDialog(null, OrdemsTela);
			break;
		case 2:
			String inserirOrdem = JOptionPane.showInputDialog("Digite o nome do Ordem.");
			Ordem r = new Ordem();
			r.setNome(inserirOrdem);
			visao.adiciona(r);
			JOptionPane.showMessageDialog(null, "Adicionado com sucesso ;)");
			break;
		case 3:
			String alterarOrdem = JOptionPane.showInputDialog("Alterar o nome do Ordem.");
			Ordem ordem = new Ordem();
			ordem.setNome(alterarOrdem);
			visao.alterar(ordem);
			break;

		case 4:
			String deletarOrdem = JOptionPane.showInputDialog("Alterar o nome do Ordem.");
			Ordem ordem1 = new Ordem();
			ordem1.setNome(deletarOrdem);
			visao.alterar(ordem1);
			break;
		
		}
	
		}
	}

	private List<Ordem> buscaTodosOrdems() throws SQLException {
		return ordemControle.buscaTodos();
	}

}

