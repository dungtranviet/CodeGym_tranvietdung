import model.Customer;

import java.util.List;

public class test {
    public static void main(String[] args) {
        List<Customer> list=Customer.getCustomers();
        System.out.println(list.get(0).getName());
    }
}
