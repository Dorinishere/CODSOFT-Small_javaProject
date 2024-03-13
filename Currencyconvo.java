
    import java.util.Scanner;

    public class Currencyconvo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Exchange rates
        double usdToEur = 0.9143;
        double usdToGbp = 0.7816;
        double usdToInr = 82.8245;
        double usdToJpy=147.98;
        double usdToAud=1.5136;
        double usdToPkr=276.05;

        
        System.out.println("Welcome to Currency Converter");
        System.out.println(" Currencies: ");
        System.out.println("1. USD to EUR (Euro)");
        System.out.println("2. USD to GBP(British pound)");
        System.out.println("3. USD to INR(Indian rupee)");
        System.out.println("4. USD to JPY (Japanese yen)");
        System.out.println("5. USD to AUD(Australia dollar)");
        System.out.println("6. USD to PKR(Pakistani rupee)");
        System.out.print("Enter your choice (1/2/3/4/5/6): ");
        int choice = scanner.nextInt();
        
        System.out.print("Enter the amount in USD: ");
        double amount = scanner.nextDouble();
        
        switch (choice) {
            case 1:
                System.out.println(amount + " USD = " + (amount * usdToEur) + " € ");
                break;
            case 2:
                System.out.println(amount + " USD = " + (amount * usdToGbp) + "£");
                break;
            case 3:
                System.out.println(amount + " USD = " + (amount * usdToInr) + "Rs3");
                break;
            case 4:
                System.out.println(amount + " USD = " + (amount * usdToJpy) + "¥");
                break;
            case 5:
                System.out.println(amount + " USD = " + (amount * usdToAud) + "AU$");
                break;
            case 6:
                System.out.println(amount + " USD = " + (amount * usdToPkr) + " Rp");
                break;
            default:
                System.out.println("Invalid choice");
        }
        
        scanner.close();
    }
}
