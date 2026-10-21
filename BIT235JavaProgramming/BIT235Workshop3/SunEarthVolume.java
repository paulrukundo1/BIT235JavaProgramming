public class SunEarthVolume {
    public static void main(String[] args) {
        // Given diameters in miles
        double sunDiameter = 865000.0;
        double earthDiameter = 7600.0;

        // Calculate radii (r = diameter / 2)
        double sunRadius = sunDiameter / 2;
        double earthRadius = earthDiameter / 2;

        // Constant pi (as given in the problem)
        double pi = 3.14;

        // Volume of a sphere = (4/3) * pi * r^3
        // Note: use 4.0/3.0 to force floating-point division
        double earthVolume = (4.0 / 3.0) * pi * Math.pow(earthRadius, 3);
        double sunVolume   = (4.0 / 3.0) * pi * Math.pow(sunRadius, 3);

        // Ratio of Sun's volume to Earth's volume
        double ratio = sunVolume / earthVolume;

        // Display results
        System.out.println("Volume Calculations");
        System.out.println("-----------------------------------");
        System.out.printf("a.) Volume of the Earth: %.2f cubic miles%n", earthVolume);
        System.out.printf("b.) Volume of the Sun:   %.2f cubic miles%n", sunVolume);
        System.out.printf("c.) Ratio (Sun / Earth): %.2f%n", ratio);
    }
}