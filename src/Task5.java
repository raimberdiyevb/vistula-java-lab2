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

    }
}
