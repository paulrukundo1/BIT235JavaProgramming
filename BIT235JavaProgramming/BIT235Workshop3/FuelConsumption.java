public class FuelConsumption {
    public static void main(String[] args) {
        double tankCapacity = 40.0;
        double normalFuelConsumption = 8.0;
        double roughFuelConsumption = normalFuelConsumption * 1.15;

        double normalRoadDistance = tankCapacity / normalFuelConsumption * 100;
        double roughRoadDistance = tankCapacity / roughFuelConsumption * 100;

        System.out.printf("Distance on normal roads: %.2f km%n", normalRoadDistance);
        System.out.printf("Distance on rough roads: %.2f km%n", roughRoadDistance);
    }
}
