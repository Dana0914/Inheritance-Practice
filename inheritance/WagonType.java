package inheritance;

public class WagonType extends VehicleTypeByPurpose{
    WagonType() {
        super(VehicleTypeEnum.WAGON.name());
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.WAGON.name();
    }
}
