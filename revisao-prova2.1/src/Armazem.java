import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Armazem {
	
	private Integer ele;
	private Armazem dir;
	private Armazem esq;
	private static Stack<Integer> pilha = new Stack<Integer>();
	private static Queue<Integer> fila = new LinkedList<Integer>();
	
	public Armazem() {
	}
	
	public Armazem(Integer ele) {
		this.ele = ele;
		this.dir = null;
		this.esq = null;
	}
	
	
	//métodos de controle
	public boolean isEmpty() {
		return (this.ele == null);
	}
	
	public void inserirNaPilhaFila(Integer novo) {
		if(novo == 1) {
			fila.add(novo);
		} else if((novo % 2) == 0) {
			pilha.push(novo);
			} else {
				fila.add(novo);
			}
	}
	
	public void inserirNaArvore(Integer novo) {
		if(isEmpty()) {
			this.ele = novo;
		} else {
			Armazem novaArmazem = new Armazem(novo);
			if(novo < this.ele) { // vou inserir na descendencia esquerda
				if(this.esq == null) { //sou um nó folha?
					this.esq = novaArmazem;
				} else {
					this.esq.inserirNaArvore(novo); // repassei a responsabilidade para sub-arvore esquerda
				}
			} else if(novo > this.ele) { // vou inserir na descendencia direita
				if(this.dir == null) { //sou um nó folha?
					this.dir = novaArmazem;					
				} else {
					this.dir.inserirNaArvore(novo); // repassei a responsabilidade para sub-arvore direita
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
			System.out.println("Armazem Vazia");
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
			System.out.print(this.ele+ " ");
		}else {
			System.out.println("Armazem Vazia");
		}
	}	

	public Integer getEle() {
		return ele;
	}

	public void setEle(Integer ele) {
		this.ele = ele;
	}

	public Armazem getDir() {
		return dir;
	}

	public void setDir(Armazem dir) {
		this.dir = dir;
	}

	public Armazem getEsq() {
		return esq;
	}

	public void setEsq(Armazem esq) {
		this.esq = esq;
	}

	public Stack<Integer> getPilha() {
		return pilha;
	}

	public Queue<Integer> getFila() {
		return fila;
	}
	
}
