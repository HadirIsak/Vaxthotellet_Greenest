
public class CarnivorousPlant extends Plant {

    public CarnivorousPlant(String name, double height) {
        super(name, height);
    }

    // Arv från Plant och polymorfism.
    @Override
    public double calculateLiquid() {
        return 0.1 + (0.2 * getHeight());
    }

    @Override
    public String getLiquidType() {
        return "proteindryck";
    }
}
