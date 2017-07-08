package seryozha.hovhannisyan.pattern.behavioral.visitor;

/**
 * Created by Serozh on 6/7/2017.
 */
public class VFruit  implements VItemElement {

    private int pricePerKg;
    private int weight;
    private String name;

    public VFruit(int priceKg, int wt, String nm){
        this.pricePerKg=priceKg;
        this.weight=wt;
        this.name = nm;
    }

    public int getPricePerKg() {
        return pricePerKg;
    }


    public int getWeight() {
        return weight;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public int accept(VShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
