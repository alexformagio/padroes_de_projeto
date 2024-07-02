package formagio.gof.singleton;

/**
 * Singletom Preguiçoso
 * @author Formagio
 */
public class SingletonLazy {
	private static SingletonLazy instancia;

	private SingletonLazy() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static SingletonLazy getInstancia() {
		if(instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
	
	

}
