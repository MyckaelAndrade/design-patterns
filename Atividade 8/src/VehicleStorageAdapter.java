package src;
public class VehicleStorageAdapter implements IVehicleStorage {
    private OldVehicleStorage oldStorage;

    public VehicleStorageAdapter(OldVehicleStorage oldStorage) {
        this.oldStorage = oldStorage;
    }

    @Override
    public void saveVehicleData(Vehicle vehicle) {
        // Adaptação do objeto Vehicle para string
        String formattedData = "ID: " + vehicle.getId() + 
                               ", Modelo: " + vehicle.getModel() + 
                               ", Ano: " + vehicle.getYear();
        oldStorage.storeVehicleData(formattedData);
    }
}
