package opgave03;

import opgave03.models.NormalBikeStore;
import opgave03.models.bikes.Bike;
import opgave03.models.BikeStore;
import opgave03.models.bikes.BikeType;

public class Opgave03 {
    public static void main(String[] args) {
        BikeStore bikeStore = new NormalBikeStore();
        Bike bike = bikeStore.orderBike(BikeType.TANDEM);
    }
}
