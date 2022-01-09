package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {

        Customer cust= new Customer("Amal", "0711111111");

        //Using Normal java function
        printCustomerDetails(cust);


        //Using Consumer functional interface
        Consumer<Customer> customerConsumer=customer->System.out.println(customer.customerName+" "+customer.customerPhoneNumber);
        customerConsumer.accept(cust);

        //Using BiConsumer functional interface (BiConsumer takes two arguments)
        BiConsumer<Customer, Boolean> customerConsumerV2=(customer, showPhoneNumber)->System.out.println(customer.customerName+" "+(showPhoneNumber==true ?customer.customerPhoneNumber:"********"));
        customerConsumerV2.accept(cust, true);
        customerConsumerV2.accept(cust, false);


    }

    static void printCustomerDetails(Customer customer){
        System.out.println(customer.customerName+" "+customer.customerPhoneNumber);
    }

    static class Customer{
        private String customerName;
        private String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }

        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public String getCustomerPhoneNumber() {
            return customerPhoneNumber;
        }

        public void setCustomerPhoneNumber(String customerPhoneNumber) {
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
