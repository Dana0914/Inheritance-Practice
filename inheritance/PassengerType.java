package inheritance;

public class PassengerType extends VehicleTypeByPurpose{
    PassengerType() {
        super(VehicleTypeEnum.PASSENGER.name());
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PASSENGER.name();
    }
}
