package inheritance;

public class VehicleAd {
    private String id;
    private String model;
    private VehicleTypeByPurpose vehicleTypeByPurpose;
    private VehicleTypeByBodyTypes vehicleTypeByBodyTypes;
    private VehicleTypeByFuelType vehicleTypeByFuelType;

    public VehicleAd(String model, String id, VehicleTypeByPurpose vehicleTypeByPurpose,
                     VehicleTypeByBodyTypes vehicleTypeByBodyTypes, VehicleTypeByFuelType vehicleTypeByFuelType) {
        this.model = model;
        this.id = id;
        this.vehicleTypeByPurpose = vehicleTypeByPurpose;
        this.vehicleTypeByBodyTypes = vehicleTypeByBodyTypes;
        this.vehicleTypeByFuelType = vehicleTypeByFuelType;
    }

    public VehicleTypeByPurpose getVehicleTypeByPurpose() {
        return vehicleTypeByPurpose;

    }
    public VehicleTypeByBodyTypes getVehicleTypeByBodyTypes() {
        return vehicleTypeByBodyTypes;
    }
    public VehicleTypeByFuelType getVehicleTypeByFuelType() {
        return vehicleTypeByFuelType;
    }
    public String getModel() {
        return model;
    }
    public String getId() {
        return id;
    }
    public String toString() {
        return this.model;
    }
}
