package formagio.gof.factory;

public class TruckFactory extends VehicleFactory {
	@Override
	public Vehicle createVehicle() {
		return new Truck();
	}
}
