package third_lecture_homework;

public class CurrencyConverter {
    private double commission;
    private double exchangeRate;
    public CurrencyConverter(double commission, double exchangeRate) {
        this.commission = commission;
        this.exchangeRate = exchangeRate;
    }

    private double convertUsdToUah(double amountInUsd) {
        return amountInUsd * exchangeRate;
    }

    private double calculateCommission(double amount) {
        return amount * commission;
    }

    public double calculateTotalAmount(double amountInUsd) {
        double convertedAmount = convertUsdToUah(amountInUsd);
        double commissionAmount = calculateCommission(convertedAmount);
        return convertedAmount + commissionAmount;
    }
}
