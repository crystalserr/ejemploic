package ejemplomavenIC;

public class Calc {
	
	public int i;
	public int i1;

	public Calc(int i, int i1) {
		this.i = i;
		this.i1 = i1;
		
	}

	public Integer sumar() {
		return this.i + this.i1;
	}
	
	public Integer restar() {
		return this.i - this.i1;
	}

	public Integer multiplicar() {
		return this.i * this.i1;
	}
	
	public Integer dividir() {
		return this.i / this.i1;
	}
}
