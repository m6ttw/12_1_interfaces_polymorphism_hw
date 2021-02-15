import attractions.*;
import people.Visitor;
import org.junit.Before;
import org.junit.Test;
import themepark.ThemePark;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {
    ThemePark themePark;
    Dodgems dodgems;
    Park park;
    Playground playground;
    RollerCoaster rollerCoaster;
    Visitor visitor;

    @Before
    public void before(){
        themePark = new ThemePark();
        dodgems = new Dodgems("Bumper Cars", 5);
        park = new Park("Vondelpark", 10);
        playground = new Playground("The Hive", 2);
        rollerCoaster = new RollerCoaster("Twisty Boi", 8);
        visitor = new Visitor(25, 170, 100);
    }

    @Test
    public void canAddAllReviewedToList(){
        themePark.addReviewed(dodgems);
        themePark.addReviewed(park);
        themePark.addReviewed(playground);
        themePark.addReviewed(rollerCoaster);
        assertEquals(4, themePark.getAllReviewed());
    }

    @Test
    public void canVisit(){
        themePark.visit(visitor, dodgems);
        assertEquals(1, visitor.getVisitedList());
        assertEquals(1, dodgems.getVisitCount());
    }
}
