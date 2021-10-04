package arvore;

public class Arvore {
	private Elemento ele;
	private Arvore dir;
	private Arvore esq;
	private int contImpar = 0;
	private int contPrimos = 0;
	
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
	
	public void consultarPosOrdem() {
		if (!isEmpty()) {
			if (this.dir != null) {
				this.dir.consultarPosOrdem();
			}
			if (this.esq != null) {
				this.esq.consultarPosOrdem();
			}
			System.out.print(this.ele.getValor() + " ");
		}
	}
	
	public void consultarImpares() {
		if(!isEmpty()) {
			if(this.ele.getValor() % 2 != 0) {
				System.out.print(this.ele.getValor() + " ");
				contImpar++;
			} 
			if(this.esq != null) {
				this.esq.consultarImpares();						
			}			
			if(this.dir != null) {
				this.dir.consultarImpares();				
			}
		}
	}
	
	public void consultarPrimos() {
		if(!isEmpty()) {
			if(verificarPrimo(this.ele.getValor())) {
				System.out.print(this.ele.getValor() + " ");
				contPrimos++;
			} 
			if(this.esq != null) {
				this.esq.consultarPrimos();						
			}
			if(this.dir != null) {
				this.dir.consultarPrimos();				
			}
		}
	}
	
	private boolean verificarPrimo(int numero) {
	    for (int j = 2; j < numero; j++) {
	        if (numero % j == 0)
	            return false;   
	    }
	    return true;
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
	
	public int getContImpar() {
		return contImpar;
	}
	
	public int getContPrimos() {
		return contPrimos;
	}
}
