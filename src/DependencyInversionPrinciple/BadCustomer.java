package DependencyInversionPrinciple;

public class BadCustomer {
    private BadOrder order;

    public BadCustomer() {
        order = new BadOrder();
    }

    public void purchaseItem(Item item) {
        order.addItem(item);
        order.checkout();
    }
}
