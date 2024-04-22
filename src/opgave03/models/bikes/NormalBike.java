package opgave03.models.bikes;

import opgave03.models.parts.*;

import java.util.List;

public class NormalBike extends Bike {
    public NormalBike() {
        super(List.of(new Wheel(), new Wheel(), new Seat(), new Stel(), new Handlebar()));
    }
}
