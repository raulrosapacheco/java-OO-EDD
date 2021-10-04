package br.ucsal.bes20211.poo.atividade04.busines;

import br.ucsal.bes20211.poo.atividade04.domain.Veiculo;
import br.ucsal.bes20211.poo.atividade04.persistence.VeiculoDAO;

// BO = Business Object

public class VeiculoBO {
	
	//FIXME Não devemos retornar Boolean, devemos utilizar Exceptions
	
	public static Boolean cadastrar(Veiculo veiculo) {
		if(veiculo.placa == null || veiculo.anoFabricacao == null ||veiculo.anoFabricacao > 2021) {
			return false;
		}
		VeiculoDAO.persistir(veiculo);
		
		
		return true;
	}

}
