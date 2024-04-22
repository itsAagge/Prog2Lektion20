package opgave03.models;

import opgave03.models.bikes.*;

public class NormalBikeStore extends BikeStore {
    @Override
    public Bike orderBike(BikeType type) {
        switch (type) {
            case NORMAL -> {
                return new NormalBike();
            }
            case EBIKE -> {
                return new EBike();
            }
            case TRI -> {
                return new TriBike();
            }
            case TANDEM -> {
                return new TandemBike();
            }
            default -> {
                return null;
            }
        }
    }
}
