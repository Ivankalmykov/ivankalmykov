package javacourse.homework3.workwithsum;

public class Main {

    public static void main(String[] args) {
        double num = 468.51;
        Comma comma = new Comma();
        Space space = new Space();
        Point point = new Point();
        System.out.println(comma.format(num));
        System.out.println(space.format(num));
        System.out.println(point.format(num));
    }
}
