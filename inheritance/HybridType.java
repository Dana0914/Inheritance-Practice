package inheritance;

public class HybridType extends VehicleTypeByFuelType{
    HybridType() {
        super(VehicleTypeEnum.HYBRID.name());
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.HYBRID.name();
    }
}
