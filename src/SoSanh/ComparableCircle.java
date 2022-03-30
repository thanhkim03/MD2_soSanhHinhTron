package SoSanh;

import hinhHoc.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }
    public ComparableCircle() {
    }

    @Override
    public int compareTo(ComparableCircle o) {
     if(getRadius()<o.getRadius())return -1;
     else if (getRadius()>o.getRadius())return 1;
     else return 0;
    }
}
