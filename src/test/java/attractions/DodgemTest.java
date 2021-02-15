package attractions;

import people.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor;

    @Before
    public void before() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void adultsPayNormalPrice(){
        visitor = new Visitor(25, 170, 150);
            assertEquals(4.50, dodgems.priceFor(visitor), 0.0);
    }

    @Test
    public void kidsPayHalfPrice(){
        visitor = new Visitor(11, 125, 10);
        assertEquals(2.25, dodgems.priceFor(visitor), 0.0);
    }


}
