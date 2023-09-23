package inheritance;

public class DieselType extends VehicleTypeByFuelType{
    DieselType() {
        super(VehicleTypeEnum.DIESEL.name());
    }

    public String getTypeName() {
        return VehicleTypeEnum.DIESEL.name();
    }
}
