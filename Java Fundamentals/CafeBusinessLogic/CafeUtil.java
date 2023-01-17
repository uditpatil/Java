import java.util.ArrayList;
import java.util.Arrays;
public class CafeUtil {
    public int getStreakGoal(int numWeeks) {
        int sum = 0;
        for(int i = 1; i <= numWeeks; i++) {
            sum = sum + i;
        }
        return sum;   
    }

    public double getOrderTotal(double[] prices) {
        double sum = 0.0;
        for(double price: prices) {
            sum = sum + price;
        }

        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.print("Hello, " + userName + "!");
        System.out.println(" There are " + customers.size() + " people in front of you");
        customers.add(userName);
        System.out.println(customers);
    }

    public void printPriceChart(String product, double price, int maxQuantity) {
        System.out.println(product);
        for (int item = 1; item <= maxQuantity; item++) {
            if(item > 1) {
                double roundPrice = (price * item) - (0.5 * (item - 1));
                System.out.printf("%s - $%.2f\n", item, roundPrice);
            }
            else {
                System.out.printf("%s - $%.2f\n", item, price);
            }
        }
    }

    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
        if (menuItems.size() != prices.size()) {
            return false;
        }
        for (int item = 0; item < menuItems.size(); item++) {
            System.out.printf("%s %s -- $%.2f\n", item, menuItems.get(item), prices.get(item));
        }
        return true;
    }

    public void addCustomers(ArrayList<String> customers) {
        boolean moreCustomers = true;
        while(moreCustomers){
            String customerName = System.console().readLine();
            if(customerName.equals("q")){
                moreCustomers = false;
                return;
            }   
            System.out.println("Hello, " + customerName);
            customers.add(customerName);
            System.out.println(customers);
        }
    }
}