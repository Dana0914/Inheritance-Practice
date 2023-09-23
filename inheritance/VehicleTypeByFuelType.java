package inheritance;

public class VehicleTypeByFuelType extends VehicleType{
    VehicleTypeByFuelType(String attribute) {
        super(attribute);
    }
    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        VehicleTypeByFuelType that = (VehicleTypeByFuelType) object;
        return attribute != null ? attribute.equals(that.attribute) : false;
    }
}
