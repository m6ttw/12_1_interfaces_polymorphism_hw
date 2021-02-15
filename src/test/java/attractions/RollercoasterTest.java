package attractions;

import people.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;

    @Before
    public void before() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void priceOfTicketForNormalPerson(){
        visitor = new Visitor(18, 190, 100);
        assertEquals(8.40, rollerCoaster.priceFor(visitor), 0.0);
    }

    @Test
    public void priceOfTicketForLankyBeanpole(){
        visitor = new Visitor(28, 201, 300);
        assertEquals(16.80, rollerCoaster.priceFor(visitor), 0.0);
    }

    @Test
    public void isAllowedToRide(){
        visitor = new Visitor(13, 146, 30);
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void isNotAllowedToRide(){
        visitor = new Visitor(11, 144, 15);
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));
    }
}
