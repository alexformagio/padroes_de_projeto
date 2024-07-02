package formagio.gof.factory;

public class CarFactory extends VehicleFactory {
	@Override
	public Vehicle createVehicle() {
		return new Car();
	}
}