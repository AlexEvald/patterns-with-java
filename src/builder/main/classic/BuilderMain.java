package builder.main.classic;

import builder.main.Customer;

public class BuilderMain {
    public static void main(String[] args) {

        final Customer customer = Customer.builderOf("John", "Smith")
                .withAge(30)
                .build();


        System.out.println("The customer object is : " + customer.toString());
    }
}
