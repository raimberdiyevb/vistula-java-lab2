import java.math.BigDecimal;

public class Task5 {
    public static void main(String[] args) {
        double costNetto = 9.99;
        double costBrutto = costNetto * 1.23;
        System.out.println("Net Price : " + costNetto);
        System.out.println("Gross Price : " + costBrutto);
        double pcs = 10000;
        System.out.println("We sold " + pcs + "pcs of the product");
        costBrutto = costBrutto * 10000;
        System.out.println("New Gross Price : " + costBrutto);
        costNetto = costBrutto * 0.77;
        System.out.println("New Net Price : " + costNetto);

        System.out.println("*".repeat(20));
        System.out.println("*".repeat(20));
        System.out.println("*".repeat(20));
        BigDecimal bigDecimalNetCost = new BigDecimal(9.9);
        BigDecimal bigDecimalBruttoCost = new BigDecimal((bigDecimalNetCost.multiply(BigDecimal.valueOf(1.23)).doubleValue()));
        System.out.println("Net Price : " + bigDecimalNetCost.doubleValue());
        System.out.println("Gross Price : " + bigDecimalBruttoCost.doubleValue());

        System.out.println("We sold " + pcs + "pcs of the product");
        bigDecimalBruttoCost = bigDecimalBruttoCost.multiply(BigDecimal.valueOf(pcs));
        System.out.println("New Gross Price : " + bigDecimalBruttoCost.doubleValue());
        bigDecimalNetCost = bigDecimalBruttoCost.multiply(BigDecimal.valueOf(0.77));
        System.out.println("New Net Price : " + bigDecimalNetCost.doubleValue());
    }
}
