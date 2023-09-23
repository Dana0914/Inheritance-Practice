package inheritance;

public class TruckType extends VehicleTypeByPurpose{
    TruckType() {
        super(VehicleTypeEnum.PICKUP.name());
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.TRUCK.name();
    }
}
