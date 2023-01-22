import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
        // item1 and it's attributes
        Items item1 = new Items();
        item1.name = "mocha";
        item1.price = 5.70;
        
        // item2 and it's attributes
        Items item2 = new Items();
        item2.name = "latte";
        item2.price = 6.70;
        
        // item3 and it's attributes
        Items item3 = new Items();
        item3.name = "drip coffee";
        item3.price = 4.70;
        
        // item4 and it's attributes
        Items item4 = new Items();
        item4.name = "capuccino";
        item4.price = 6.70;

        //order1
        Orders order1 = new Orders();
        order1.name = "Cindhuri";
        System.out.println(order1);

        //order2
        Orders order2 = new Orders();
        order2.name = "Jimmy";

        //order3
        Orders order3 = new Orders();
        order3.name = "Noah";

        //order4
        Orders order4 = new Orders();
        order4.name = "Sam";

        System.out.println(order1.total);

        order2.items.add(item1);
        order2.total += item1.price;

        order3.items.add(item4);
        order3.total =+ item4.price;

        order4.items.add(item2);
        order4.total += item2.price;
        order4.items.add(item2);
        order4.items.add(item2);
        order4.total += item2.price * 2;

        order1.ready = true;
        order2.ready = true;


        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);

        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);

        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);

        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
    }
}
