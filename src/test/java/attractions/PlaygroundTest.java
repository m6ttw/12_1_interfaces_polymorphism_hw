package attractions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    people.Visitor visitor;

    @Before
    public void before() throws Exception {
        playground = new Playground("Fun Zone", 7);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void visitorCanPlay(){
        visitor = new people.Visitor(14, 140, 0);
        assertEquals(true, playground.isAllowedTo(visitor));
    }

    @Test
    public void visitorTooOldToPlay(){
        visitor = new people.Visitor(16, 155, 10);
        assertEquals(false, playground.isAllowedTo(visitor));
    }
}
