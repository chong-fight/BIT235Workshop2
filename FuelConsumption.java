public class FuelConsumption {
    public static void main(String[] args) {
        double tankCapacity = 40.0;
        double normalConsumptionPer100Km = 8.0;

        double roughRoadConsumptionPer100Km =
                normalConsumptionPer100Km * 1.15;

        double normalDistance =
                tankCapacity / normalConsumptionPer100Km * 100.0;
        double roughRoadDistance =
                tankCapacity / roughRoadConsumptionPer100Km * 100.0;

        System.out.printf("Distance on normal roads: %.2f km%n", normalDistance);
        System.out.printf("Distance on rough roads: %.2f km%n",
                roughRoadDistance);
    }
}
