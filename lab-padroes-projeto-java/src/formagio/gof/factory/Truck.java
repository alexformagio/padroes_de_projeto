package formagio.gof.factory;

public class Truck implements Vehicle {

	@Override
	public void prepare() {
		System.out.println("Preparando caminhão");

	}

	@Override
	public void assemble() {
		System.out.println("Fabricando caminhão");

	}

	@Override
	public void test() {
		System.out.println("Testando caminhão");

	}

}
