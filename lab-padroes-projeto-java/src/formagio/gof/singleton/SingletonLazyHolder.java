package formagio.gof.singleton;

/**
 * Singletom "Lazy Holder"
 * @author Formagio
 */
public class SingletonLazyHolder {
	private static class Holder{
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}

	private SingletonLazyHolder() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static SingletonLazyHolder getInstancia() {
		return Holder.instancia;
	}
	
	

}
