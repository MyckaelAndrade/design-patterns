package src;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("123ABC", "Volvo FH", 2020);

        OldVehicleStorage oldStorage = new OldVehicleStorage();

        // Usando o Adapter
        IVehicleStorage adapter = new VehicleStorageAdapter(oldStorage);
        adapter.saveVehicleData(vehicle);
    }
}
