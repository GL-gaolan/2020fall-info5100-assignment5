import javax.swing.*;

public class IceCream extends DessertItem{
    private double costOfIceCream;

    public IceCream(String name,double costOfIceCream){
        super(name);
        this.costOfIceCream=costOfIceCream;

    }

    public double getCostOfIceCream() {
        return costOfIceCream;
    }

    @Override
    public int getCost() {
        return (int)Math.round(costOfIceCream);
    }

    @Override
    public String toString() {
        return String.format("%-25.25s %6s", super.getName(), DessertShoppe.cents2dollarsAndCents(getCost()));
    }
}
