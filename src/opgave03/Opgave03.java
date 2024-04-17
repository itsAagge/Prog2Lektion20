package opgave03;

import opgave03.models.Bike;
import opgave03.models.BikeStore;
import opgave03.models.BikeType;

public class Opgave03 {
    public static void main(String[] args) {
        BikeStore bikeStore = new BikeStore();
        Bike bike = bikeStore.orderBike(BikeType.TANDEM);
    }
}
