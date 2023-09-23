package inheritance;

public class ElectricType extends VehicleTypeByFuelType{
    ElectricType() {
        super(VehicleTypeEnum.ELECTRIC.name());
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.ELECTRIC.name();
    }
}
