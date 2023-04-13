package DependencyInversionPrinciple;

import java.util.ArrayList;
import java.util.List;

public class GoodOrder implements Orderable{
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void checkout() {
        System.out.println("Checkout");
    }
}
