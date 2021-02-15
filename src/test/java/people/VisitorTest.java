package people;

import attractions.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;
    Attraction dodgems;
    Attraction park;
    Attraction playground;
    Attraction rollerCoaster;

    @Before
    public void before(){
        visitor = new Visitor(14, 1.2, 40.0);
        dodgems = new Dodgems("Bumper Cars", 5);
        park = new Park("Vondelpark", 10);
        playground = new Playground("The Hive", 2);
        rollerCoaster = new RollerCoaster("Twisty Boi", 8);
    }

    @Test
    public void hasAge() {
        assertEquals(14, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(1.2, visitor.getHeight(), 0.1);
    }

    @Test
    public void hasMoney() {
        assertEquals(40.0, visitor.getMoney(), 0.1);
    }

    @Test
    public void canAddAttractionToVisitedList(){
        visitor.addAttractionToVisitedList(dodgems);
        visitor.addAttractionToVisitedList(park);
        visitor.addAttractionToVisitedList(playground);
        visitor.addAttractionToVisitedList(rollerCoaster);
        assertEquals(4, visitor.getVisitedList());
    }
}
