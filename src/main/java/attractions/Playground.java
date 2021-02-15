package attractions;

import behaviours.ISecurity;

public class Playground extends Attraction implements ISecurity {

    public Playground(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(people.Visitor visitor){
        if (visitor.getAge() <= 15) {
            return true;
        } else {
            return false;
        }
    }
}
