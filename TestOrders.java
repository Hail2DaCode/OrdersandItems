import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item();
        item1.name = "drip coffee";
        item1.price = 3.00;

        Item item2 = new Item();
        item2.name = "cappucino";
        item2.price = 5.50;

        Item item3 = new Item();
        item3.name = "mocha";
        item3.price = 5.00;

        Item item4 = new Item();
        item4.name = "latte";
        item4.price = 4.00;

    
        // Order variables -- order1, order2 etc.

        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();

        order1.name = "Cindhuri";
        order2.name = "Jimmy";
        order3.name = "Noah";
        order4.name = "Sam";
        System.out.println(order2.items);

        order2.items.add(item1);
        for (Item item: order2.items) {
            order2.total += item.price;
        }
        order3.items.add(item2);
        for (Item item: order3.items) {
            order3.total += item.price;
        }
        order4.items.add(item4);
        order4.items.add(item4);
        order4.items.add(item4);
        for (Item item: order4.items) {
            order4.total += item.price;
        }
        order1.ready = true;
        order2.ready = true;




    
        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Name: %s, Total: %s, Ready: %b \n", order1.name,order1.total, order1.ready);
        System.out.printf("Name: %s, Total: %s, Ready: %b \n", order2.name, order2.total, order2.ready);
        System.out.printf("Name: %s, Total: %s, Ready: %b \n", order3.name, order3.total, order3.ready);
        System.out.printf("Name: %s, Total: %s, Ready: %b \n", order4.name, order4.total, order4.ready);
        System.out.printf("Ready: %s\n", order1.ready);
        System.out.printf("Ready: %s\n", order2.ready);
    }
}
