public class CircleArea {
    public static void main(String[] args) {
        double pi = 3.14;
        double[] radii = {1.0, 2.5, 5.0, 10.0};

        for (double radius : radii) {
            double area = pi * Math.pow(radius, 2);
            System.out.println("Radius: " + radius + ", area: " + area);
        }
    }
}
