package attractions;

import behaviours.IReviewed;
import themepark.ThemePark;

public abstract class Attraction extends ThemePark {
    private String name;
    private int rating;
    public int visitCount;

    public Attraction(String name, int rating) {
        this.name = name;
        this.rating = rating;
        this.visitCount = 0;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public int getVisitCount() {
        return visitCount;
    }
}
