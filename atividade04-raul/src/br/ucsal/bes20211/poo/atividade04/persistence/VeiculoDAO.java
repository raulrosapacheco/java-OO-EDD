package br.ucsal.bes20211.poo.atividade04.persistence;

import br.ucsal.bes20211.poo.atividade04.domain.Veiculo;

//DAO = Data Acess Object

// Como não estudamos tecnicas de armazenamento de dados no disco faremos uma pesistencia fake armazenando os dados em memória.

public class VeiculoDAO {
	
	private static final int QTD_MAX_VEICULOS = 100;
	
	static Veiculo[] veiculos = new Veiculo[QTD_MAX_VEICULOS];
	static int qtd = 0;
	
	public static void persistir(Veiculo veiculo) {
		veiculos[qtd] = veiculo;
		qtd++;
	}

}
