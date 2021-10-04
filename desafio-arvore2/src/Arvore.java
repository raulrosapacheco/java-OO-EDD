

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
	
	//métodos de controle
	public boolean isEmpty() {
		return (this.ele == null);
	}
	
	public void inserir(Elemento novo) {
		if(isEmpty()) {
			this.ele = novo;
		} else {
			Arvore novaArvore = new Arvore(novo);
			if(novo.getValor() < this.ele.getValor()) { // vou inserir na descendencia esquerda
				if(this.esq == null) { //sou um nó folha?
					this.esq = novaArvore;
				} else {
					this.esq.inserir(novo); // repassei a responsabilidade para sub-arvore esquerda
				}
			} else if(novo.getValor() > this.ele.getValor()) { // vou inserir na descendencia direita
				if(this.dir == null) { //sou um nó folha?
					this.dir = novaArvore;					
				} else {
					this.dir.inserir(novo); // repassei a responsabilidade para sub-arvore direita
				}
			}
		}
	}
	
	public void consultarPreOrdem() {
		if (!isEmpty()) {
			System.out.print(this.ele.getValor() + " ");
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
	
	public void consultarPosOrdem() {
		if (!isEmpty()) {
			if (this.dir != null) {
				this.dir.consultarPosOrdem();
			}
			if (this.esq != null) {
				this.esq.consultarPosOrdem();
			}
			System.out.print(this.ele.getValor() + " ");
		}else {
			System.out.println("Arvore Vazia");
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
