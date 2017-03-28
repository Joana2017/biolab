package br.edu.ifpi.biolab.visao;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import br.edu.ifpi.biolab.controle.EspecieControle;
import br.edu.ifpi.biolab.entidade.Especie;

public class EspecieVisao {
	

	private static EspecieControle especieControle;

	public EspecieVisao() {
		especieControle = new EspecieControle();
	}
		public void adiciona(Especie especie) throws SQLException {
			especieControle.adicionar(especie);
		}

		public List<Especie> buscaTodos() throws SQLException {
			List<Especie> especies = especieControle.buscarTodos();
			return especies;
		}

		public void alterar(Especie especie) throws SQLException {
			especieControle.alterar(especie);
		}

		public void deletar(Especie especie) throws SQLException {
			especieControle.deletar(especie);
		
	}

	public static void main(String[] args ) throws SQLException {
		EspecieVisao visao = new EspecieVisao();

		int opcaoEscolhida = 1;
		
		while(opcaoEscolhida != 0){
		
		String menu = " 1-Consultar:)\n 2-Adicionar: 0 3-alterar :} 4-deletar :,\n -Sair:( ";

		String valorDigitado = JOptionPane.showInputDialog(menu);

		opcaoEscolhida = Integer.parseInt(valorDigitado);

		switch (opcaoEscolhida) {
		case 1:
			List<Especie> especies = visao.buscaTodosEspecies();
			String EspeciesTela = "";
			for (Especie b : especies) {

				EspeciesTela = EspeciesTela + b.getId() + " - " + b.getNomeComum() + "\n";

			}
			JOptionPane.showMessageDialog(null, EspeciesTela);
			break;
		case 2:
			String inserirEspecie = JOptionPane.showInputDialog("Digite o nome do Especie.");
			Especie r = new Especie();
			r.setNome(inserirEspecie);
			visao.adiciona(r);
			JOptionPane.showMessageDialog(null, "Adicionado com sucesso ;)");
			break;
		case 3:
			String alterarEspecie = JOptionPane.showInputDialog("Alterar o nome do Especie.");
			Especie especie = new Especie();
			especie.setNome(alterarEspecie);
			visao.alterar(especie);
			break;

		case 4:
			String deletarEspecie = JOptionPane.showInputDialog("Alterar o nome do Especie.");
			Especie especie1 = new Especie();
			especie1.setNome(deletarEspecie);
			visao.alterar(especie1);
			break;
		
		}
	
		}
	}

	private List<Especie> buscaTodosEspecies() throws SQLException {
		return especieControle.buscarTodos();
	}

	
	

}
