package third_lecture_homework;

public class Main {
    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter(0.01, 36.55);

        double amountInUsd = 100;
        double totalAmount = converter.calculateTotalAmount(amountInUsd);

        System.out.println("Total amount in UAH: " + totalAmount);
    }
}
