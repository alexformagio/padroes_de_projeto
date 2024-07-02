package formagio.gof.factory;

public class Teste {

	public static void main(String[] args) {
		VehicleFactory factory = new CarFactory();
		Vehicle car = factory.orderVehicle();
		
		factory = new TruckFactory();
		Vehicle truck = factory.orderVehicle();

	}

}
