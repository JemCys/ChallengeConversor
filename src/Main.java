import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CheckCurrency checkCurrency = new CheckCurrency();

        while (true) {
            showMenu();
            try {
                int option = input.nextInt();
                input.nextLine();

                if (option == 9) {
                    System.out.println("Exiting...");
                    break;
                }

                if (option < 1 || option >9) {
                    System.out.println("Invalid option, please try again.");
                    continue;
                }

                System.out.print("Enter the amount to convert: ");
                double currencyAmount = input.nextDouble();
                input.nextLine();

                String baseCurrency = "";
                String targetCurrency = "";

                switch (option) {
                    case 1:
                        baseCurrency = "USD";
                        targetCurrency = "MXN";
                        break;
                    case 2:
                        baseCurrency = "MXN";
                        targetCurrency = "USD";
                        break;
                    case 3:
                        baseCurrency = "USD";
                        targetCurrency = "ARS";
                        break;
                    case 4:
                        baseCurrency = "ARS";
                        targetCurrency = "USD";
                        break;
                    case 5:
                        baseCurrency = "USD";
                        targetCurrency = "BRL";
                        break;
                    case 6:
                        baseCurrency = "BRL";
                        targetCurrency = "USD";
                        break;
                    case 7:
                        baseCurrency = "USD";
                        targetCurrency = "COP";
                        break;
                    case 8:
                        baseCurrency = "COP";
                        targetCurrency = "USD";
                        break;
                    default:
                        System.out.println("Invalid option, please try again.");
                        continue;
                }

                Currency result = checkCurrency.searchCurrency(baseCurrency, targetCurrency, Double.toString(currencyAmount));
                System.out.println("Conversion result: " + result.getConversion_result());
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number from the menu or a valid amount.");
                input.nextLine();
            } catch (Exception e ) {
                System.out.println("An error occurred: " + e.getMessage());
            }

        }
    }

    private static void showMenu() {
        System.out.println("**************************************************************");
        System.out.println("Welcome to the Currency Converter -Challenge Alura Latam");
        System.out.println("""
                Select the option of the Currencies you want to convert:
                1 - Dollar ==> Mexican peso
                2 - Mexican Peso ==> Dollar
                3 - Dollar ==> Argentine Peso
                4 - Argentine Peso ==> Dollar
                5 - Dollar ==> Brazilian Real
                6 - Brazilian Real ==> Dollar
                7 - Dollar ==> Colombian peso
                8 - Colombian peso ==> Dollar
                9 - Exit ~
                """);
        System.out.println("***************************************************************");
    }
}
