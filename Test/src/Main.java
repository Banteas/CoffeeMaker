import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose your coffee type: \n\n");
        for(CoffeeType type : CoffeeType.values()){

            System.out.printf("- %s (%.2f€)%n", type.name(), type.getBasePrice());
        }

        CoffeeType chosenType = null;
        while (chosenType == null){
            System.out.print("\nEnter type (e.g., ESPRESSO): ");
            String input = scanner.nextLine().toUpperCase();

            try {
                chosenType = CoffeeType.valueOf(input);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid type of coffee. Try again.");;
            }
        }

        System.out.print("\nChoose your size: \n\n");
        for(CoffeeSize size : CoffeeSize.values()) {

            System.out.printf("- %s (%.2f€)%n", size.name(), size.getExtraCharge());
        }

            CoffeeSize chosenSize = null;
            while (chosenSize == null){
                System.out.println("\nEnter size (e.g., SMALL): ");
                String input = scanner.nextLine().toUpperCase();

                try {
                    chosenSize = CoffeeSize.valueOf(input);
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid size, try again.");
                }

            }

            double total = chosenType.getBasePrice() + chosenSize.getExtraCharge();
            System.out.printf("%nYou ordered a %s %s. Total: %.2f%n",chosenSize.name(),chosenType.name(),total);

        }




    }

