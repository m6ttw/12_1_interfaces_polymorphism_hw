package stalls;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    people.Visitor visitor;

    @Before
    public void before() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void adultCanBuyFags(){
        visitor = new people.Visitor(20, 170, 40);
        assertEquals(true, tobaccoStall.isAllowedTo(visitor));
    }

    @Test
    public void childCantBuyFags(){
        visitor = new people.Visitor(2, 60, 0);
        assertEquals(false, tobaccoStall.isAllowedTo(visitor));
    }
}
