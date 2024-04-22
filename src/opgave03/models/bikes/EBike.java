package opgave03.models.bikes;

import opgave03.models.parts.*;

import java.util.List;

public class EBike extends Bike {
    public EBike() {
        super(List.of(new Wheel(), new Wheel(), new Seat(), new Stel(), new Handlebar(), new Motor(), new Battery()));
    }
}
