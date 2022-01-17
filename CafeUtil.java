import java.util.ArrayList;

public class CafeUtil {
    
    // Reward system for customers who buy more than the week before.
    // Calculate how many drinks they need after 10 weeks.
    // Write a method that sums together every consecutive intiger from 1-10 and returns the sum.

    public int getStreakGoal() {
        int sum=0;
        for (int week=1; week <=10; week++) {
            sum+=week; }
        return sum;
    }

    // Add all the prices from the array and return the total.

    public double getOrderTotal(double[] prices) {
        double sum=0;
        for(double price: prices) {
            sum+=price; }
        return sum;
    }

    // Print out each index and menu item.

    public void displayMenu(ArrayList<String> menuItems) {
        for (int id=0; id<menuItems.size(); id++) {
            System.out.printf("%s %s \n", id, menuItems.get(id)); }
    }

    // Add customer name to the array list.

    public void addCustomer(ArrayList<String>customerList) {
        System.out.println("Enter your name:");
        String userName = System.console().readLine();
        System.out.printf("Hello, %s! ", userName);
        System.out.printf("There are %s people ahead of you.\n", customerList.size());
        customerList.add(userName);
        System.out.println(customerList);
    }

}

