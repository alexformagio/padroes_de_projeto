package formagio.gof.factory;

public abstract class VehicleFactory {
	// Método fábrica abstrato
	public abstract Vehicle createVehicle();

	public Vehicle orderVehicle() {
		Vehicle vehicle = createVehicle();
		vehicle.prepare();
		vehicle.assemble();
		vehicle.test();
		return vehicle;
	}
}
