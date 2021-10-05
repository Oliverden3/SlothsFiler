import java.util.ArrayList;

public class Main {
    static ArrayList<Customer> customers;

    public static void main(String[] args) {
        customers = new ArrayList<>();
        Customer customer1 = new Customer("Oliver", "Jensen", "Hugo21");
        Customer customer2 = new Customer("Klumpe", "Dumpe", "Bubbi@");
        Customer customer3 = new Customer("Skovtrolden", "Hugo", "TangoTr0lden");
        Customer customer4 = new Customer("Red", "Foo", "ShuffleMania");
        Customer customer5 = new Customer("Sister", "Grene", "PotOgPande");
        Customer customer6 = new Customer("Heath", "Ledger", "WhySoSerious?!");
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);
        customers.add(customer6);
        for (Customer customers: customers) {
            System.out.println(customers);
        }
    }
}
