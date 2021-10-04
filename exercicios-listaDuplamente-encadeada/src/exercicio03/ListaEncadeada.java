package exercicio03;

public class ListaEncadeada {

	private Celula primeira = null;
	private Celula ultima = null;
	private int totalDeElementos = 0;

	public void incluirNoFim(Aluno aluno) {
		if (this.totalDeElementos == 0) {
			incluirNoComeco(aluno);
		} else {
			Celula nova = new Celula(aluno);
			this.ultima.setProxima(nova);
			nova.setAnterior(this.ultima);
			this.ultima = nova;
			this.totalDeElementos++;
		}

	}

	public void incluirNoComeco(Aluno aluno) {
		if (this.totalDeElementos == 0) {
			Celula nova = new Celula(aluno);
			this.primeira = nova;
			this.ultima = nova;
		} else {
			Celula nova = new Celula(aluno, this.primeira);
			this.primeira.setAnterior(nova);
			this.primeira = nova;
		}
		this.totalDeElementos++;

	}

	public String toString() {

		if (this.totalDeElementos == 0) {
			return "[]";
		}

		Celula atual = this.primeira;

		StringBuilder builder = new StringBuilder("[");

		for (int i = 0; i < totalDeElementos; i++) {
			builder.append("nome: " + atual.getAluno().getNome() + " - idade: " + atual.getAluno().getIdade());
			if (i < totalDeElementos - 1) {
				builder.append(", ");
			}

			atual = atual.getProxima();
		}

		builder.append("]");

		return builder.toString();
	}

}
