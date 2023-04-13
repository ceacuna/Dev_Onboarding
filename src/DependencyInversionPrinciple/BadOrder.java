package DependencyInversionPrinciple;

import java.util.ArrayList;
import java.util.List;

public class BadOrder {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void checkout() {
        System.out.println("checkout");
    }
}
