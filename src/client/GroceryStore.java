//package client;
//
//import customers.Customer;
//import supermarket.StoreAttendant;
//
//import java.util.Date;
//
///**
// * Created by sumateja on 29/08/20
// *
// * GroceryStore class containing the base implementation and billing system etc..
// *
// */
//public class GroceryStore {
//    static int counter = 1024;
//
//    public static void main(String[] args) throws Exception {
//
//        Customer robert = new Customer();
//        robert.setName("Robert");
//        robert.setListOfItems("potatoes");
//        robert.setQuantity(2);
//        robert.setOrderNumber(counter++);
//
//        Customer bill = new Customer();
//        bill.setName("Bill");
//        bill.setListOfItems("onions");
//        bill.setQuantity(3);
//        bill.setOrderNumber(counter++);
//
//        DAOImpl impl = new DAOImpl();
//
//        impl.createTable();
//        impl.insert(robert.getName(), robert.getListOfItems(), robert.getQuantity(),robert.getPrice(robert.getListOfItems()));
//        impl.insert(bill.getName(), bill.getListOfItems(), bill.getQuantity(), bill.getPrice(bill.getListOfItems()));
//
//        StoreAttendant storeAttendant = new StoreAttendant();
//        storeAttendant.takeOrder(robert);
//        storeAttendant.takeOrder(bill);
//        System.out.println("...");
//
//        // prepare billing
//        storeAttendant.prepareBilling("potatoes");
//        storeAttendant.prepareBilling("onions");
//
//        // order up...
//        storeAttendant.callOutCompletedOrders();
//    }
//}
