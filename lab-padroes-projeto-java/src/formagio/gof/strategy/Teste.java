package formagio.gof.strategy;

public class Teste {

	public static void main(String[] args) {
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		Comportamento normal = new ComportamentoNormal();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.move();
		
		robo.setComportamento(agressivo);
		robo.move();
		
		robo.setComportamento(defensivo);
		robo.move();

	}

}
