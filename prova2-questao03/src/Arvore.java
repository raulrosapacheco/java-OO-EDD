
public class Arvore {
	private Integer ele;
	private Arvore dir;
	private Arvore esq;

	public Arvore() {
	}

	public Arvore(Integer ele) {
		this.ele = ele;
		this.dir = null;
		this.esq = null;
	}

	// métodos de controle
	public boolean isEmpty() {
		return (this.ele == null);
	}

	public void inserir(Integer novo) {
		if (isEmpty()) {
			this.ele = novo;
		} else {
			Arvore novaArvore = new Arvore(novo);
			if (novo < this.ele) { // vou inserir na descendencia esquerda
				if (this.esq == null) { // sou um nó folha?
					this.esq = novaArvore;
				} else {
					this.esq.inserir(novo); // repassei a responsabilidade para sub-arvore esquerda
				}
			} else if (novo > this.ele) { // vou inserir na descendencia direita
				if (this.dir == null) { // sou um nó folha?
					this.dir = novaArvore;
				} else {
					this.dir.inserir(novo); // repassei a responsabilidade para sub-arvore direita
				}
			}
		}

	}

	public void consultarPreOrdem() {
		if (!isEmpty()) {
			System.out.print(this.ele + " ");
			if (this.esq != null) {
				this.esq.consultarPreOrdem();
			}
			if (this.dir != null) {
				this.dir.consultarPreOrdem();
			}
		} else {
			System.out.println("Arvore Vazia");
		}
	}

}
