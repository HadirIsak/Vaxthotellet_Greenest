import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Polymorfism: olika växttyper lagras i en array av typen Plant.
        Plant[] plants = {
                new Cactus("Igge", 0.2),
                new Palm("Laura", 5.0),
                new CarnivorousPlant("Meatloaf", 0.7),
                new Palm("Olof", 1.0)
        };

        while (true) {

            System.out.println("Vilken växt ska få vätska?");
            System.out.println("Skriv 'avsluta' för att sluta.");

            String input = scanner.nextLine().trim();

            if (input.equals("avsluta") || input.equalsIgnoreCase("avsluta")) {
                System.out.println("Programmet avslutas...");
                break;
            }

            if (input.isEmpty()) {
                System.out.println("Du måste ange ett namn.");
                continue;
            }

            if (!input.matches("[a-zA-ZåäöÅÄÖ]+")) {
                System.out.println("Ange endast bokstäver.");
                continue;
            }

            Plant selectedPlant = null;

            for (Plant plant : plants) {
                if (plant.getName().equalsIgnoreCase(input)) {
                    selectedPlant = plant;
                    break;
                }
            }

            if (selectedPlant == null) {
                System.out.println("Växten finns inte på hotellet.");
                continue;
            }


            double amount = selectedPlant.calculateLiquid();

            String liquid = selectedPlant.getLiquidType();

            System.out.printf(
                    "%s behöver %.2f liter %s per dag.%n",
                    selectedPlant.getName(),
                    amount,
                    liquid
            );

            System.out.println();
        }

        scanner.close();
    }
}
