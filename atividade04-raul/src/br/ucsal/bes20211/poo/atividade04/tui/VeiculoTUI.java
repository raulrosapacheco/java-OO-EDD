package br.ucsal.bes20211.poo.atividade04.tui;

import java.util.Scanner;

import br.ucsal.bes20211.poo.atividade04.busines.VeiculoBO;
import br.ucsal.bes20211.poo.atividade04.domain.Veiculo;

public class VeiculoTUI {
	
	static final Scanner scanner = new Scanner(System.in);
	
	static void cadastrar() {
		
		System.out.println("################## CADASTRO DE VEICULOS ###################");
		
		String placa;
		Integer anoFabricacao;
		Double valor;
		
		System.out.println("Informe os dados do veiculo:");
		
		System.out.println("Placa: ");
		placa = scanner.nextLine();
		
		System.out.println("Ano de Fabricação: ");
		anoFabricacao = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Valor: ");
		valor = scanner.nextDouble();
		scanner.nextLine();
		
		Veiculo veiculo = new Veiculo();
		veiculo.placa = placa;
		veiculo.anoFabricacao = anoFabricacao;
		veiculo.valor = valor;
		
		if(VeiculoBO.cadastrar(veiculo)) {
			System.out.println("Cadastro realizado com sucesso");
		}else {
			System.out.println("Erro no cadastro do veículo");
		}
		
	}

}
