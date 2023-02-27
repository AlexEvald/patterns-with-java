package builder.main.functional;

import builder.CustomerFunctional;

public class BuilderMainFunctional {
    public static void main(String[] args) {

        final CustomerFunctional newCustomer = new CustomerFunctional.Builder("Alex", "Lozi").with(builder -> {
                    builder.setAddress("Averof");
                    builder.setPhoneNumber("867308738242");
                    builder.setAge(37);
                    builder.setSex(CustomerFunctional.Sex.MALE);
        }
        ).build();

        System.out.println("The customer object is : " + newCustomer.toString());

    }
}
