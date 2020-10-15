public class Sundae extends IceCream{
    private double costOfTopping;
    private String toppingName;


    public Sundae(String name,double costOfIceCream,double costOfTopping,String toppingName){
        super(name,costOfIceCream);
        this.costOfTopping=costOfTopping;
        this.toppingName=toppingName;
    }

    @Override
    public int getCost() {
        return (int)Math.round(super.getCostOfIceCream()+costOfTopping);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(toppingName + "Sundae with\n");
        sb.append(String.format("%-25.25s %6s", super.getName(), DessertShoppe.cents2dollarsAndCents(getCost())));
        return sb.toString();
    }
}
