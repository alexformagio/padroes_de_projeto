package formagio.gof.strategy;

public class Robo {
	
	private Comportamento strategy;
	
	public void setComportamento(Comportamento comportamento) {
		this.strategy = comportamento;
	}
	
	public void move() {
		this.strategy.mover();
	}

}
