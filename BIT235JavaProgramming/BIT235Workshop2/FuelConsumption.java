public class FuelConsumption {
    public static void main(String[] args) {
        // Given values
        double normalConsumption = 8.0;   // liters per 100 km on normal roads
        double roughIncrease = 0.15;      // 15% more fuel on rough roads
        double tankCapacity = 40.0;       // full tank in liters
        double distanceBase = 100.0;      // consumption is per 100 km

        // Fuel consumption on rough roads = 15% more than normal
        double roughConsumption = normalConsumption * (1 + roughIncrease);

        // Distance = (tank capacity / consumption per 100 km) * 100
        double normalDistance = (tankCapacity / normalConsumption) * distanceBase;
        double roughDistance  = (tankCapacity / roughConsumption) * distanceBase;

        // Display results
        System.out.println("=== Fuel Consumption Calculator ===");
        System.out.printf("Tank Capacity              : %.2f liters%n", tankCapacity);
        System.out.println();
        System.out.printf("Normal road consumption    : %.2f L/100km%n", normalConsumption);
        System.out.printf("Distance on normal roads   : %.2f km%n", normalDistance);
        System.out.println();
        System.out.printf("Rough road consumption     : %.2f L/100km%n", roughConsumption);
        System.out.printf("Distance on rough roads    : %.2f km%n", roughDistance);
    }
}