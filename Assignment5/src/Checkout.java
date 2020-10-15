import java.util.Vector;

public class Checkout {
    Vector<DessertItem> dessertItems;

    public Checkout(){
        dessertItems =new Vector<DessertItem>();
    }

    public int numberOfItems(){
        return dessertItems.size();
    }

    public void enterItem(DessertItem  item){
        dessertItems.add(item);
    }

    public void clear(){ dessertItems.removeAllElements(); }

    public int totalCost(){
        int totalCost=0;
        for(DessertItem item:dessertItems){
            totalCost+=item.getCost();
        }
        return totalCost; //without tax
    }

    public int totalTax(){
        return (int)Math.round(totalCost()*DessertShoppe.TAX_RATE);
    }

    @Override
    public String toString() {
        int totalLength = DessertShoppe.MAXSIZE_OF_ITEM_NAME + DessertShoppe.COST_WIDTH;
        int storeNameLength = DessertShoppe.NAME_OF_STORE.length();
        StringBuilder sb = new StringBuilder();
        int leftWidth = (totalLength - storeNameLength) / 2;
        for (int i = 0; i < leftWidth; ++i) {
            sb.append(" ");
        }
        sb.append(DessertShoppe.NAME_OF_STORE + "\n");
        for (int i = 0; i < leftWidth; ++i) {
            sb.append(" ");
        }
        for (int i = 0; i < storeNameLength; ++i) {
            sb.append("-");
        }
        sb.append("\n");
        // each item
        for (DessertItem d: dessertItems) {
            sb.append(d);
            sb.append("\n");
        }
        sb.append("\n");
        // tax
        sb.append(String.format("%-25s %6s\n", "Tax", DessertShoppe.cents2dollarsAndCents(totalTax())));
        // tax + cost
        sb.append(String.format("%-25s %6s\n", "Total", DessertShoppe.cents2dollarsAndCents(totalTax() + totalCost())));
        return sb.toString();

    }
}
