public class Palm extends Plant {

    private String liquidType = "kranvatten";

    public Palm(String name, double height) {
        super(name, height);
    }

    @Override
    public double calculateLiquid() {
        return 0.5 * getHeight();
    }

    @Override
    public String getLiquidType() {
        return liquidType;
    }
}