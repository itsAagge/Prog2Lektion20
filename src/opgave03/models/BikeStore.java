package opgave03.models;

import opgave03.models.bikes.*;
import opgave03.models.parts.*;

import java.util.List;

public abstract class BikeStore {
    public abstract Bike orderBike(BikeType type);
}
