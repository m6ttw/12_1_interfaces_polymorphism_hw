package themepark;

import behaviours.IReviewed;

import java.util.ArrayList;

public class ThemePark {
    private ArrayList<IReviewed> reviewedList;
    public ThemePark(){
        this.reviewedList = new ArrayList<IReviewed>();
    }

    public void addReviewed(IReviewed reviewed){
        this.reviewedList.add(reviewed);
    }

    public int getAllReviewed(){
        return this.reviewedList.size();
    }
}
