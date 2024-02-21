package creational.Factory;

public class VehicleFactory {
    public static Vehicle createVehicle(String type) {
        return new Vehicle(type);
    }
}
