package arvores;

public class Arvore {
	private Elemento ele;
	private Arvore dir;
	private Arvore esq;

	public Arvore() {
	}

	public Arvore(Elemento ele) {
		this.ele = ele;
		this.dir = null;
		this.esq = null;
	}

	// métodos de controle
	public boolean isEmpty() {
		return (this.ele == null);
	}

	public void imprimirPreOrdem() {
		if (!isEmpty()) {
			System.out.print(this.ele.getValor() + " ");
			if (this.esq != null) {
				this.esq.imprimirPreOrdem();
			}
			if (this.dir != null) {
				this.dir.imprimirPreOrdem();
			}
		}
	}

	public void imprimirInOrdem() {
		if (!isEmpty()) {
			if (this.esq != null) {
				this.esq.imprimirInOrdem();
			}
		}
		System.out.print(this.ele.getValor() + " ");
		if (this.dir != null) {
			this.dir.imprimirInOrdem();
		}

	}

	public void imprimirPosOrdem() {
		if (!isEmpty()) {
			if (this.dir != null) {
				this.dir.imprimirPosOrdem();
			}
			if (this.esq != null) {
				this.esq.imprimirPosOrdem();
			}
			System.out.print(this.ele.getValor() + " ");
		}
	}

//	public void imprimirInOrdemInversa() {
//		if (!isEmpty()) {
//			if (this.dir != null) {
//				this.dir.imprimirInOrdem();
//			}
//		}
//		System.out.print(this.ele.getValor() + " ");
//		if (this.esq != null) {
//			this.esq.imprimirInOrdem();
//		}
//	}

	public void inserir(Elemento novo) {
		if (isEmpty()) {
			this.ele = novo;
		} else {
			Arvore novaArvore = new Arvore(novo);
			if (novo.getValor() < this.ele.getValor()) { // vou inserir na descendencia esquerda
				if (this.esq == null) { // sou um nó folha?
					this.esq = novaArvore;
				} else {
					this.esq.inserir(novo); // repassei a responsabilidade para sub-arvore esquerda
				}
			} else if (novo.getValor() > this.ele.getValor()) { // vou inserir na descendencia direita
				if (this.dir == null) { // sou um nó folha?
					this.dir = novaArvore;
				} else {
					this.dir.inserir(novo); // repassei a responsabilidade para sub-arvore direita
				}
			}
		}
	}

	public boolean busca(int valor) {
		if (isEmpty()) {
			return false;
		}
		if (this.ele.getValor() == valor) {
			return true;
		} else {
			if (valor < this.ele.getValor()) {
				if (this.esq == null) {
					return false;
				} else {
					return this.esq.busca(valor); // repassei a responsabilidade para sub-arvore esquerda
				}
			} else if (valor > this.ele.getValor()) {
				if (this.dir == null) {
					return false;
				} else {
					return this.dir.busca(valor); // repassei a responsabilidade para sub-arvore direita
				}
			}
			return false;
		}
	}

	public Elemento getEle() {
		return ele;
	}

	public void setEle(Elemento ele) {
		this.ele = ele;
	}

	public Arvore getDir() {
		return dir;
	}

	public void setDir(Arvore dir) {
		this.dir = dir;
	}

	public Arvore getEsq() {
		return esq;
	}

	public void setEsq(Arvore esq) {
		this.esq = esq;
	}

}
