package br.edu.ifpi.biolab.visao;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import br.edu.ifpi.biolab.controle.FiloControle;
import br.edu.ifpi.biolab.entidade.Filo;

public class FiloVisao {

	private static FiloControle filoControle;

	public FiloVisao() {
		filoControle = new FiloControle();
	}
		public void adiciona(Filo filo) throws SQLException {
			filoControle.adicionar(filo);
		}

		public List<Filo> buscaTodos() throws SQLException {
			List<Filo> filos = filoControle.buscaTodos();
			return filos;
		}

		public void alterar(Filo filo) throws SQLException {
			filoControle.alterar(filo);
		}

		public void deletar(Filo filo) throws SQLException {
			filoControle.deletar(filo);
		
	}

	public static void main(String[] args ) throws SQLException {
		FiloVisao visao = new FiloVisao();

		int opcaoEscolhida = 1;
		
		while(opcaoEscolhida != 0){
		
		String menu = " 1-Consultar:)\n 2-Adicionar: 0 3-alterar :} 4-deletar :,\n -Sair:( ";

		String valorDigitado = JOptionPane.showInputDialog(menu);

		opcaoEscolhida = Integer.parseInt(valorDigitado);

		switch (opcaoEscolhida) {
		case 1:
			List<Filo> filos = visao.buscaTodosFilos();
			String FilosTela = "";
			for (Filo b : filos) {

				FilosTela = FilosTela + b.getId() + " - " + b.getNome() + "\n";

			}
			JOptionPane.showMessageDialog(null, FilosTela);
			break;
		case 2:
			String inserirFilo = JOptionPane.showInputDialog("Digite o nome do Filo.");
			Filo r = new Filo();
			r.setNome(inserirFilo);
			visao.adiciona(r);
			JOptionPane.showMessageDialog(null, "Adicionado com sucesso ;)");
			break;
		case 3:
			String alterarFilo = JOptionPane.showInputDialog("Alterar o nome do Filo.");
			Filo filo = new Filo();
			filo.setNome(alterarFilo);
			visao.alterar(filo);
			break;

		case 4:
			String deletarFilo = JOptionPane.showInputDialog("Alterar o nome do Filo.");
			Filo filo1 = new Filo();
			filo1.setNome(deletarFilo);
			visao.alterar(filo1);
			break;
		
		}
	
		}
	}

	private List<Filo> buscaTodosFilos() throws SQLException {
		return filoControle.buscaTodos();
	}

	
}
