package customers;

/**
 * Created by sumateja on 22/08/20
 *
 * Observer interface, a contract the customer class needs to implement
 */

// Observer
public interface WaitingCustomer {
    void orderReady(String items);
    String getName();
    int getOrderNumber();
}
