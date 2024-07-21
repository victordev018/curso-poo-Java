package util;

public class CurrencyConvert {
    public static final double IOF = 0.06;

    public static double Convert(double quantity, double price){
        return price * quantity * (1.00 + IOF);
    }
}
