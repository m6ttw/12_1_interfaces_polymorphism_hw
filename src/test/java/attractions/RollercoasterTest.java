package attractions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    people.Visitor visitor;

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
        visitor = new people.Visitor(18, 190, 100);
        assertEquals(8.40, rollerCoaster.priceFor(visitor), 0.0);
    }

    @Test
    public void priceOfTicketForLankyBeanpole(){
        visitor = new people.Visitor(28, 201, 300);
        assertEquals(16.80, rollerCoaster.priceFor(visitor), 0.0);
    }
}
