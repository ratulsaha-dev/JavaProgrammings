package mainCal;

public class TaxCalculator {
	private static final double income_Tax_Rate_1 = 0.05;
    private static final double income_Tax_Rate_2 = 0.2;
    private static final double income_Tax_Rate_3 = 0.3;

    private static final double INCOME_SLAB_1 = 250000;
    private static final double INCOME_SLAB_2 = 500000;
    private static final double INCOME_SLAB_3 = 1000000;

    public static double calculateTax(double income) {
        if (income < 0) {
            throw new IllegalArgumentException("Income cannot be negative.");
        }

        double taxAmount = 0;
        if (income <= INCOME_SLAB_1) {
            taxAmount = 0;
        } else if (income <= INCOME_SLAB_2) {
            taxAmount = (income - INCOME_SLAB_1) * income_Tax_Rate_1;
        } else if (income <= INCOME_SLAB_3) {
            taxAmount = (income - INCOME_SLAB_2) * income_Tax_Rate_2 + (INCOME_SLAB_2 - INCOME_SLAB_1) * income_Tax_Rate_1;
        } else {
            taxAmount = (income - INCOME_SLAB_3) * income_Tax_Rate_3 + (INCOME_SLAB_3 - INCOME_SLAB_2) * income_Tax_Rate_2 + (INCOME_SLAB_2 - INCOME_SLAB_1) * income_Tax_Rate_1;
        }

        return income - taxAmount;
        }

}
