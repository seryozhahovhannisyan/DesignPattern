package seryozha.hovhannisyan.pattern.behavioral.visitor;

/**
 * Created by Serozh on 6/7/2017.
 */
public class VBook implements VItemElement {

    private int price;
    private String isbnNumber;

    public VBook(int cost, String isbn){
        this.price=cost;
        this.isbnNumber=isbn;
    }

    public int getPrice() {
        return price;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    @Override
    public int accept(VShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }

}
