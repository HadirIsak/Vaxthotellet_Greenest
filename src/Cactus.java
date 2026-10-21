public class Cactus extends Plant {
    // Arv: ärver från Plant.

    private String liquidType = "mineralvatten";

    public Cactus(String name, double height) {
        super(name, height);
    }

    @Override
    public double calculateLiquid() {
        return 0.02;
    }

    @Override
    public String getLiquidType() {
        return liquidType;
    }
}