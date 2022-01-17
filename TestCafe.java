import java.util.*;

public class TestCafe {
    public static void main(String[] args) {
        
        CafeUtil appTest = new CafeUtil();

        System.out.println("-----Streak Goal Test-----");
        System.out.printf("Purchases needed by week 10: %s \n\n\n", appTest.getStreakGoal());

        System.out.println("-----Order Total Test-----");
        double[] lineItems={3.55, 1.45, 4.05, 4.55};
        System.out.printf("Order Total: %s \n\n\n", appTest.getOrderTotal(lineItems));

        System.out.println("-----Display Menu Test-----");
        List<String> loadMenu=Arrays.asList(
            "Drip",
            "Cappucino",
            "Latte",
            "Mocha"
        );
        ArrayList<String>menu=new ArrayList<String>();
        menu.addAll(loadMenu);
        appTest.displayMenu(menu);

        System.out.println("\n-----Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();

        for (int i=0; i<3; i++) {
            appTest.addCustomer(customers);
            System.out.println("\n");
        }

    }
}