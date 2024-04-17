package opgave03.models;

import opgave03.models.parts.*;

import java.util.List;

public class BikeStore {
    public Bike orderBike(BikeType type) {
        switch (type) {
            case NORMAL -> {
                return new Bike(List.of(
                        new Wheel(),
                        new Wheel(),
                        new Seat(),
                        new Stel(),
                        new Handlebar()));
            }
            case EBIKE -> {
                return new Bike(List.of(
                        new Wheel(),
                        new Wheel(),
                        new Seat(),
                        new Stel(),
                        new Handlebar(),
                        new Motor(),
                        new Battery()));
            }
            case TRI -> {
                return new Bike(List.of(
                        new Wheel(),
                        new Wheel(),
                        new Wheel(),
                        new Seat(),
                        new Stel(),
                        new Handlebar()));
            }
            case TANDEM -> {
                return new Bike(List.of(
                        new Wheel(),
                        new Wheel(),
                        new Seat(),
                        new Seat(),
                        new Stel(),
                        new Handlebar()));
            }
            default -> {
                return null;
            }
        }
    }
}
