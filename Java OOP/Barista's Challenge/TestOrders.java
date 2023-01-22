import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args){

        Item item1 = new Item("drip coffee", 7.50);
        Item item2 = new Item("capuccino", 6.45);
        Item item3 = new Item("latte", 7.00);
        Item item4 = new Item("mocha", 8.50);

        Order order1 = new Order();
        Order order2 = new Order();

        Order order3 = new Order("Udit");
        Order order4 = new Order("Narayan");
        Order order5 = new Order("Anjali");

        
        order1.addItem(item3);
        order1.addItem(item4);

        order2.addItem(item1);
        order2.addItem(item2);

        order3.addItem(item1);
        order3.addItem(item4);

        order4.addItem(item2);
        order4.addItem(item2);

        order5.addItem(item1);
        order5.addItem(item3);

        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();

        System.out.println(order2.getStatusMessage());
        order2.setReady(true);
        System.out.println(order2.getStatusMessage());
        System.out.println(order2.getOrderTotal());
        order2.display();
    }
}