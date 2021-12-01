public class TestOrder {
    public static void main(String[] args) {
        Item item1 = new Item("mocha", 2.35);
        Item item2 = new Item("latte", 4.35);
        Item item3 = new Item("drip coffee", 5.35);
        Item item4 = new Item("capuccino", 3.35);

        Order order1 = new Order("Cindhuri");
        Order order2 = new Order("Jimmy");
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");
        System.out.printf("Name: %s\n", order1.getName());
        order2.addItem(item1);
        order2.setTotal(item1.getPrice());
        System.out.printf("Order2 Total: %s\n", order2.getTotal());
        order3.addItem(item4);
        order3.setTotal(item4.getPrice());
        System.out.printf("Order3 Total: %s\n", order3.getTotal());
        order4.addItem(item2);
        order4.setTotal(item2.getPrice());
        System.out.printf("Order4 Total: %s\n", order4.getTotal());
        order1.setReady(true);
        order4.addItem(item2);
        order4.setTotal(item2.getPrice());
        System.out.printf("Order4 Total: %s\n", order4.getTotal());
        order4.addItem(item2);
        order4.setTotal(item2.getPrice());
        System.out.printf("Order4 Total: %s\n", order4.getTotal());
        order2.setReady(true);

        System.out.println("order1 " + order1.getTotal());

    }
}
