package formagio.gof.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		SingletonLazy sLazy = SingletonLazy.getInstancia();
		System.out.println(sLazy);
		sLazy = SingletonLazy.getInstancia();
		System.out.println(sLazy);
		
		SingletonEager sEager = SingletonEager.getInstancia();
		System.out.println(sEager);
		sEager = SingletonEager.getInstancia();
		System.out.println(sEager);
		
		SingletonLazyHolder sLHolder = SingletonLazyHolder.getInstancia();
		System.out.println(sLHolder);
		sLHolder = SingletonLazyHolder.getInstancia();
		System.out.println(sLHolder);
		
		SingletonSync sSync = SingletonSync.getInstance();
		System.out.println(sSync);
		sSync = SingletonSync.getInstance();
		System.out.println(sSync);
	}

}
