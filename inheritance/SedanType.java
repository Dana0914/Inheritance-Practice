package inheritance;

public class SedanType extends VehicleTypeByBodyTypes{
    public SedanType() {
        super(VehicleTypeEnum.SEDAN.name());
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.SEDAN.name();
    }
}
