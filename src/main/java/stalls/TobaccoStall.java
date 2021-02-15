package stalls;

public class TobaccoStall extends Stall {

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    public boolean isAllowedTo(people.Visitor visitor){
        if (visitor.getAge() < 18) {
            return false;
        } else {
            return true;
        }
    }
}
