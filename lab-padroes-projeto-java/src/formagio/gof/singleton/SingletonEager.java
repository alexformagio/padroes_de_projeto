package formagio.gof.singleton;

/**
 * Singletom apressado
 * @author Formagio
 */
public class SingletonEager {
	private static SingletonEager instancia = new SingletonEager();

	private SingletonEager() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
	
	

}
