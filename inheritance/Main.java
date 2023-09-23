package inheritance;

public class Main {
    public static void main(String[] args) {
        AdsService adService = new AdsService();
        VehicleAd volvoAd = new VehicleAd("Volvo", "123", new PassengerType(), new SedanType(), new PetrolType());
        VehicleAd kamazAd = new VehicleAd("Kamaz", "45", new TruckType(), new PickupType(), new DieselType());
        VehicleAd lexusAd = new VehicleAd("Lexus", "220", new CarType(), new SedanType(), new PetrolType());

        adService.setAdList(new VehicleAd[]{volvoAd, kamazAd, lexusAd});
        adService.filterByVehicleTypeByPurpose(new PassengerType());
        adService.filterByVehicleTypeByFuelTypes(new ElectricType());

    }
}
