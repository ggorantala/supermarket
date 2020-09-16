package customers;

import java.util.Arrays;

/**
 * Created by sumateja on 29/08/20
 *
 * Our customer class has list of elements, for example: his picked items, name and quantity etc..
 *
 */
public class Customer implements WaitingCustomer {

    private String name; // done
    private String listOfItems; // done
    private int quantity;
    private int orderNumber; // done

    public double getPrice(String product) {
        return getQuantity() * ProductPrice.products.get(product);
    }

    @Override
    public void orderReady(String items) {
        if (listOfItems.equals(items)) {
            exitStore();
        }
    }

    private void exitStore() {
        for (String s : Arrays.asList("Thank you, I've received my " + listOfItems + " and leaving the store now...", "...")) {
            System.out.println(s);
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getListOfItems() {
        return listOfItems;
    }

    public void setListOfItems(String listOfItems) {
        this.listOfItems = listOfItems;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
}
