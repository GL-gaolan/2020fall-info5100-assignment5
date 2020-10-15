public class DessertShoppe {
    public static final double TAX_RATE = 0.065;
    public static final String NAME_OF_STORE = "M & M Dessert Shoppe";
    public static final int MAXSIZE_OF_ITEM_NAME = 25;
    public static final int COST_WIDTH = 5;

    public static String cents2dollarsAndCents(int costInCent) {
        double dollar = costInCent*1.0/100;//Attention to this important "1.0"!!!! without which the precision will be wrong
        String dollarAndCent = String.format("%.2f",dollar);
        return dollarAndCent;
    }

}
