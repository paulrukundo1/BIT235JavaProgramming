public class SunEarthVolume {
    public static void main(String[] args) {
        // Given diameters in miles
        double sunDiameter = 865000.0;
        double earthDiameter = 7600.0;

        // Value of pi
        final double PI = 3.14;

        // Calculate radii (radius = diameter / 2)
        double sunRadius = sunDiameter / 2;
        double earthRadius = earthDiameter / 2;

        // Calculate volumes using formula: V = (4/3) * pi * r^3
        // Note: use 4.0/3.0 to force floating-point division
        double earthVolume = (4.0 / 3.0) * PI * Math.pow(earthRadius, 3);
        double sunVolume   = (4.0 / 3.0) * PI * Math.pow(sunRadius, 3);

        // Calculate ratio of Sun's volume to Earth's volume
        double ratio = sunVolume / earthVolume;

        // Display results
        System.out.println("=== Volume Calculations ===");
        System.out.printf("Earth Radius        : %.2f miles%n", earthRadius);
        System.out.printf("Sun Radius          : %.2f miles%n", sunRadius);
        System.out.println();
        System.out.printf("a.) Volume of Earth : %.2f cubic miles%n", earthVolume);
        System.out.printf("b.) Volume of Sun   : %.2f cubic miles%n", sunVolume);
        System.out.printf("c.) Ratio Sun/Earth : %.2f%n", ratio);
    }
}