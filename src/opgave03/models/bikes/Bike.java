package opgave03.models.bikes;

import opgave03.models.parts.Part;

import java.util.ArrayList;
import java.util.List;

public abstract class Bike {
    List<Part> parts = new ArrayList<>();

    public Bike(List<Part> parts) {
        this.parts = parts;
    }
}
