import java.util.*;

public class currencyconverter {
    public static void main(String[] args) {
        // Step 1: Store exchange rates (per 1 USD)
        HashMap<String, Double> rates = new HashMap<>();
        rates.put("USD", 1.00);     // United States - US Dollar
        rates.put("INR", 83.12);    // India - Indian Rupee
        rates.put("NPR", 133.00);   // Nepal - Nepalese Rupee
        rates.put("GBP", 0.82);     // United Kingdom - Pound Sterling
        rates.put("CAD", 1.37);     // Canada - Canadian Dollar
        rates.put("AUD", 1.53);     // Australia - Australian Dollar
        rates.put("JPY", 150.50);   // Japan - Japanese Yen
        rates.put("CNY", 7.30);     // China - Chinese Yuan
        rates.put("SGD", 1.36);     // Singapore - Singapore Dollar
        rates.put("AED", 3.67);     // UAE - Dirham
        rates.put("CHF", 0.90);     // Switzerland - Swiss Franc
        rates.put("EUR", 0.94);     // Germany - Euro
        rates.put("KRW", 1375.00);  // South Korea - Won
        rates.put("RUB", 98.40);    // Russia - Russian Ruble
        rates.put("BRL", 5.10);     // Brazil - Brazilian Real
        rates.put("ZAR", 18.90);    // South Africa - Rand
        rates.put("IDR", 15600.00); // Indonesia - Rupiah
        rates.put("MXN", 18.20);    // Mexico - Mexican Peso
        rates.put("SAR", 3.75);     // Saudi Arabia - Riyal
        rates.put("BDT", 117.00);   // Bangladesh - Taka

        // Step 2: Create a map for full names
        HashMap<String, String> names = new HashMap<>();
        names.put("USD", "United States - US Dollar");
        names.put("INR", "India - Indian Rupee");
        names.put("NPR", "Nepal - Nepalese Rupee");
        names.put("GBP", "United Kingdom - Pound Sterling");
        names.put("CAD", "Canada - Canadian Dollar");
        names.put("AUD", "Australia - Australian Dollar");
        names.put("JPY", "Japan - Japanese Yen");
        names.put("CNY", "China - Chinese Yuan");
        names.put("SGD", "Singapore - Singapore Dollar");
        names.put("AED", "United Arab Emirates - Dirham");
        names.put("CHF", "Switzerland - Swiss Franc");
        names.put("EUR", "Germany - Euro");
        names.put("KRW", "South Korea - Won");
        names.put("RUB", "Russia - Russian Ruble");
        names.put("BRL", "Brazil - Brazilian Real");
        names.put("ZAR", "South Africa - Rand");
        names.put("IDR", "Indonesia - Rupiah");
        names.put("MXN", "Mexico - Mexican Peso");
        names.put("SAR", "Saudi Arabia - Riyal");
        names.put("BDT", "Bangladesh - Taka");

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Simple Currency Converter =====");
        System.out.println("\nSupported Countries and Currencies:");
        for (String code : rates.keySet()) {
            System.out.println(code + " : " + names.get(code));
        }

        // Step 3: Take user input
        System.out.print("\nEnter source currency code (e.g., INR): ");
        String from = sc.next().toUpperCase();

        System.out.print("Enter target currency code (e.g., USD): ");
        String to = sc.next().toUpperCase();

        // Step 4: Validate input
        if (!rates.containsKey(from) || !rates.containsKey(to)) {
            System.out.println(" Invalid currency code! Please try again.");
            sc.close();
            return;
        }

        System.out.print("Enter amount to convert: ");
        double amount = sc.nextDouble();

        // Step 5: Conversion
        double result = amount * (rates.get(to) / rates.get(from));

        // Step 6: Show result
        System.out.println("\n Conversion Result:");
        System.out.printf("%.2f %s (%s) = %.2f %s (%s)\n",
                amount, from, names.get(from), result, to, names.get(to));

        System.out.println("\n Thank you for using the Currency Converter!");
        sc.close();
    }
}
