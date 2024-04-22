package opgave03.models.bikes;

import opgave03.models.parts.*;

import java.util.List;

public class TriBike extends Bike {
    public TriBike() {
        super(List.of(new Wheel(), new Wheel(), new Wheel(), new Seat(), new Stel(), new Handlebar()));
    }
}
