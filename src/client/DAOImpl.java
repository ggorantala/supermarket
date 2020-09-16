package client;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by gopigorantala on 10/09/20
 * <p>
 * >>>>  <<<<
 */
public class DAOImpl {
//    public static void main(String[] args) throws Exception {
//        createTable();
//        insert();
//        List<String> list = get();
//    }

    public ArrayList<String> get() throws Exception {
        ArrayList<String> array = new ArrayList<>();
        try {
            Connection con = getConnection();
            PreparedStatement get = con.prepareStatement("SELECT * FROM supermarket");
            ResultSet res = get.executeQuery();
            while (res.next()) {
                System.out.print(res.getString("itemname"));
                System.out.print(" ");
                System.out.print(res.getString("quantity"));
                array.add(res.getString("itemname"));
            }
            System.out.println("All records have been selected");
            return array;
        } catch (Exception e) {
            System.out.println(e);
        }
        return array;
    }

    public void insert(String fullname, String itemname, int quantity, double price) throws Exception {
        try {
            Connection con = getConnection();
            PreparedStatement insert = con.prepareStatement("INSERT INTO supermarket(name,itemname,quantity,price) VALUES('" + fullname + "','" + itemname + "','" + quantity + "','" + price + "')");
            insert.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Customer entry added");
        }
    }

    public void createTable() throws Exception {
        try {
            Connection con = getConnection();
            PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS supermarket(id int NOT NULL AUTO_INCREMENT, name varchar(255) , itemname varchar(255), quantity varchar(255), price varchar(255), PRIMARY KEY(id))");
            create.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Table has been completed");
        }
    }

    public Connection getConnection() throws Exception {
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://127.0.0.1:3306/store";
            String username = "root";
            String password = "password";
            Class.forName(driver);

            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("connected");
            return con;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
