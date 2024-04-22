package opgave03.models.bikes;

import opgave03.models.parts.*;

import java.util.List;

public class TandemBike extends Bike {
    public TandemBike() {
        super(List.of(new Wheel(), new Wheel(), new Seat(), new Seat(), new Stel(), new Handlebar()));
    }
}
