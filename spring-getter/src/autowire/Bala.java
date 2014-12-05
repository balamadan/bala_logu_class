package autowire;

public class Bala {

	private Mala mala;
	private Vela vela;
	public Mala getMala() {
		return mala;
	}
	public void setMala(Mala mala) {
		this.mala = mala;
	}
	public Vela getVela() {
		return vela;
	}
	public void setVela(Vela vela) {
		this.vela = vela;
	}
	void print(){
		mala.print();
	}
}
