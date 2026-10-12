
public class Palm extends Plant {

    public Palm(String name, double height) {
        super(name, height);
    }

    // Arv: Palm ärver från Plant.
    // Polymorfism: egen beräkning för palmer.
    @Override
    public double calculateLiquid() {
        return 0.5 * getHeight();
    }

    @Override
    public String getLiquidType() {
        return "kranvatten";
    }
}
