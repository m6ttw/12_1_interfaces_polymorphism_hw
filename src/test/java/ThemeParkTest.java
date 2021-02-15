import attractions.*;
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


    @Before
    public void before(){
        themePark = new ThemePark();
        dodgems = new Dodgems("Bumper Cars", 5);
        park = new Park("Vondelpark", 10);
        playground = new Playground("The Hive", 2);
        rollerCoaster = new RollerCoaster("Twisty Boi", 8);
    }

    @Test
    public void canAddAllReviewedToList(){
        themePark.addReviewed(dodgems);
        themePark.addReviewed(park);
        themePark.addReviewed(playground);
        themePark.addReviewed(rollerCoaster);
        assertEquals(4, themePark.getAllReviewed());
    }
}
