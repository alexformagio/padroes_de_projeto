package formagio.gof.singleton;

public class SingletonSync {
	// A instância estática privada
	private static SingletonSync instance;

	// Construtor privado
	private SingletonSync() {
		// TODO Auto-generated constructor stub
	}

	// Método público estático para obter a instância
	public static SingletonSync getInstance() {
		if (instance == null) {
			// Sincronização para suporte a multithreading
			synchronized (SingletonSync.class) {
				if (instance == null) {
					instance = new SingletonSync();
				}
			}
		}
		return instance;
	}
}