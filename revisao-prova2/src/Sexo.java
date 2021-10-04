
public enum Sexo {
	
	MASCULINO ("m", "masculino"),
	FEMININO ("f", "feminino");
	
	private String codigo;
	private String descricao;
	
	private Sexo(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public String obterDescricaoCompleta() {
		return codigo + " - " + descricao;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public static Sexo valueOfCodigo(String codigoSelecionado) {
		for (Sexo cargoOpcao : values()) {
			if (cargoOpcao.codigo.equals(codigoSelecionado)) {
				return cargoOpcao;
			}
		}
		return null;
	}

}
