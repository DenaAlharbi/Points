import java.util.Scanner;

import java.util.Scanner;

public class Point {
    double x;
    double y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(double myx, double myy) {
        x = myx;
        y = myy;
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point p) {
        double xD = x - p.getX();
        double yD = y - p.getY();
        double distance = Math.sqrt((xD * xD) + (yD * yD));

        return distance;
    }


}
