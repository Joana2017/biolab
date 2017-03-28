package br.edu.ifpi.biolab.visao;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import br.edu.ifpi.biolab.controle.FamiliaControle;
import br.edu.ifpi.biolab.entidade.Familia;

public class FamiliaVisao {
	
	private static FamiliaControle familiaControle;

	public FamiliaVisao() {
		familiaControle = new FamiliaControle();
	}
		public void adiciona(Familia familia) throws SQLException {
			familiaControle.adicionar(familia);
		}

		public List<Familia> buscaTodos() throws SQLException {
			List<Familia> familias = familiaControle.buscaTodos();
			return familias;
		}

		public void alterar(Familia familia) throws SQLException {
			familiaControle.alterar(familia);
		}

		public void deletar(Familia familia) throws SQLException {
			familiaControle.deletar(familia);
		
	}

	public static void main(String[] args ) throws SQLException {
		FamiliaVisao visao = new FamiliaVisao();

		int opcaoEscolhida = 1;
		
		while(opcaoEscolhida != 0){
		
		String menu = " 1-Consultar:)\n 2-Adicionar: 0 3-alterar :} 4-deletar :,\n -Sair:( ";

		String valorDigitado = JOptionPane.showInputDialog(menu);

		opcaoEscolhida = Integer.parseInt(valorDigitado);

		switch (opcaoEscolhida) {
		case 1:
			List<Familia> familias = visao.buscaTodosFamilias();
			String FamiliasTela = "";
			for (Familia b : familias) {

				FamiliasTela = FamiliasTela + b.getId() + " - " + b.getNome() + "\n";

			}
			JOptionPane.showMessageDialog(null, FamiliasTela);
			break;
		case 2:
			String inserirFamilia = JOptionPane.showInputDialog("Digite o nome do Familia.");
			Familia r = new Familia();
			r.setNome(inserirFamilia);
			visao.adiciona(r);
			JOptionPane.showMessageDialog(null, "Adicionado com sucesso ;)");
			break;
		case 3:
			String alterarFamilia = JOptionPane.showInputDialog("Alterar o nome do Familia.");
			Familia familia = new Familia();
			familia.setNome(alterarFamilia);
			visao.alterar(familia);
			break;

		case 4:
			String deletarFamilia = JOptionPane.showInputDialog("Alterar o nome do Familia.");
			Familia familia1 = new Familia();
			familia1.setNome(deletarFamilia);
			visao.alterar(familia1);
			break;
		
		}
	
		}
	}

	private List<Familia> buscaTodosFamilias() throws SQLException {
		return familiaControle.buscaTodos();
	}

	

}
