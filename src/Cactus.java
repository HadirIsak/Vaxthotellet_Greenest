public class Cactus extends Plant {

    public Cactus(String name, double height) {
        super(name, height);
    }

    // Arv från Plant och polymorfism genom egen typ av metoden.
    @Override
    public double calculateLiquid() {
        return 0.02;
    }

    @Override
    public String getLiquidType() {
        return "mineralvatten";
    }
}
