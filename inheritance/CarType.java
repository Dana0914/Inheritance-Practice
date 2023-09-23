package inheritance;

public class CarType extends VehicleTypeByPurpose{
    CarType() {
        super(VehicleTypeEnum.CAR.name());
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.CAR.name();
    }
}
