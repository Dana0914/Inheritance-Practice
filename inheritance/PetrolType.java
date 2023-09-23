package inheritance;

public class PetrolType extends VehicleTypeByFuelType{
    PetrolType() {
        super(VehicleTypeEnum.PETROL.name());
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PETROL.name();
    }
}
