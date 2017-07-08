package seryozha.hovhannisyan.pattern.behavioral.visitor;

/**
 * Created by Serozh on 6/7/2017.
 */
public class VShoppingCartClientTest {

    public static void main(String[] args) {
        VItemElement[] items = new VItemElement[]{
                new VBook(20, "1234"),
                new VBook(100, "5678"),
                new VFruit(10, 2, "Banana"),
                new VFruit(5, 5, "Apple")
        };

        int total = calculatePrice(items);
        System.out.println("Total Cost = " + total);
    }

    private static int calculatePrice(VItemElement[] items) {
        VShoppingCartVisitor visitor = new VShoppingCartVisitorImpl();
        int sum = 0;
        for (VItemElement item : items) {
            sum = sum + item.accept(visitor);
        }
        return sum;
    }

}
