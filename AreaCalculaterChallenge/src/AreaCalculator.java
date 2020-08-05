public class AreaCalculator {

    public static double area(double radius) {
        if (radius < 0)
            return -1.0;

        return Math.PI * Math.pow(radius, 2);
    }

    public static double area(double width, double length) {
        if (width < 0 || length < 0)
            return -1.0;

        return width * length;
    }
}
