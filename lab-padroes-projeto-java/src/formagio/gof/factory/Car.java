package formagio.gof.factory;

public class Car implements Vehicle {

	@Override
	public void prepare() {
		System.out.println("Preparando Carro ...");

	}

	@Override
	public void assemble() {
		System.out.println("Fabricando Carro ...");

	}

	@Override
	public void test() {
		System.out.println("Testando Carro ...");

	}

}
