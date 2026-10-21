public class CarnivorousPlant extends Plant {
    // Arv: ärver från Plant.

    private String liquidType = "proteindryck";

    public CarnivorousPlant(String name, double height) {
        super(name, height);
    }

    @Override
    public double calculateLiquid() {
        return 0.1 + (0.2 * getHeight());
    }

    @Override
    public String getLiquidType() {
        return liquidType;
    }
}